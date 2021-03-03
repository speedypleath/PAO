package pack;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a<b)
            if(b<c)
                System.out.println("a<b<c");
            else if(a<c)
                System.out.println("a<c<b");
            else
                System.out.println("c<a<b");
        else if (a<c)
            System.out.println("b<a<c");
        else if (b<c)
            System.out.println("b<c<a");
        else
            System.out.println("c<b<a");
    }
}
