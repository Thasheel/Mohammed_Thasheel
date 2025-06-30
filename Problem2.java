import java.util.Scanner;

public class Problem2 {

  
    public static void oddSeries(int a) {
        int count = 0;
        int num = 1;

        while (count < a) {
            System.out.print(num);
            count++;
            num =num+ 2;

            if (count < a) {
                System.out.print(",");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();

        oddSeries(a);

      
    }
}
