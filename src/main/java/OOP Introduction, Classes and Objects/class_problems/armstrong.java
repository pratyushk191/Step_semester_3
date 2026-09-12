package class_problems;

import java.util.*;
class pri{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int a=in.nextInt();
        int on=a;
        int sum=0;
       while(a>0){
           int ld=a%10;
           sum=sum+ ld*ld*ld;
           a=a/10;
           
    }
    if(on==sum){
        System.out.println("armstrong number");
    }
    else{
        System.out.println("not armstrong number");
    }
}
}