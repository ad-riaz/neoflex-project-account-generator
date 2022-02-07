package ru.neoflex.accountgenerator.service;

import org.springframework.stereotype.Service;
import ru.neoflex.accountgenerator.model.Sex;

import java.util.List;
import java.util.Random;

@Service
public class DataRandomGenerator {
    private final static String mensFirstNameFile = "src\\main\\resources\\clientsData\\MansFirstNames.txt";
    private final static String mensMiddleNameFile = "src\\main\\resources\\clientsData\\MansMiddleNames.txt";
    private final static String mensLastNameFile = "src\\main\\resources\\clientsData\\MansSurnames.txt";
    private final static String womenFirstNameFile = "src\\main\\resources\\clientsData\\WomansFirstNames.txt";
    private final static String womenMiddleNameFile = "src\\main\\resources\\clientsData\\WomansMiddleNames.txt";
    private final static String womenLastNameFile = "src\\main\\resources\\clientsData\\WomansMiddleNames.txt";

    private String readRandomNameFromFile(String filename) {
        TxtReader txtReader = new TxtReader();
        List<String> names = txtReader.read(filename);

        Random random = new Random();
        int min = 0;
        int max = names.size() - 1;

        return names.get(random.nextInt(max - min) + min);
    }

    private long getRandomInt(int length) {
        Random random = new Random();
        int min = (int) Math.pow(10, length - 1);
        int max = (int) Math.pow(10, length) - 1;
        return random.nextInt(max - min) + min;
    }

    public String getRandomFullName(Sex sex) {
        String name = "";

        switch (sex) {
            case FEMALE:
                name += readRandomNameFromFile(womenFirstNameFile) + " " +
                        readRandomNameFromFile(womenMiddleNameFile) + " " +
                        readRandomNameFromFile(womenLastNameFile);
                break;
            case MALE:
                name += readRandomNameFromFile(mensFirstNameFile) + " " +
                        readRandomNameFromFile(mensMiddleNameFile) + " " +
                        readRandomNameFromFile(mensLastNameFile);
                break;
        }

        return name;
    }

    public int getRandomAccountNumber() {
        return (int) getRandomInt(8);
    }

    public Sex getRandomSex() {
        int variant = new Random().nextInt(2);
        Sex sex = null;

        switch (variant) {
            case 0:
                sex = Sex.MALE;
                break;
            case 1:
                sex = Sex.FEMALE;
                break;
        }

        return sex;
    }
}
