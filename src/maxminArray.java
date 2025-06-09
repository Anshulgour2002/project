public class maxminArray {
    public static void main(String[] args) {
        int[] arr={5,10,20,4,2,17};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("max value is "+max);
        System.out.println("min value is "+min);
    }

}