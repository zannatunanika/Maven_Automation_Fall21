package Day2_120521;

public class WhileLoppWithArray {

    public static void main(String[] args) {

        //iterate through all boroughs defined by dynamic array using for loop
        String[] boroughs = new String[6];
        boroughs[0] = "Brooklyn";
        boroughs[1] = "Queens";
        boroughs[2] = "Manhattan";
        boroughs[3] = "Bronx";
        boroughs[4] = "Staten";
        boroughs[5] = "LI";

        //declare and define the initial starting point
        int i = 0;
        //define while loop with your end point(condition)
        while (i<boroughs.length) {
          System.out.println("My current borough is " + boroughs[i]);
          i = i+1; //if there iis no incrementation, while loop becomes infinite loop
        }//end of while loop

    }//end of main
}//end of java class
