package com.xhj.pattern.chain;

import com.xhj.pattern.template.jdbc.Member;

public class BusinessLogicHandler extends Handler {

    @Override
    public void doHandler(Member member) {
        System.out.println("执行业务逻辑。。");
    }

}