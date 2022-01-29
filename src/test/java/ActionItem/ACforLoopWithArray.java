package ActionItem;

public class ACforLoopWithArray {
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



        for (int i = 0;i<Zipcodes.length;i++) {
            //print statement
            System.out.println("My current Zipcode is " + Zipcodes[i]  +  " My streetNumber is " + streetNumber[i]);
        }//end of loop
    }//end of main
}//end of java class
