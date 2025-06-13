public class Main{
    public static void main(String[] args){
        int i,j;
        int arr[]={12,40,1,4,6,90,20};
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for(i=0;i<=arr.length-1;i++){
        System.out.print(arr[i]+ " ");
    }
        
    }
    
}
