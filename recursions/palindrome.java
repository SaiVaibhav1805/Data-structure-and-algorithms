package recursions;

public class palindrome {

    void swap(char s[], int i, int j) {  
        char temp = s[i];                
        s[i] = s[j];
        s[j] = temp;
    }

    void rev(int i, char s[], int n) {   
        if (i >= n / 2)
            return;
        swap(s, i, n - i - 1);           
        rev(i + 1, s, n);               
    }

    public static void main(String[] args) {
        String s = "Vaibhav";
        palindrome p = new palindrome();
        int n = s.length();

        char arr[] = s.toCharArray();   
        p.rev(0, arr, n);                

        String reversed = new String(arr); 

        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + reversed);
    }
}
