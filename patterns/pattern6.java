
import java.util.Scanner;
public class pattern6           // reverse Pascals Triangle
   {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            

            for(int i = 0; i < n; i++) {
                for(int j = 0; j <=i; j++) {  //for 1st space
                    System.out.print(" ");
                }
                for(int j=0;j<(2*n)-(2*i+1);j++){      //star
                    System.out.print(("*"));
                }
                  for(int j = 0; j <=i; j++) {    //for 2nd space
                    System.out.print(" ");
                }

                System.out.println();
            }

            scanner.close();
        }
    }


