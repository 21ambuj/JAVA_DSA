import java.util.*;
public class strr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        int  f=s.lastIndexOf(ch);
        System.out.println(f);
    }
}