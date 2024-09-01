public class App {
    public static void main(String[] args) throws Exception {
        numberToWords(100);
        // numberToWords(501);
    }

    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }

        int digitCount = getDigitCount(number);
        int digitsReversed = reverse(number);

        for(int i=0; i<digitCount; i++){
            int currentDigit = digitsReversed % 10 ;
            String readout;

            switch(currentDigit){
                case 0:
                    readout = "Zero";
                    break;
                case 1:
                    readout = "One";
                    break;
                case 2:
                    readout = "Two";
                    break;
                case 3:
                    readout = "Three";
                    break;
                case 4:
                    readout = "Four";
                    break;
                case 5:
                    readout = "Five";
                    break;
                case 6:
                    readout = "Six";
                    break;
                case 7:
                    readout = "Seven";
                    break;
                case 8:
                    readout = "Eight";
                    break;
                case 9:
                    readout = "Nine";
                    break;
                default:
                    readout = "Invalid Value";
            }
            System.out.println("Current Readout: " + readout);
            digitsReversed /= 10;
        }
    }

    public static int reverse(int number){
        if(number / 10 == 0){
            return number;
        }

        int reversedNumber = 0;

        while(number != 0){
        reversedNumber += number % 10;

        if(number / 10 != 0){
            reversedNumber *= 10;
        }
        number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number){
    
        if(number < 0){
        return -1;
        }

        if(number / 10 == 0){
        return 1;
        }

        int digitCount = 0;

        while(number > 0){
            digitCount++;
            number /= 10;
        }
        
        return digitCount;
    }
}

