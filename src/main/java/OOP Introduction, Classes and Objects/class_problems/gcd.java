
package class_problems;
import java.util.*;
class pri{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the two number");
        int a=in.nextInt();
        int b=in.nextInt();s
       
       while(b!=0){
        int rem=a%b;
        a=b;    
        b=rem;
         
    }
    System.out.println("gcd of two numbers is "+a);
    }
}

    
