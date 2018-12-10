package by.epam.training.dmitrylishko.task01.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Read {
    public static String[] readFromFile() {
        String fileName = ".\\resources\\input.txt";
        List<String> list = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

            list = br.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] array=new String[list.size()];
        return list.toArray(array);
    }
}
