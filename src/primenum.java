import java.util.Scanner;


public class primenum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        boolean flag=true;
        for(int i=2;i<num-1;i++){
            if(num%i==0){
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("this is prime");

        }
        else{
            System.out.println("not prime");
        }


    }
}
