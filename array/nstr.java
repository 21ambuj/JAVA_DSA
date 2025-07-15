import java.util.*;
public class nstr{
    public static int nthi(String s,char ch,int index,int count,int target){
        if(index==s.length()) return -1;
        if(s.charAt(index)==ch){
            count++;
            if(count==target)   return index;
            
        }
        return nthi(s,ch,index+1,count,target);
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        char ch=sc.next().charAt(0);
        int tar=sc.nextInt();
        int res=nthi(s,ch,0,0,tar);
        System.out.println(res);

        }
    
}