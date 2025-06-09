import java.util.Scanner;

public class fabonnachi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int x=0;
        int y=1;
        int ans=0;
         n = n-2;
        for(int i=0;i<n;i++){
            ans=x+y;
            x=y;
            y=ans;


        }
        System.out.println(ans);

    }
}
