package recursions;

public class nsum {

    static void sums(int i, int sum) {
        if (i < 1) {   
            System.out.println(sum);
            return;
        }
        sums(i - 1, sum+i);
    }

    public static void main(String[] args) {
        int n = 10;
        sums(n, 0); 
    }
}
