package pack;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++)
            if(prim(i))
                System.out.println(i);
    }
    public static boolean prim(int n){
        if(n<2 || n%2 == 0)
            return false;
        for(int i=3;i*i<=n;i+=2)
            if(n%i == 0)
                return false;
        return true;
    }
}
