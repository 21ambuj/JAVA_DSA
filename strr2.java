import java.util.*;
public class strr2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        char ch=sc.next().charAt(0);
        for(int i=n-1;i>0;i--){
            if(s.charAt(i)==ch){
                System.out.println(i);
            }
        }

        
    }
}