public class rec {
    static void reca(int num) {
        System.out.println(num);
        if (num > 0) {
            reca(num-1);
        }
    }
    public static void main(String[] args) {
        reca(5);

    }
}
