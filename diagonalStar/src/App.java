public class App {
    public static void main(String[] args) throws Exception {
        printSquareStar(56);
    }
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
            return;
        }
        
        for(int row=1; row<=number; row++){
            for(int column=1; column<number; column++){
                if(row==1 || column ==1 || row == number || row == column || column == (number - row) + 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if(column==number-1){
                    System.out.println("*");
                }
            }
        }
    }
}
