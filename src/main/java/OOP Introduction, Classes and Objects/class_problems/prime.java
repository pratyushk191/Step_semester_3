package class_problems;

import java.util.*;
class prime{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int a=in.nextInt();
        boolean isPrime=true;
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0)
                isPrime=false;
            
        }
        if(isPrime==true)
            System.out.println("prime number");
        else
            System.out.println("not prime");
    }
}

