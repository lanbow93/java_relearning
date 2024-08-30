public class App {
    public static void main(String[] args) throws Exception {
        printEvens(5, 20);
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
    
    public static void printEvens(int start, int end){
        int currentNumber = start;

        while(currentNumber <= end){
            if(isEvenNumber(currentNumber)){
                System.out.println("The number " + currentNumber + " is even.");
            }
            currentNumber++;
        }
    }
}
