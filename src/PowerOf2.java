import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int target =sc.nextInt();
        int ans=1;
        boolean flag =true;
        for(int i=0;i<32;i++){
            ans=ans*2;
            if(target==ans){
                System.out.println("the target is power of 2 ");
                flag = false;
            }
        }
       if(flag == true){
           System.out.println("The value is not power of 2");
       }

    }
}
