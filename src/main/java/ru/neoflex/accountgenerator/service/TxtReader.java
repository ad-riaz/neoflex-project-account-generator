package ru.neoflex.accountgenerator.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TxtReader {

    public List<String> read(String filename) {
        BufferedReader bufferedReader = null;
        List<String> lines = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = (String) bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return lines;
    }
}
