package org.example;

import org.example.enums.Gender;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            JavaClass javaClass = new JavaClass();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the teachers Stack: ");
            String teacherStack = sc.nextLine();

            System.out.print("Enter the teachers name: ");
            String teacherName = sc.nextLine();

            System.out.print("Enter the Projector Name: ");
            String projectorName = sc.nextLine();

            System.out.print("Enter the number of Computers: ");
            int noOfComputer = sc.nextInt();

        System.out.print("Enter the number of Tables: ");
        int noOfTables = sc.nextInt();

        System.out.print("Enter the number of Board: ");
        int noOfBoard = sc.nextInt();

        System.out.print("Enter the number of Chairs: ");
        int noOfChairs = sc.nextInt();

        System.out.print("Enter the number of Students: ");
        int noOfStudents = sc.nextInt();

        System.out.print("Enter the number of fans: ");
        int noOfFans = sc.nextInt();

        System.out.println("Enter the gender: (m or M) for Male (f or F) for female otherwise will set default Male:");
        String gender = sc.next();

            if(gender.equals("m") || gender.equals("M")){
                gender = String.valueOf(Gender.MALE);
            }else if(gender.equals("f") || gender.equals("F")){
                gender = String.valueOf(Gender.FEMALE);
            }
            else {
                gender = String.valueOf(Gender.MALE);
            }

        System.out.print("Is Initellij Idea installed? ");
        boolean isInstalled = sc.nextBoolean();

            javaClass.setTeacherStack(teacherStack);
            javaClass.setNameOfTeacher(teacherName);
            javaClass.setIntellij(isInstalled);
            javaClass.setProjectorName(projectorName);
            javaClass.setNoOfTables(noOfTables);
            javaClass.setNoOfBoard(noOfBoard);
            javaClass.setGenderOfTeacher(Gender.valueOf(gender));
            javaClass.setNoOfComputer(noOfComputer);
            javaClass.setNoOfStudents(noOfStudents);
            javaClass.setNoOfChairs(noOfChairs);
            javaClass.setNoOfFans(noOfFans);

        System.out.println(javaClass);
    }
}