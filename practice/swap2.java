public class swap2{
    public static void main(String[] args) {
        int n=2;
        int m=3;
        System.out.println("Before swap: n = "+n+" and m = "+m);
        n=n+m;
        m=n-m;
        n=n-m;
        System.out.println("After swap: n = "+n+" and m = "+m);

    }
}