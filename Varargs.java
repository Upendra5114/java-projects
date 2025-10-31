import java.util.Scanner;

public class Varargs {
    static int sum(int ...arr){
        int s = 0;
        for(int a:arr){
            s+=a;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4));
        sc.close();
    }
}
