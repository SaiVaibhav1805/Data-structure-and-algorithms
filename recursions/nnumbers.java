package recursions;

// class test1{
//     void rec(int c){
//     if(c==10)
//     return;
//     System.out.println(c);
//     c++;
//     rec(c);
//     }

// }

// public class nnumbers{
//     public static void main(String[] args) {
//         {
//             int c=0;
//             test1 t=new test1();
//             t.rec(c);
//         }
//     }
// }


class nnumbers{
    
    static void backtrack(int i,int n){
        if(i<1)
        return;
        backtrack(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=5;
        backtrack(n,n);                         //Basically Backtracking
    }
}
