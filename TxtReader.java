import java.util.Scanner; //Imports scanner
import java.io.FileReader; //Imports FileReader
import java.io.PrintWriter; //Imports PrintWriter
import java.io.File; //Imports File
public class TxtReader 
{
    public static void main(String[] args) { //runs program
        TxtReader read = new TxtReader(); //creates new 
        read.run(args[0]); //calls run() and puts in name of txt file
    }

    public void run(String file) { //runs main TxtReader code
        try { //no errors
            Scanner reader = new Scanner(new FileReader(file)); //scanner scans line by line
            PrintWriter writer = new PrintWriter("output.txt"); //creates PrintWriter
            while(reader.hasNextLine()) { //loops until end of file
                Scanner reader2 = new Scanner(reader.nextLine()); //scanner scans word by word
                String longest = ""; //stores largest word in line
                int num_words = 0, num_letters = 0; //resets the number of words and letters for each line
                while(reader2.hasNext()) { //loops until end of line
                    num_words++; //counts number of words in each line
                    String next = reader2.next(); //checks and stores next word 
                    num_letters += next.length(); //counts number of letters in each line
                    if(next.length() > longest.length()) { //checks to see if current word is longer than longest word so far
                        longest = next; //replaces current word as longest word in line
                    }
                }
                writer.println("Words: " + num_words + " Letters: " + num_letters + " Longest: " + longest); //prints out results
                num_words = 0; //resets number of words for next line
                num_letters = 0; //resets number of letters for next line
            }
            writer.close(); //closes PrintWriter
        }
        catch (Exception e){ //if error
            System.out.println("Error" + e); //print out error
        }
    }
}