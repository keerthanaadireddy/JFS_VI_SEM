package com.skillnext2_db;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n===== Student Database Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Branch");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Branch: ");
                    String branch = sc.nextLine();

                    Student s = new Student(name, email, branch);

                    if (dao.addStudent(s))
                        System.out.println("Student added successfully.");
                    else
                        System.out.println("Failed to add student.");

                    break;

                case 2:
                    List<Student> list = dao.getStudents();
                    System.out.println("\nID | Name | Email | Branch");
                    System.out.println("---------------------------------");
                    for (Student st : list)
                        System.out.println(st);
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int idUpdate = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Branch: ");
                    String newBranch = sc.nextLine();

                    if (dao.updateBranch(idUpdate, newBranch))
                        System.out.println("Branch updated.");
                    else
                        System.out.println("Update failed.");
                    break;

                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int idDelete = sc.nextInt();

                    if (dao.deleteStudent(idDelete))
                        System.out.println("Student deleted.");
                    else
                        System.out.println("Delete failed.");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
