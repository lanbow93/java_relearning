import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter any number or another character to quit");
       boolean flag = true;
       double largestNum = Double.MIN_VALUE;
       double smallestNum = Double.MAX_VALUE;
       while (flag) { 
            try{
                if(largestNum != Double.MIN_VALUE){
                    System.out.println("Min: " + smallestNum + " Max: " + largestNum);
                }
                System.out.println("Enter Valid Number:");
                Double userInput = scanner.nextDouble(); //Double.parseDouble(scanner.nextLine());
                if(userInput > largestNum){
                    largestNum = userInput;
                }
                if(userInput < smallestNum){
                    smallestNum = userInput;
                }
            }catch(InputMismatchException e){
                flag = false;
                scanner.close();
            } 
       }
    }
}
