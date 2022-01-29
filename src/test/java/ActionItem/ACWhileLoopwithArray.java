package ActionItem;

public class ACWhileLoopwithArray {
    public static void main(String[] args) {
        //all zipcodes defined by dynamic array using loop
        String [] Zipcodes = new String[4];
        Zipcodes[0] = "10034";
        Zipcodes[1] = "11005";
        Zipcodes[2] = "10314";
        Zipcodes[3] = "11218";
        //integer dynamic array
        int[] streetNumber = new int[4];
        streetNumber[0] = 555;
        streetNumber[1] = 989;
        streetNumber[2] = 785;
        streetNumber[3] = 224;

        //declare and define the initial starting point
        int i = 0;

        //define while loop with your end point(condition)
        while (i<Zipcodes.length) {
          System.out.println("My current Zipcodes is " + Zipcodes[i] + " My current streetNumber is " + streetNumber[i]);
          i = i+1; // if there iis no incrementation, while loop becomes infinite loop
        }//end of while loop


    }//end of main
}//end of java class
