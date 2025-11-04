import java.util.ArrayList;
import java.util.Scanner;

public class SumUsingAutoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter integers separated by space:");
        String[] inputs = sc.nextLine().split(" ");
        
        // Parsing string inputs and autoboxing into ArrayList<Integer>
        for (String s : inputs) {
            int num = Integer.parseInt(s);  // string parsing
            numbers.add(num);               // autoboxing
        }
        
        // Calculating sum using unboxing
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;                     // unboxing
        }
        
        System.out.println("Sum of integers: " + sum);
        sc.close();
    }
}
