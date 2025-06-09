public class amsrong {
    public static void main(String[] args) {
        int number=379;
        int temp=number;
        int sum=0;


        while (temp>0){
            int rem= temp%10;
           sum =rem*rem*rem + sum;
            temp=temp/10;
        }
        System.out.println(sum);

    }
}
