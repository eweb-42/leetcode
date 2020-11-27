package reverseinteger;

public class solution {
    static int reverse(int x) {
        while (x<0) {
            System.out.println(x % 10);
            x = x / 10;
        }
        return x;
    }
    
    public static void main(String[] args) {
        reverse(-321);
    }
}