public class ZeroOneTwoSort {
    public static void sort012(int[] arr) {
        // Write your code here
        // Method 1
        // Arrays.sort(arr);

        // method 2
        // int oneCounter=0;
        // int twoCounter=0;
        // int zeroCounter=0;

        // for(int i=0;i<arr.length;i++){
        // if(arr[i]==0){
        // zeroCounter++;
        // }else if(arr[i]==1){
        // oneCounter++;
        // }else{
        // twoCounter++;
        // }
        // }
        // for(int i=0;i<arr.length;i++){
        // if(zeroCounter>0){
        // arr[i]=0;
        // zeroCounter--;
        // }else if(oneCounter>0){
        // arr[i]=1;
        // oneCounter--;
        // }else{
        // arr[i]=2;

        // }
        // }

        // Method 3

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                    break;

                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 2, 1, 0, 1, 1, 0, 2 };
        sort012(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
