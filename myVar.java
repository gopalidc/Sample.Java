import java.util.Scanner;

public class myVar {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array lenght");
        n = sc.nextInt();
        int[] myarray = new int[n];
        System.out.println("Enter array values");
        for (int i = 0; i < n; i++) {
            myarray[i] = sc.nextInt();

        }
        for (int j = 0; j < n; j++)
            System.out.print("Entered Array at " + j + "is" + myarray[j]);
    }

}