public class App {
    public static void main(String[] args) throws Exception {
        int numCount = 0;
        int numSum = 0;
        
        for(int i=1; numCount<5; i++){
            if(i % 3 == 0 && i % 5 == 0){
                numSum += i;
                System.out.println(i + " meets the requirements. Current sum: " + numSum );
                numCount++;
            }
        }
        System.out.println("Final Sum: " + numSum);
    }
}
