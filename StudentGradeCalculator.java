import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        double[] grades = new double[numOfSubjects];

        for (int i = 0; i < numOfSubjects; i++) {
            System.out.println("Enter the grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        double totalGrade = 0;
        for (double grade : grades) {
            totalGrade += grade;
        }

        double averageGrade = totalGrade / numOfSubjects;

        System.out.println("The average grade is: " + averageGrade);
        scanner.close();
    }
}