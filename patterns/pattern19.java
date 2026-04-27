// import java.util.Scanner;
// public class pattern19 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<2*(n-i);j++){
//                 System.out.print(" ");
//             }
//              for(int j=0;j<i;j++){
//                 System.out.print("*");
//             }
            
//             System.out.println();
//         }
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<n-i;j++){
//                 System.out.print("*");
//             }
//         for(int j=0;j<i*2;j++){
//             System.out.print(" ");
//         }
//         for(int j=0;j<n-i;j++){
//                 System.out.print("*");
//             }
//         System.out.println();
//     }

//         sc.close(); 
//     }
// }

// import java.util.Scanner;
// public class pattern19 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<2*(n-i);j++){
//                 System.out.print(" ");
//             }
//              for(int j=0;j<i;j++){
//                 System.out.print("*");
//             }
            
//             System.out.println();
//         }
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<n-i;j++){
//                 System.out.print("*");
//             }
//         for(int j=0;j<i*2;j++){
//             System.out.print(" ");
//         }
//         for(int j=0;j<n-i;j++){
//                 System.out.print("*");
//             }
//         System.out.println();
//     }

//         sc.close(); 
//     }
// }

import java.util.Scanner;
public class pattern19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<2*n-1;i++){
            int stars=i;
            if(i>n)
                stars=2*n-i;
        
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
             int spaces=2*(n-1);
            for(int j=1;j<spaces;j++){
              
                System.out.print(" ");
            }
             for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
             if(i<n) spaces-=2;
               else spaces+=2;
            System.out.println();
        }
        sc.close();
    }
}
