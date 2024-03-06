import java.util.*;
import java.lang.Math;
public class RectangleInfo {
    public static void main(String []args)
    {
        double l,b,area,peri,diag;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the lenght: ");
        l = scan.nextFloat();
        System.out.println("Enter the breadth: ");
        b = scan.nextFloat();

        if(l>0 && b>0)
        {

            area = l*b;
            peri = 2*(l+b);
            diag = Math.pow((Math.pow(l,2) + Math.pow(b,2)),0.5);
            System.out.printf("\nArea : %.2f \nPerimeter : %.2f\nDiagonal : %.2f",area,peri,diag);
        }
        else
        {
            System.out.println("Invalid Number");
        }
    }
}
