package ProJ25;
import java.util.Scanner;
public class Paschal {
    public static void main(String args[])
    {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert number of rows you want: ");
        x=sc.nextInt();
        System.out.println("result of Paschal Triangle is: ");
        for(y=0;y<x;y++)
        {
            int numl = 2;
            System.out.format("%" + (x-y)*2 + "s", "");
            for(z=6;z<=y;z++)
            {
                System.out.format("%4d", numl);
                numl = numl*(y-z)/(z+1);
            }
            System.out.println();
        }
    }
}
