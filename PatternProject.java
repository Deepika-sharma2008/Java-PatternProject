import java.util.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.JOptionPane;
public class PatternProject
{
     public static void main(String[] args) {
        showPatternMenu(); 
    }
        static void showPatternMenu()
    {
        System.out.println("\n\t\t--- Pattern-Project ---\n");
        System.out.println("1.Square pattern \t 2.Right Pascal Triangle\n");
        System.out.println("3.Diamond pattern \t 4.Pyramid Pattern\n");
        System.out.println("5.Number Pattern \t 6.Alphabet Pattern\n");
        System.out.println("7.Butterfly Pattern \t 8.Floyd Triangle\n");
        System.out.println("9.Hollow Pattern \t 10.Sandglass Numeric Pattern\n");
        System.out.println("11.Diamond Star Pattern\t 12.Hourglass Number Pattern\n");
         System.out.println("13.Hollow Diamond in box");
        String s = JOptionPane.showInputDialog("Enter a number (1-13) to choose a pattern:\n");
        System.out.println(s);
        patternpro p = new patternpro ();

        if (s == null) {
            JOptionPane.showMessageDialog(null, "Cancelled by user.");
            return;
        }

       if(s.equals("1")) {
            p.Squarepattern();
        }
        else if(s.equals("2")){
            p.RightPascalTriangle();
        }
        else if(s.equals("3")){
            p.Diamondpattern();
        }
        else if(s.equals("4")){
            p.PyramidPattern();
        }
        else if(s.equals("5")){
            p.NumberPattern();
        }
        else if(s.equals("6")){
            p.AlphabetPattern();
        }
        else if(s.equals("7")){
            p.ButterflyPattern();
        }
        else if(s.equals("8")){
            p.FloydTriangle();
        }
        else if(s.equals("9")){
            p.HollowPattern();
        }
        else if(s.equals("10")){
            p.SandglassNumericPattern();
        }
         else if(s.equals("11")){
            p.DiamondStarPattern();
        }
        else if(s.equals("12")){
            p.HourglassNumberPattern();
        }
         else if(s.equals("13")){
            p.HollowDiamondinbox();
        }
         else {
            JOptionPane.showMessageDialog(null, "Enter a number between 1 and 10.");
        }
        int repeat = JOptionPane.showConfirmDialog(null, "Do you want to continue?","Continue", JOptionPane.YES_NO_OPTION);
        if (repeat == JOptionPane.YES_OPTION) {
            main(null);
        } else {
            JOptionPane.showMessageDialog(null, "Program end.");
        }
    }

    static void Squarepattern()
    {   
       int i,j;
            for(i=1;i<=5;i++){
                for(j=1;j<=5;j++){
                    System.out.print(" x");
                }
                System.out.println();
            }
    }
    static void  RightPascalTriangle()
    {
        int i,N=5;
        for(i=1;i<N+N;i++){
            System.out.println((i<=N)?"* ".repeat(i):"* ".repeat(N-(i-N)));
        }
    }
    static void Diamondpattern()
    {
        int i,j;
            for(i=1;i<=5;i++){
                for(j=1;j<=5;j++){
                   System.out.print((i==((5+1)/2)&&(j==1||j==5)||(j==((5+1)/2)&&(i==1||i==5))||(i%2==0)&&(j%2==0))?"*":" ");
                }
                 System.out.println();
            }
    }
    static void PyramidPattern()
    {
        int i,j,N=5,x=0;
                for(i=1;i<=N;i++){
                    System.out.print("  ".repeat(N-i));
                    for(j=1,x=0;j<=i+i-1;j++){
                        System.out.print(((j==1 || j==i+i-1 || i==N))?"X ":(x=x+2)+" ");
                        // x=(x>=8)?0:*;
                    }
                    System.out.println();
                }
    }
    static void NumberPattern()
    {
         for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
         }
    }
    static void  AlphabetPattern()
    {
       int i,j,N=5;
       for(i=1;i<=N;i++){
        char ch='A';
        for(j=1;j<=N;j++){
            System.out.print((i==1 || i==N || j==1 || j==N)?ch:" ");
            ch++;
        }
        System.out.println();
       }
    }
    static void  ButterflyPattern()
    {
        int i,j,N=5;
        for(i=1;i<=N+N-1;i++){
            for(j=1;j<=N+N-1;j++){
            System.out.print((i<=N)?(j<=i || j>=(N+N-i))?"X":" ":(j<=(N-(i-N)) || j>=(N+(i-N)))?"X":" ");
            }
            System.out.println();
        }
    }
    static void  FloydTriangle()
    {
        int i,j,N=1,R=4;
        for(i=1;i<=R;i++){
            for(j=1;j<=i;j++){
                System.out.print(N+" ");
                N++;
            }
            System.out.println();
        }
    }
    static void HollowPattern()
    {
        int i,j,N=5;
        for(i=1;i<=N;i++){
            for(j=1;j<=N;j++){
                System.out.print((i==1 || i==N || j==1 || j==N)?"X":" ");
            }
            System.out.println(); 
        }
    }
    static void SandglassNumericPattern()
    {
        int N=6,i,j,x=N+1,s=0;
                int tcol=(((N*(N+1)/2)*2));
                int z=1,y=10;
                for(i=1;i<=N+N-1;i++){
                    x = i<=N?--x:++x;
                    s = i<=N?++s:--s;
                    System.out.print(" ".repeat(s));
                    for(j=1;j<=x;j++,z++){
                       System.out.print((z<=9)?z+" ":(z>=(tcol-9))?(--y)+" ":(z%2==0)?"0 ":"9 ");
                    }
                    System.out.println();
                }
     
    }
    static void DiamondStarPattern()
    {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int s = i; s < n; s++) 
            System.out.print(" ");
            for (int j = 1; j <= (2*i - 1); j++) 
            System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = n; s > i; s--) System.out.print(" ");
            for (int j = 1; j <= (2*i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }
    static void HourglassNumberPattern()
    {
        System.out.println("\nHourglass Number Pattern");
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int N = sn.nextInt();
        int X = N+N-1, s=0;
        for(int i=1;i<=N+N-1;i++){
            s=i<=N?++s:--s;
            System.out.print("  ".repeat(s));
            for(int j=1,w=0;j<=X;j++){
                System.out.print((j<=N-s+1)?(++w)+" ":(--w)+" ");
            }
            X=(i<N)?(X-2):(X+2);
            System.out.println();
        }
    }
    static void HollowDiamondinbox()
    {
        System.out.println("\nHollow Diamond in box");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int N = s.nextInt();
        for(int i=1;i<=N+N-1;i++){
            for(int j=1;j<=N+N-1;j++){
                System.out.print((j<=N-i+1) || (j>(N+i-2)) || (i>=N && (j<=(i-N+1)|| j>=N+N-(i-N+1)))?
                "X ":"  ");
            }
            System.out.println();
        }
    }
}
