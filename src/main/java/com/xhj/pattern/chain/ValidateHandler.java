package com.xhj.pattern.chain;


import com.xhj.pattern.template.jdbc.Member;
import org.apache.commons.lang3.StringUtils;

public class ValidateHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if (StringUtils.isEmpty(member.getUsername()) ||
                StringUtils.isEmpty(member.getPassword())) {
            System.out.println("用户名和密码不能为空");
            return;
        }
        if (null != next) {
            next.doHandler(member);
        }
    }
}
