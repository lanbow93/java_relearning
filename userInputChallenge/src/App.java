import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        sumOfFive();
    }

    public static void sumOfFive(){
        Scanner scanner = new Scanner(System.in);
        int intCount = 1;
        int currentTotal= 0;

        while(intCount <= 5){
            System.out.println("Enter number #" + intCount + ":");
        
            try {
                currentTotal += Integer.parseInt(scanner.nextLine());
                intCount++;
                
            } catch (NumberFormatException e) {
                System.out.print( e  + " is not a valid Integer. Press enter to continue");
                scanner.nextLine();
            }
        }

        System.out.println("Final Total: " + currentTotal);
        scanner.close();
    }

    
}
