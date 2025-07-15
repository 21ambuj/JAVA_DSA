
import java.util.Scanner;


public class occ{
   
int[] fandlo(int[] arr,int x){
    int f=-1;
    int l=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            if(f==-1){
                f=i;
            }
            l=i;
        }
        

    }
    return new int[]{f,l};
    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        occ o=new occ();
        int[] a=o.fandlo(arr,x);
        System.out.print("First occ "+a[0]+" and Second occ is "+a[1]);


    }
}