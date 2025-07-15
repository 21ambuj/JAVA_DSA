import java.util.*;

public class sqr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of arr");
        int n=sc.nextInt();
                System.out.println("Enter a  arr");

        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
                System.out.println("Enter a target");

        int s=sc.nextInt();
    
        long left=0;
        long right=n-1;
        long ans=-1;
        while(left<=right){
            long mid=left+(right-left)/2;
             
            if(mid*mid==s){
                ans=mid;
                break;
            }
            if(s<mid*mid){
                ans=mid;
                left=mid-1;
                

            }
            else{
                right=mid+1;
            }
        }
        System.out.println(ans);

    }
    

}