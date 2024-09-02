public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }
        int largestPrimeNumber = -1;
        for(int i = number; i > 0 ; i--){
            if(largestPrimeNumber > 0){
                break;
            }
            if(number % i == 0){
                for(int j = 2; j <= i; j++){
                    System.out.println("j: " + j);
                    if( i == j ){
                        largestPrimeNumber = i;
                        break;
                    }
                    if(i % j == 0){
                        break;
                    }

                }
            }
        }
        return largestPrimeNumber;
        
    }
}
