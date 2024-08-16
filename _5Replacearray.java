public class _5Replacearray {
    public static void main(String[] args) {
        int arr[]={1,2,5,3,4};
        for(int i=0;i<=arr.length-1;i++){
            if(i<=arr[3]){
                arr[3]=99;
                System.out.println(arr[i]);
            }
        }
    }
}
