
public class palandrom {
    public static void main(String[] args) {
        int num = 436;
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }
        System.out.println("the riverse number is  "+sum);
    }
}