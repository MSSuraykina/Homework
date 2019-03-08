package homework.lesson12_13.com.company;

import homework.lesson12_13.com.company.emulator.Emulator;

public class Launcher extends Emulator{
    public static void main(String[] args) throws Exception {

        Emulator emu = new Emulator().runGameLoop();
    }
}
