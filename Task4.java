public class Task4 {
    public static void main(String[] args) {
        int n = 345;
        int firstNumber = n / 100;
        int remainder = n % 100;
        int secondNumber = remainder / 10;
        int thirdNumber = remainder % 10;

        System.out.println("The sum is " + (firstNumber + secondNumber + thirdNumber));
    }
}
