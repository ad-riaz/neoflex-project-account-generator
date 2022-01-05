package ru.neoflex.accountgenerator.model;

public enum Sex {
    MALE("MALE"),
    FEMALE("FEMALE");

    private String sex;

    Sex(String sex){
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "{Sex='" + sex + '\'' +
                '}';
    }
}
