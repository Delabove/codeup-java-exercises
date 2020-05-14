package grades;

import oop.Person;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userInput;



        HashMap<String, Student> students = new HashMap();


        Student bif = new Student("DeLayne");

        bif.addGrade(90);
        bif.addGrade(95);
        bif.addGrade(92);

        Student packer = new Student("Jacques");

        packer.addGrade(91);
        packer.addGrade(98);
        packer.addGrade(99);

        Student opdiamond = new Student("Grayson");

        opdiamond.addGrade(97);
        opdiamond.addGrade(99);
        opdiamond.addGrade(99);

        Student bigcountry = new Student("Jade");

        bigcountry.addGrade(92);
        bigcountry.addGrade(93);
        bigcountry.addGrade(94);

        students.put(bif.getName(), bif);
        students.put(packer.getName(), packer);
        students.put(opdiamond.getName(), opdiamond);
        students.put(bigcountry.getName(), bigcountry);


        System.out.println("Welcome!");

        System.out.println("Here are the GitHub usernames of our students:");

        int i = 1;
        System.out.print("|");
        for (String username : students.keySet()) {
            System.out.printf(" %d. %s |", i, username);
            i++;
        }

        System.out.println("\nWhat student would you like to see more information on? " +
                "\nEnter username, 'all' for all grades, 'overall' for" +
                "\n overall grade, or 'csv' for the CSV report: ");

    }
    public static void printAllGrades(HashMap<String, Student> students) {
        System.out.printf("%-25s %s\n", "Student Name", "Grades");
        for (Student student : students.values()) {
            System.out.printf("%-25s %s\n", student.getName(), student.getGrades());
        }
    }


    }

