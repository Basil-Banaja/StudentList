/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        //comment

        System.out.println("Enter the number of students to add:");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter name for student " + (i + 1) + ":");
            String name = scanner.nextLine();

            System.out.println("Enter ID for student " + (i + 1) + ":");
            String id = scanner.nextLine();

            manager.addStudent(new Student(name, id));
        }

        System.out.println("\nList of Students:");
        manager.listStudents();

        scanner.close();
        System.out.println("Thank you");
    }
}
