
public class ArrayMiscProblem {

    static void swap(int a,int b){
        System.out.println("original number");
        System.out.println("a:"+a);
        System.out.println("b:"+b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("Values after swap");
        System.out.println("a:"+a);
        System.out.println("b:"+b);


    }

    public static void main(String[] args) {

        int a=3;
        int b=8;


        swap(a,b);
    }



}
