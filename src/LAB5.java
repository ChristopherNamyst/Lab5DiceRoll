
////////////////////////////LAB5 ROLLING THE DICE/////////////////////////////////////////
import java.util.Scanner;
public class LAB5 {
    public static void main(String[] args) {
        //Greet User!!!
        System.out.println("Hello and Welcome to Chris' new game called Rolling the Dice! ");
        //1. Prompt user to enter the number of sides of the dice
        System.out.println("How many sides would you like your dice to have? ");
        //2. Get user input
        Scanner scan = new Scanner(System.in);

        int sides;
        sides = scan.nextInt(sides);
        //3. Prompt user to roll the dice

        System.out.println("To roll the dice please press any number: ");
        //4. Get user input

        scan.nextInt();


        //5. call the methods
        int result1 = diceRoll(sides);
        int result2 = diceRoll(sides);
        //6. Display results
        System.out.println("Your results are: " + result1 + " and " + result2);
        //7.

    }

    private static int diceRoll(int sides) {
        return 0;
    }

    public class RollTheDice {

    /*  This program simulates rolling a pair of dice.
        The number that comes up on each die is output,
        followed by the total of the two dice.
    */




            }  // end main()

        }  // end class



        //3. prompt user to roll the dice
        //4. get user input
        //5. perform the dice roll
        //6. display results
        //7. prompt user to continue
        //8. get user choice


