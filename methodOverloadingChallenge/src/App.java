public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(convertToCentimeters(12));
        System.out.println(convertToCentimeters(1,0));
        System.out.println(convertToCentimeters(5,8));
        System.out.println(convertToCentimeters(68));
    }
    // 1 inch is 2.54cm
    public static double convertToCentimeters(int inches){
            return inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches){
        return convertToCentimeters((feet * 12) + inches);
    }
}
