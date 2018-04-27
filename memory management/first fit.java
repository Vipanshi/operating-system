
package firstfit;

import java.util.Scanner;


public class Firstfit {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of partition");
        int n=sc.nextInt();
        int []par=new int[n];
        
        System.out.println("enter  partition size ");
        for(int i=0;i<n;i++)
          par[i]=sc.nextInt();
         System.out.println("enter  no of process ");
         int no=sc.nextInt();
         int []p=new int[no];
         System.out.println("enter  size of each process ");
        for(int i=0;i<no;i++){
            p[i]=sc.nextInt();
        }
        for(int j=0;j<no;j++){
        for(int i=0;i<n-j;i++){
          
       if(p[j]<=par[i])
       {
           System.out.println("process of size "+p[j]+" is allocated to partition "+par[i]);
          
          int temp=par[i];
          par[i]=par[no-j-1];
          par[no-j-1]=temp;
          break;
       }
        }
    }
    
}
}
