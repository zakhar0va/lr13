package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        System.out.println("задание 1");
        String name = "Я";
        System.out.println("Hello, " + name);

        System.out.println("задание 2");
        Tester tester1 = new Tester("я", "такая-то", 5, "средний", 50000.0);
        Tester tester2 = new Tester("ты", "такая-то", 3, "плачевный");

        tester1.introduce();
        tester2.introduce("гугле");
        tester1.introduce("привэт", "телеграмм");

        // Вызов статического метода
        Tester.printInfo(tester1);
        Tester.printInfo(tester2);
    }
}
