import java.lang.Math;
public class Binary2Desimal {

    public static void main(String[] args) {
        int i=0;
        int number=111;
        double ans=0;
         while(number !=0){
             int digit=number%10;
             if(digit ==1){
                 ans=ans+Math.pow(2,i);
             }
             number=number/10;
             i++;

         }
        System.out.println(ans);
    }
}
