
package round.robin;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
public class RoundRobin {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
       System.out.print("enter no. of process");
       int n=sc.nextInt();
       LinkedList<Integer> burstTime=new LinkedList<>();
       LinkedList<String> job=new LinkedList<>();
       System.out.println("enter quantum time");
       int q=sc.nextInt();
       HashMap<String,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
           System.out.println("enter the burst time");
           int m=sc.nextInt();
           burstTime.addLast(m);
           System.out.println("enter the job name");
           String l=sc.next();
           job.addLast(l);
           map.put(l,m);
       }
       String[] jobs=new String[n];
       int[] ct=new int[n];
       int c=0;
       int i=0;
      while(!job.isEmpty()){
          int a=burstTime.removeFirst();
          c+=q;
          a-=q;
          String x=job.removeFirst();
          if(a<=0){
              jobs[i]=x;
              ct[i]=c;
              i++;
          }
          else{
              burstTime.addLast(a);
              job.addLast(x);
              
          }
      }
      int[] wt=new int[n];
      for(i=0;i<n;i++){
          wt[i]=ct[i]-map.get(jobs[i]);
      }
      System.out.println("Round robin with time quantum="+q);
      System.out.println("Jobs_name  AT BT CT TAT WT");
        for(i=0;i<n;i++){
            System.out.print(jobs[i]+"         "+"0   "+map.get(jobs[i])+"  "+ct[i]+"  "+ct[i]+"   "+wt[i]);
            System.out.println();
       
    }
 }
}
