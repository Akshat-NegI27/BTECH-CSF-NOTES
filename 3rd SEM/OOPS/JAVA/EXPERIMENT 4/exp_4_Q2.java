import java.util.Scanner;
class ExamResults 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 1; i <= numStudents; i++) 
        {
            System.out.println("\nStudent " + i + " Details:");
            System.out.print("Enter Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.print("Enter Physics Marks: ");
            int physicsMarks = scanner.nextInt();
            System.out.print("Enter Chemistry Marks: ");
            int chemistryMarks = scanner.nextInt();
            System.out.print("Enter Math Marks: ");
            int mathMarks = scanner.nextInt();

            double totalMarks = physicsMarks + chemistryMarks + mathMarks;
            double agrPer = (totalMarks / 300) * 100;

            System.out.println("\nStudent Roll Number: " + rollNumber);
            System.out.println("Physics Marks: " + physicsMarks);
            System.out.println("Chemistry Marks: " + chemistryMarks);
            System.out.println("Math Marks: " + mathMarks);

            if (physicsMarks < 40 || chemistryMarks < 40 || mathMarks < 40) 
            {
                System.out.println("Result: Fail");
            } 
            else 
            {
                System.out.println("Result: Pass");

                if (agrPer > 75) 
                {
                    System.out.println("Division: Distinction");
                } 
                else if (agrPer >= 60) 
                {
                    System.out.println("Division: First Division");
                } 
                else if (agrPer >= 50) 
                {
                    System.out.println("Division: Second Division");
                } 
                else if (agrPer >= 40) 
                {
                    System.out.println("Division: Third Division");
                }
            }
        }
        scanner.close();
    }
}