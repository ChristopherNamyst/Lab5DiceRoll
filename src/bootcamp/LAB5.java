
////////////////////////////LAB5 ROLLING THE DICE///////////////////////////////////
                //This program simulates rolling a pair of dice.
                //The number that comes up on each die is output,
                //followed by the total of the two dice
package bootcamp;

import java.util.Scanner;
    public class LAB5 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int sides;
            String answer = "";

                // Greetings to the user
            System.out.println("G'Day, Welcome to Christophers' new game called Rolling the Dice!");
            System.out.println("");

                // ask user how many sides are on the dice
            do {
                System.out.println("Please enter the number of sides your dice will have: ");
                sides = scan.nextInt();

                // Compute and display results
                System.out.println("Your results are: " + RollDice(sides));
                System.out.println("and..." + RollDice(sides));
                // ask user to continue
                System.out.println("Would you like to Continue? y/n");
                answer = scan.next();
            } while (answer.equals("y"));
        }

        public static int RollDice ( int sides){
            return (int) (Math.random() * sides) + 1;
        }

    }