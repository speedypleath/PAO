package pack;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble(),sum=0.0,cnt=0.0;
        while (x!=-1){
            sum += x;
            cnt += 1;
            x = in.nextInt();
        }
        System.out.println(sum/cnt);
        
    }
}
