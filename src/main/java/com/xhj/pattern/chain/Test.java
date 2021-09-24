package com.xhj.pattern.chain;


import com.xhj.pattern.template.jdbc.Member;

public class Test {

    public static void main(String[] args) {
        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler())
                .addHandler(new BusinessLogicHandler());
        Member member = new Member();
        member.setUsername("aaa");
        member.setPassword("bbb");
        builder.build().doHandler(member);
    }

}