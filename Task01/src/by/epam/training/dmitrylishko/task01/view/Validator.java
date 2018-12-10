package by.epam.training.dmitrylishko.task01.view;

public class Validator {
    public double [] read(String... lines) {
        for (String line : lines) {
            String[] variables = parseLine(line,4);

        }
        return new double[0];
    }

    private String[] parseLine (String string, int amountOfVariables) {
        String spliter = " ";
        return string.split(spliter,amountOfVariables);
    }
}
