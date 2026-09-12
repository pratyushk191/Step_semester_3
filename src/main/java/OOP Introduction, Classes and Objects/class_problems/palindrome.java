package class_problems;

import java.util.*;
class palindrome{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int a=in.nextInt();
        int on=a;
        int rev=0;
       while(a>0){
           int ld=a%10;
           rev=(rev*10)+ld;
           a=a/10;
           
    }
    if(on==rev){
        System.out.println("palindrome");
    }
    else{
        System.out.println("not palindrome");
    }
}
}

            
        

