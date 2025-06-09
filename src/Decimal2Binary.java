import java.lang.Math;

public class Decimal2Binary {
    public static void main(String[] args) {
        int i=0;
        int n=10;
        double ans=0;
        while(n !=0){
            int digit=n%2;
            ans= (digit* Math.pow(10,i)+ans);
            n=n/2;
            i++;

        }
        System.out.println(ans);

    }
}
