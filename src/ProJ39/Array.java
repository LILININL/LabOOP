package ProJ39;
import java.io.*;
public class Array
{
    public static void main(String args[]) throws NumberFormatException, IOException
    {
        int x[] = new int[7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please inert Array numbers: ");
        for(int y=0; y<7; y++)
        {
            x[y] = Integer.parseInt(br.readLine());
        }
        for(int y=0; y<x.length; y++)
        {
        System.out.print(" " + x[y]);
        }
    }
}
