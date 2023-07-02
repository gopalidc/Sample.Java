# Sample.Java
Java Programs from basic
import java.util.Scanner;

class Adition {
    public static void main(String[] args) {
        int a, b;
        float avg;

        System.out.println("Enter two Numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        avg = (a + b);
        System.out.println("average of two numbers is :" + avg);
    }
}
