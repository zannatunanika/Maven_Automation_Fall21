package ActionItem;

public class AC_MultipleConditions {
    public static void main(String[] args) {

        int grade = 50;


      //verify
        if (grade >= 90 && grade < 100){
            System.out.println("Grade is A ");
        } else if (grade >= 80 && grade < 90){
            System.out.println("Grade is B ");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("Grade is C ");
        } else if (grade >= 60 && grade < 70){
            System.out.println("My grade is D ");
        } else {
            System.out.println("My grade is F ");
        }//end of else if


    }//end of main
}//end of java class
