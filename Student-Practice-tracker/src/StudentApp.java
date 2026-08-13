import java.util.Scanner;

public class StudentApp {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        Student obj=new Student();
        System.out.println("=====================================");
        System.out.println("     STUDENT PRACTICE TRACKER       ");
        System.out.println("=====================================");
    
        System.out.println("Enter Student Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Course Name: ");
        String courseName=sc.nextLine();
        System.out.println("Enter Completed Topics: ");
        int completedTopics=sc.nextInt();
        System.out.println("Enter Questions Solved: ");
        int questionsSolved=sc.nextInt();
      
        obj.setDetails(name, courseName);
        obj.setProgress(completedTopics, questionsSolved);
        System.out.println("============================");
        System.out.println("           MENU             ");
        System.out.println("============================");
        System.out.println();

        System.out.println("1. View Student Details");
        System.out.println("2. View Progress");
        System.out.println("3. Add Completed Topics");
        System.out.println("4. Add Solved Questions");
        System.out.println("5. Exit");
        System.out.println("Enter Your Choice: ");
        int choice=sc.nextInt();
        
    while(choice != 5 ){

        if(choice ==1){
            obj.displayDetails();
            System.out.println("============================");
            System.out.println("           MENU");
            System.out.println("============================");
            System.out.println("Enter Your Choice: ");
            choice=sc.nextInt();
        }
        else if(choice==2){
            obj.displayProgress();
            System.out.println("============================");
            System.out.println("           MENU             ");
            System.out.println("============================");
            System.out.println("Enter Your Choice: ");
            choice=sc.nextInt();
        }
        else if(choice==3){
                System.out.println("Enter New Completed Topics: ");
                int newlyCompletedTopics =sc.nextInt();
                obj.addTopics(newlyCompletedTopics);
                System.out.println("Topics updated successfully.");
                System.out.println("Total Completed Topics : " + obj.completedTopics);
                System.out.println("============================");
                System.out.println("           MENU             ");
                System.out.println("============================");
                System.out.println("Enter Your Choice: ");
                choice=sc.nextInt();

        }
        else if (choice == 4) {
                System.out.println("Enter New Questions Solved:");
                int newQueSolved= sc.nextInt();

                obj.addQuestions(newQueSolved);
                System.out.println("Questions updated successfully.");
                System.out.println("Total Questions Solved : " + obj.questionsSolved);
                System.out.println("============================");
                System.out.println("           MENU");
                System.out.println("============================");
                System.out.println("Enter Your Choice: ");
                choice=sc.nextInt();
        }
    else {
        System.out.println("Invalid choice.");
        System.out.println("Please enter a value between 1 and 5.");
        System.out.println("============================");
        System.out.println("           MENU             ");
        System.out.println("============================");
        System.out.println("Enter Your Choice: ");
        choice=sc.nextInt();
    }
        }
                
        System.out.println("Thank you for using Student Practice Tracker.");
        System.out.println("Keep Practicing!");
        sc.close();

    }
    
}
