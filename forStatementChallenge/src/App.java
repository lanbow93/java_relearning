public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number.");
        // System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number.");
        // System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number.");
        // System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number.");
        // System.out.println("15 is " + (isPrime(15) ? "" : "NOT ") + "a prime number.");
        // System.out.println("16 is " + (isPrime(16) ? "" : "NOT ") + "a prime number.");
        countPrimes(50);
    }
    
    public static boolean isPrime(int number){
        if(number <= 2){
            return number == 2;
        }
        for (int divisor = 2; divisor <= (number/2) ; divisor++){
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }
    
    public static int countPrimes(int number){
        if(number > 1000){
            return -1;
        }
        int primeCount = 0;

        for (int i = 2; i <= number; i++){
            if(isPrime(i)){
                System.out.println(i + " is prime!");
                primeCount++;
                if(primeCount == 3){
                    break;
                }
            }
        }


        return primeCount;


    }
}
