

package SGP_HybridCalc;
import java.util.Arrays;
import java.util.Scanner;

public class angle {


    void Angle()
    {
        int c=1;
        int to = 10;
        Scanner sc = new Scanner(System.in);
        double conversion[][] = {{1,0.017453,1.111111},{52.29578,1,63.66198},{0.9,0.015708,1}};
        String[] heads = {"Degrees","Radians","Gradians"};

        System.out.println("Enter the corresponding number of your choice whenever asked for.\n1.Degree\n2.Radians\n3.Gradians");
        while(c==1)
        {
            System.out.print("You want to convert : ");
            int from = sc.nextInt();
            if (from >= 1 & from <= heads.length)
            {
                System.out.print("You want to convert "+heads[from-1]+" to : ");
            }
            else
            {
                System.out.println("Oops...Invalid Input...! Please enter the required input.");
                continue;
            }
                to = sc.nextInt();

                if (to >= 1 & to <= heads.length) {
                    System.out.print("Enter " + heads[from - 1] + " : ");
                    double input = sc.nextDouble();
                    double ans = input * conversion[from - 1][to - 1];
                    System.out.println(heads[to - 1] + " : " + ans);
                    System.out.print("To use the Angle convertor again, press 1 or else 0. : ");
                    c = sc.nextInt();
                } else {
                    System.out.println("Oops...Invalid Input...!");
                    System.out.println("*************************");
                }

        }
    }
}
