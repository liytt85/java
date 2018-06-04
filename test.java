import java.util.*;
import java.lang.Math;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int wupin[][] = new int[n][2];
        int manjian[][] = new int[m][2];
        double jiezhang[] = new double[m+1];
        int zongzhang = 0;
        double result = 10000;
        for (int i=0; i<m+1; i++){
            jiezhang[i] = 2000.0;
        }
        for (int i=0; i<n; i++){
            wupin[i][0] = sc.nextInt();
            wupin[i][1] = sc.nextInt();
        }
        for (int i=0; i<m; i++){
            manjian[i][0] = sc.nextInt();
            manjian[i][1] = sc.nextInt();
        }
        jiezhang[0] = 0;
        for (int i=0; i<n; i++){
            if (wupin[i][1] == 1){
                jiezhang[0] += wupin[i][0] * 0.8;
            }
            else {
                jiezhang[0] += wupin[i][0];
            }
            zongzhang += wupin[i][0];
        }
        for (int i=1; i<=m; i++){
            if (manjian[i-1][0] <= zongzhang){
                jiezhang[i] = manjian[i-1][0] - manjian[i-1][1];
            }
        }
        for (int i=0; i<=m; i++){
            if (jiezhang[i] < result){
                result = jiezhang[i];
            }
        }
        
        
         
        System.out.println((double)Math.round(result*100)/100);
    }
}