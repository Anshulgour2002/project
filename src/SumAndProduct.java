public class SumAndProduct {
    public static void main(String[] args) {
        int num=325;
        int temp=num;
        int sum=0;
        int product = 1;

        while(temp>0){
            int rem=temp%10;
            sum+=rem;
            product *= rem;
            temp = temp / 10;

        }
         int ans = product-sum;
        System.out.println(ans);
    }
}
