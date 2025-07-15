import java.util.*;
public class fstr{
    public static int find(String s,char ch,int index){
        if(index==s.length()) return -1;
        if(s.charAt(index)==ch) return index;
        return find(s,ch,index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        int res= find(s,ch,0);
        System.out.println(res);
    }
}