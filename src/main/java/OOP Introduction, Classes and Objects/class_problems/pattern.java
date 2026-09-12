
package class_problems;
import java.util.*;
class pattern{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int r=in.nextInt();
        
        for(int i=0;i<=r;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}
