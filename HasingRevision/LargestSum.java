package HasingRevision;

public class LargestSum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = 0;
        int currentSum =0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum+arr[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        System.out.println(maxSum);
    }
}
