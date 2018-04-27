package sjf;
import java.util.Scanner;
public class Sjf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of processes");
        int n=sc.nextInt();
        int []bt=new int[n];
        int []p=new int[n];
          int []ct=new int[n];
       int []wt=new int[n];
       int tat[]=new int[n];
       System.out.println("Enter burst time for each process");
        for(int i=0;i<n;i++){
            bt[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++){
            p[i]=i+1;
        }
        int temp=0;
        int temp1=0;
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<n-j-1;i++)
           {
            if(bt[i]>bt[i+1])
            {
               temp=bt[i];
               temp1=p[i];
               bt[i]=bt[i+1];
               p[i]=p[i+1];
               bt[i+1]=temp;
               p[i+1]=temp1;
               
            }
           }
        }
         //completion time for each process
       ct[0]=bt[0];
       int x=0;
       for(int i=1;i<n;i++)
       {
           x=ct[i-1];
           ct[i]=bt[i]+x;
       }
       //turn arount  time for each process
       for(int i=0;i<n;i++)
       {
           tat[i]=ct[i];
       }
       for(int i=0;i<n;i++)
       {
           
           wt[i]=tat[i]-bt[i];
       }
       System.out.print("Process"+" "+"AT"+" "+"BT"+" "+"CT"+" "+"TAT"+" "+"WT");
       System.out.println("");
       for(int i=0;i<n;i++)
       {
          System.out.print("p"+p[i]+"      "+"0"+"  "+bt[i]+"  "+ct[i]+"  "+tat[i]+"  "+wt[i]);
           System.out.println("");
       }
        }
     }

        
        
        
    

