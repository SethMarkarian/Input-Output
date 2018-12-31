import java.util.Scanner; //imports scanner
public class Calculator
{
    public static void main(String[] args) { //runs program
        Calculator calc = new Calculator(); //creates new calculator object
        calc.run(); //runs the calculator object
    }

    public void run() { //runs main calculator code
        Scanner reader = new Scanner(System.in); //creates new scanner for the input
        System.out.print("Number of arithmetic operations: "); //asks the user how many times the program should run
        int num_times = reader.nextInt(); //reads input
        for(int i = 0; i < num_times; i++) { //loops number of times user inputted
            try { //no errors
                System.out.print("First number: "); //asks user first number
                float num1 = reader.nextInt(); //scanner reads input
                System.out.print("Operand: "); //asks user what operation to use
                String operand = reader.next(); //scanner reads input
                if(!operand.equals("+") && !operand.equals("-") && !operand.equals("*") && !operand.equals("/")) { //checks to see if valid operator 
                    System.out.println("ERROR"); //prints error
                    run(); //restarts run() method
                }
                System.out.print("Second number: "); //asks user for second number
                float num2 = reader.nextInt(); //scanner reads input
                if(operand.equals("+")) { //checks to see if addition
                    System.out.println(num1 + num2); //applies addition to both numbers
                }
                else if(operand.equals("-")) { //checks to see if subtraction
                    System.out.println(num1 - num2); //applies subtraction to both numbers
                }
                else if(operand.equals("*")) { //checks to see if multiplication
                    System.out.println(num1 * num2); //applies multiplication to both numbers
                }
                else if(operand.equals("/")) { //checks to see if division
                    System.out.println(num1 / num2); //applies division to both numbers
                }
            }
            catch(Exception e) { //if error
                System.out.println("Error: " + e); //reads error
                run(); //restarts run() method
            }
        }
    }
}