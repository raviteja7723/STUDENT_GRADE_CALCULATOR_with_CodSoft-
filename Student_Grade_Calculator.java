package Task2;

import java.util.Scanner;

public class Student_Grade_Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of subjects: ");
        int totalSubjects = scanner.nextInt();

        double totalMarks = 0;

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.println("Enter marks obtained in subject " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }

        double averagePercentage = totalMarks / (totalSubjects * 100);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage * 100 + "%");

        if (averagePercentage >= 90) {
            System.out.println("Grade: A");
        } else if (averagePercentage >= 80) {
            System.out.println("Grade: B");
        } else if (averagePercentage >= 70) {
            System.out.println("Grade: C");
        } else if (averagePercentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: p");
        }

        scanner.close();
    }
}
