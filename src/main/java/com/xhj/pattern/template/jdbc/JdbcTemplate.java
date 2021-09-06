package com.xhj.pattern.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public final List<?> executeQuery(String sql, Object[] values) {
        try {
            //1、获取连接
            Connection conn = this.getConnection();
            //2、创建语句集
            PreparedStatement pre = this.createPrepareStatement(conn, sql);
            //3、执行语句集
            ResultSet rs = this.executeQuery(pre, values);
            //4、处理结果集
            List<Object> result = new ArrayList<>();
            while (rs.next()) {
                result.add(rowMapper(rs));
            }
            //5、关闭结果集
            rs.close();
            //6、关闭语句集
            pre.close();
            //7、关闭连接
            conn.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //实现
    protected abstract Object rowMapper(ResultSet rs) throws SQLException;


    //这个是不让重写的
    private ResultSet executeQuery(PreparedStatement pre, Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            pre.setObject(i, values[i]);
        }
        return pre.executeQuery();
    }


    //这个是不让重写的
    private PreparedStatement createPrepareStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }


    //这个是不让重写的
    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

}
