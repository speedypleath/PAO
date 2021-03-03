package pack;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=5;i<=n;i+=10)
        {
            System.out.println(i);
        }
    }
}
