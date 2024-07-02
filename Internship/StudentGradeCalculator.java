import java.util.*;

public class StudentGradeCalculator {

    StudentGradeCalculator() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number of Subject: ");
        int numberOfSubjects = sc.nextInt();

        int[] marks = new int[numberOfSubjects];

        int totalMarks = 0, f = 0;

        for(int i=0, value;i < numberOfSubjects;i++) {

            System.out.print("Enter The Marks Obtained Out of 100 in Subject " +(i+1) + ": ");

            value = sc.nextInt();
            
            if(value <= 100) {

                //To Store Subject Marks in an Array
                marks[i] = value;

                //Calculate Total Marks
                totalMarks += marks[i];

            } else {

                System.out.println("\t\n Please Enter The Valid Marks \t\n");
                i--;

            }

            //if you get less than 30 marks in any subject then you will fail in that subject
            if(value < 30) {
                f = i+1;
            }

        } //for loop closed

        sc.close();

        //Calculate Average of Percentage
        float averagePercentage = (float) totalMarks / numberOfSubjects;
        String grade;

        switch((int)(averagePercentage / 10)) {

            case 9, 10 :
                grade = "A++";break;
            case 7, 8 :
                grade = "A+";break;
            case 6 :
                grade = "A";break;
            case 4, 5 :
                grade = "B";break;
            case 3 :
                grade = "C";break;
            default :
                grade = "Fail";break;

        } //switch closed

        System.out.println("Total Marks: " + totalMarks + "/" + numberOfSubjects * 100);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade = " + grade);

        //if you get less than 30 marks in any subject then you will fail in that subject
        if(f != 0) {
            System.out.println("You are Fail in Subject " + f);
        }

    } //constructor closed

    public static void main(String args[]) {

        new StudentGradeCalculator();

    }

}