package com.xhj.pattern.builder.computer;

/**
 * @author jack xu
 */
public class ComputerBuilder {

    private Computer computer = new Computer();

    public ComputerBuilder setCPU(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setRAM(String ram) {
        computer.setRam(ram);
        return this;
    }

    public ComputerBuilder setUsbCount(int usbCount) {
        computer.setUsbCount(usbCount);
        return this;
    }

    public ComputerBuilder setKeyboard(String keyboard) {
        computer.setKeyboard(keyboard);
        return this;
    }

    public ComputerBuilder setDisplay(String display) {
        computer.setDisplay(display);
        return this;
    }

    public Computer build() {
        return this.computer;
    }

}