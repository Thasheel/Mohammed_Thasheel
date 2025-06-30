import java.util.Scanner;

public class Problem3{
    public static void series(int n){
        int length = (n% 2 == 0) ? n - 1 : n; 

        int count = 0;
        int num = 1;

        while (count < length) {
            System.out.print(num);
            count++;
            num += 2;

            if (count < length) {
                System.out.print(", ");
            }
        }
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number : ");
         int n = sc.nextInt();
         series(n);
     }

}
