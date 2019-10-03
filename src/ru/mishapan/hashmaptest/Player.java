package ru.mishapan.hashmaptest;


public class Player {

    private String name;
    private String surname;
    private int number;

    Player(String surname, String name, int number) {
        setSurname(surname);
        setName(name);
        setNumber(number);
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return getSurname() + " " + getName()  + " " + getNumber();
    }
}
