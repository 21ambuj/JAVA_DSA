import java.util.*;
public class zeroes{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n= sc.nextInt();
                int[] arr=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                        
                }
                int[] arr2=new int[n];
                int k=0;
                for(int i=0;i<n;i++){
                        if(arr[i]!=0){
                                arr2[k++]=arr[i];
                        }
                }
                for(int i=k;i<n;i++){
                        arr2[k++]=0;
                }
                for(int i=0;i<n;i++){
                        System.out.println(arr2[i]);
                }



        }
}
