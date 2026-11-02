import java.util.Scanner;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String a = scan.nextLine();
        scan.close();
        System.out.println("String: " + a);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna