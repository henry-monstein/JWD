package by.epam.training.dmitrylishko.task01.view;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class PrinterTest {
    @Test
    public void test() {
        String[] message = {"Test print to file"};
        Printer printer = new Printer();
        Read read = new Read();
        printer.printToFile(message);
        assertEquals(read.readFromFile(Printer.DEFAULT_FIlE_NAME),message);
    }
}
