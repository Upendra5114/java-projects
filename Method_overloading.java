import java.util.Scanner;
public class Method_overloading{
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a,b,c values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
        sc.close();
    }
}