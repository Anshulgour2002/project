public class maxArrayinfunctioncall {

    public static int[] max(int [] arr , int size){
        int max = -21212;   // 10
        int min = 21212121;
        for(int i=0; i<size; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return new int []{max , min};
    }
    public static void main(String[] args) {
    int [] arr = {10,2,3,1,5};
    int size = arr.length;


  int ans[] = max(arr,size);
  for(Integer i : ans){
      System.out.println(i);
  }
    }
}
