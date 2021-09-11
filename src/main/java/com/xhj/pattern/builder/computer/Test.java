package com.xhj.pattern.builder.computer;

public class Test {

    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                .setCPU("因特尔")
                .setRAM("三星")
                .setDisplay("三星24寸")
                .setKeyboard("罗技")
                .setUsbCount(2)
                .build();
        System.out.println(computer);
    }

}