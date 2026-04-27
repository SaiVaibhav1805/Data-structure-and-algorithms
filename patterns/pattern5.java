
import java.util.Scanner;
public class pattern5           //Pascals Triangle
   {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            

            for(int i = 0; i < n; i++) {
                for(int j = 0; j <=n-i-1; j++) {  //for 1st space
                    System.out.print(" ");
                }
                for(int j=0;j<2*i+1;j++){      //star
                    System.out.print(("*"));
                }
                  for(int j = 0; j <=n-i-1; j++) {    //for 2nd space
                    System.out.print(" ");
                }

                System.out.println();
            }

            scanner.close();
        }
    }



                    //     *             4  1  4
                    //    ***            3  3  3
                    //   *****           2  5  2
                    //  *******          1  7  1
                    // *********         0  9  0