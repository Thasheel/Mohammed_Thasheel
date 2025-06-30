
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;





public class Problem3 {


    public static void multiplesCount(int arr[]){

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=1;i<=9;i++){
            map.put(i,0);

        }
        for(int num :arr){
            for(int i=1;i<=9;i++){
                if(num%i==0){
                    map.put(i,map.get(i)+1);
                }
            }
        }

        System.out.println(map);


        

    }












    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        multiplesCount(arr);
    }
}
