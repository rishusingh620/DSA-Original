import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int n=sc.nextInt();

       int  num =1;

       while(num<=n){

           System.out.println(num);

           num=num+1;


       }


    }
}
