import java.util.*;
public class sum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=n;i>0;i--){
            sum+=i;
        }
        System.out.println(sum);
    }
}