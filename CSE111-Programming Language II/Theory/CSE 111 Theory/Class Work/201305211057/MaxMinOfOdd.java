import java.util.*;
class MaxMinOfOdd {
    public static void main(String[] args) {
        int n, c, max=-2, min=-998;
        Scanner  k = new Scanner(System.in);
        for(c=1 ; c<=15; ++c){
            n = k.nextInt();
            if(n%2!=0) {
                max = min = n;
                ++c;
                break;
            }
        }
        for(   ; c<=15; ++c) {
            n = k.nextInt();
            if(n%2!=0) {
                if(n>max) {
                    max = n;
                } else if (n<min) {
                    min = n;
                }
            }
        }
        System.out.println(min+" "+max);
    }
}