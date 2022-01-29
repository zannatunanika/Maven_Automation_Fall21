package ActionItem;

public class AC_WhileLoop2 {
    public static void main(String[] args) {

        //iterate through all boroughs defined by dynamic array using for loop
        String[] states = new String[4];
        states[0] = "New York";
        states[1] = "California";
        states[2] = "New Jersey";
        states[3] = "Ohio";

        //declare and define the initial starting point
        int i = 0;
        //define while loop with your end point(condition)
        while (i<states.length) {
            System.out.println("My current state is " + states[0]  + " or " + states[1]);
            i = i + 1; //if there iis no incrementation, while loop becomes infinite loop
        }//end of while loop

    }//end of main
}//end of java
