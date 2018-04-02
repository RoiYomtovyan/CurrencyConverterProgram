import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // this array is defined to collect the user conversion results

        ArrayList <Double> conversionResults = new ArrayList<>();

// will show the welcome page

        WelcomePage.welcome();
// this loop is defined in order to run the program more than once in case the user select to convert more than once
// its initialize with 1 and while its value is 1 it will continue . the exit point is if the user select other number than 1
        int initialization =1;
        while (initialization ==1) {

// first screen that show the user the option tp select what to convert
            Scanner input1 = new Scanner(System.in);
            double userSelectionConvert;
            System.out.print("Please choose an option (1/2):”\n" +
                    "1. Dollars to Shekels”\n" +
                    "2. Shekels to Dollars” \n ");
            userSelectionConvert = input1.nextInt();

 // second screen that asks the user to define the amount to convert

            Scanner input2 = new Scanner(System.in);
            double amountToConvert =0.0 ;
            System.out.println("Please enter an amount to convert”\n ");
            try {
                amountToConvert = input2.nextDouble();
            } catch (InputMismatchException e) {
                //e.printStackTrace();
                System.out.println("please enter number!");
                }

// this statement is defined to define which kind of conversion to do according to user input of  UserSelectionConvert
            // in this case the user select to convert dollars to shekels
            if (userSelectionConvert == 1) {
                // the calculation dollars to shekels and its print- it get the currency from  ILS class
                double conversionResult = amountToConvert / ILS.value;
                System.out.println(conversionResult );
                // Put the value of the calculation in the conversionResults Arraylist
                conversionResults.add(conversionResult);
                Scanner input3 = new Scanner(System.in);
                // ask the user if to create another conversion
                System.out.println("press 1 to create new conversion or other number to exit");
                try {
                    initialization = input3.nextInt();
                } catch (InputMismatchException e){
                   // e.printStackTrace();
                    System.out.println("please enter 1 or other number only!!");
                }


                // in this case the user select to convert shekels to dollars
            } else if (userSelectionConvert == 2) {
                // the calculation shekels to dollars and its print -it get the currency from USD class
                double conversionResult = amountToConvert * USD.value;
                System.out.println(conversionResult);
                // Put the value of the calculation in the conversionResults Arraylist
                conversionResults.add(conversionResult);
                Scanner input4 = new Scanner(System.in);
                // ask the user if to create another conversion
                System.out.println("press 1 to create new conversion  or other number to exit ");
                try {
                    initialization = input4.nextInt();
                }catch (InputMismatchException e){
                    //e.printStackTrace();
                    System.out.println("please enter 1 or other number only!");
                }
            }

        }

                 System.out.println("Thanks for using our currency converter" + " " + "here is your calculation results:");
        // prints the conversion results from the array list
                 for (int i=0 ; i<conversionResults.size();i++){

                 System.out.println(conversionResults.get(i));
        }

                
            





    }
}
