import java.io.*;
import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       int  cases = sc.nextInt();
        for(int i=1 ; i<=cases ; i++){
            int R = sc.nextInt();
            int C = sc.nextInt();

            System.out.println("Case #"+i+":");
            for(int j=1;j<=(R*2)+1;j++){


                for(int k=1;k<=(C*2)+1;k++){
                 if(j==1 && k==2){
                     System.out.print(".");
                 }else if(j==1 && k==1){
                     System.out.print(".");
                 }else if(j==2 && k ==1){
                     System.out.print(".");
                 }else if(k%2!=0){
                     if(j%2 !=0){
                         System.out.print("+");
                     }else{
                         System.out.print("|");
                     }
                 }else{
                     if(j%2 != 0){
                         System.out.print("-");
                     }else{
                         System.out.print(".");
                     }
                 }

                }

                System.out.println();
            }
        }
    }
}
