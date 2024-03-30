package com.mycompany.app;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    // Перегруженные конструкторы
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0); // вызываем другой конструктор
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "новичок"); // вызываем другой конструктор
    }

    // Перегруженные методы
    public void introduce() {
        System.out.println("меня зовут " + name + " " + surname);
    }

    public void introduce(String companyName) {
        System.out.println("работаю в " + companyName + " а зовут меня " + name + " " + surname);
    }

    public void introduce(String greeting, String companyName) {
        System.out.println(greeting + ", я работаю в  " + companyName + " а зовут меня " + name + " " + surname);
    }

    // Статический метод
    public static void printInfo(Tester tester) {
        System.out.println("имя: " + tester.name);
        System.out.println("фамилия: " + tester.surname);
        System.out.println("опыт: " + tester.experienceInYears);
        System.out.println("уровень англа: " + tester.englishLevel);
        System.out.println("зп: " + tester.salary);
    }
}