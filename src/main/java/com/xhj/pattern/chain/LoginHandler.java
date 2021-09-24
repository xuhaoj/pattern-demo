package com.xhj.pattern.chain;


import com.xhj.pattern.template.jdbc.Member;


public class LoginHandler extends Handler {

    @Override
    public void doHandler(Member member) {
        if (!"jack".equals(member.getUsername()) || !"666".equals(member.getPassword())) {
            System.out.println("用户名密码不正确");
            return;
        }
        if (null != next) {
            next.doHandler(member);
        }
    }

}