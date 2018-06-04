import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        double gailvmei = m/n;
        double gailvtuan = 1 - gailvmei;
        double qiwang[] = new double[k];
        int kuaile[][] = new int[k][2];
        int result[] = new int[k];
        double min = -10000;
        int local = 0;
        for (int i=0; i<k; i++){
            result[i] = 0;
        }
        for (int i=0; i<k; i++){
            kuaile[i][0] = sc.nextInt();
            kuaile[i][1] = sc.nextInt();
        }
        for (int i=0; i<k; i++){
            qiwang[i] = -10000;
        }
        for (int i=0; i<k; i++){
            qiwang[i] = kuaile[i][0] * gailvmei + kuaile[i][1] * gailvtuan;
        }
        for (int i=0; i<k; i++){
            if (qiwang[i] < min){
                local = i;
            }
        }
        result[local] = n;
        for (int i=0; i<k; i++){
            System.out.println(result[i]);
        }
        
    }
}