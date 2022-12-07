import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String result = calc(text);
        System.out.println(result);
    }

    public static String calc(String input) {
        String[] nums = input.split(" ");
        String resultString;
        if (nums.length > 3) {
            throw new RuntimeException();
        }
        int result = 0;
        String romeResult = null;
        try {
            int num1 = Integer.parseInt(nums[0]);
            int num2 = Integer.parseInt(nums[2]);
            checkTen(num1);
            checkTen(num2);
            switch (nums[1]) {
                case "+":
                    result = ArabicCalculator.sum(num1, num2);
                    break;
                case "-":
                    result = ArabicCalculator.min(num1, num2);
                    break;
                case "*":
                    result = ArabicCalculator.mul(num1, num2);
                    break;
                case "/":
                    result = ArabicCalculator.div(num1, num2);
                    break;
            }
            resultString = String.valueOf(result);
        } catch (Exception e) {
            String num1 = nums[0];
            String num2 = nums[2];
            switch (nums[1]) {
                case "+":
                    romeResult = RomeCalculator.sum(num1, num2);
                    break;
                case "-":
                    romeResult = RomeCalculator.min(num1, num2);
                    break;
                case "*":
                    romeResult = RomeCalculator.mul(num1, num2);
                    break;
                case "/":
                    romeResult = RomeCalculator.div(num1, num2);
                    break;
            }
            resultString = romeResult;
        }
        return resultString;
    }

    public static void checkTen(int num) {
        if (num > 10 || num < 1) {
            throw new RuntimeException();
        }
    }

}