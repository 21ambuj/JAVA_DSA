// import java.lang.*;  // Optional - automatically imported

public class facto {

    public static int fac(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fac(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fac(5));  // Output: 120
    }
}
