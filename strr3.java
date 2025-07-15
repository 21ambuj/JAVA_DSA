import java.util.*;
public class strr2{
    public static  int str(String s,char ch,int index){
        if(index==s.length()) return -1;
        int i=str(s,ch,index+1);
        if(i!=-1) return i;
        else if(s.charAt(index)==ch) return index;
        else return -1;



    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        char ch=sc.next().charAt(0);
        int res=str(s,ch,0);
        System.out.println(res);
        

        
    }
}