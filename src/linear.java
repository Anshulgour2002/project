public class linear {
public static Boolean linearsearch(int[]arr,int value){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==value){
            return true;
        }
    }
    return false;
}

    public static void main(String[] args) {
    int value=33;
    int[] arr={22,3,4,1,4,5,6,8,43,33,43,2};
    Boolean num=linearsearch(arr,value);
    if(num==true){
        System.out.println("Value is present");
    }
    else{
        System.out.println("Value is not present");
    }

    }
}







