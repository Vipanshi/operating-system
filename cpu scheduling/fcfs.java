package fcfs;
import java.util.Scanner;
public class Fcfs {
   public static void main(String[] args) {
       int x=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number of processes");
       int n=sc.nextInt();
       int []bt=new int[n];
       int []ct=new int[n];
       int []wt=new int[n];
       int tat[]=new int[n];
       System.out.println("Enter burst time for each process");
       for(int i=0;i<n;i++)
       {
           bt[i]=sc.nextInt();
       }
       //completion time for each process
       ct[0]=bt[0];
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
           int s=i+1;
           System.out.print("p"+s+"      "+"0"+"  "+bt[i]+"  "+ct[i]+"  "+tat[i]+"  "+wt[i]);
           System.out.println("");
       }

       }
}
