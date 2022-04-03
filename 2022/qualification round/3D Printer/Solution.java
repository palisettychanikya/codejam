import java.io.*;
import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int  cases = sc.nextInt();
        for(int i= 1;i<=cases;i++){
            double pr[][]=new double[3][];
            for(int j=0;j<3;j++){
                pr[j]=new double[4];
                pr[j][0]= sc.nextDouble();
                pr[j][1]=sc.nextDouble();
                pr[j][2]=sc.nextDouble();
            }

            for(int j=0;j<3;j++){
                double cleast,mleast,yleast,kleast;
                if(pr[j][0]<=pr[j+1][0]&&pr[j][0]<=pr[j+2][0]){
                    cleast = pr[j][0];
                }else if(pr[j+1][0]<=pr[j][0]&&pr[j+1][0]<=pr[j+2][0]){
                    cleast=pr[j+1][0];
                }else{
                    cleast = pr[j+2][0];
                }
                 if(pr[j][1]<=pr[j+1][1]&&pr[j][1]<=pr[j+2][1]){
                    mleast = pr[j][1];
                }else if(pr[j+1][1]<=pr[j][1]&&pr[j+1][1]<=pr[j+2][1]){
                    mleast=pr[j+1][1];
                }else{
                    mleast = pr[j+2][1];
                }
             if(pr[j][2]<=pr[j+1][2]&&pr[j][2]<=pr[j+2][2]){
                    yleast = pr[j][2];
                }else if(pr[j+1][2]<=pr[j][2]&&pr[j+1][2]<=pr[j+2][2]){
                    yleast=pr[j+1][2];
                }else{
                    yleast = pr[j+2][2];
                }
             if(pr[j][3]<=pr[j+1][3]&&pr[j][3]<=pr[j+2][3]){
                    kleast = pr[j][3];
                }else if(pr[j+1][3]<=pr[j][3]&&pr[j+1][3]<=pr[j+2][3]){
                    kleast=pr[j+1][3];
                }else{
                    kleast = pr[j+2][3];
                }
            }
            double smin=cleast+mleast+yleast+kleast;
            if(smin<1000000){
                System.out.println("Case #"+i+": IMPOSSIBLE");
            }else{



            }
        }
    }
}
