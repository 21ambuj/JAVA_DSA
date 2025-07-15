import java.util.*;
public class rot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        int[] arr1=new int[n];
        if(n==0){
            return;
        }
        r=r%n;
        for(int i=0;i<r;i++){
            arr1[i]=arr[n-r+i];

        }
        for(int i=r;i<n;i++){
            arr1[i]=arr[i-r];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }

        
    
   }
}