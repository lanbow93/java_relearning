public class Challenge {
    public static void main(String[] args) throws Exception {
        double myDoubleValue = 21.00d;
        double secondDoubleValue = 80.00d;

        double sumThenMultipliedOfNumbers = (myDoubleValue + secondDoubleValue) * 100;
        System.out.println( "sumThenMultipliedOfNumbers " + sumThenMultipliedOfNumbers);

        double remainderValue = sumThenMultipliedOfNumbers % 40.00;

        boolean isEvenDivision = remainderValue == 0;
        
        System.out.println(isEvenDivision);

        if(isEvenDivision == false){
            System.out.println("got some remainder");
        }
    }
}
