import java.util.Arrays;

public class MergeSortedArray4 {
    public static void main(String[] args) {

        int[] a = {1,5,3,0,0,0};
        int m = 6;
        int[] b = {8,7,3};
        int n = 3;

        merge(a,m, b,n);
        System.out.println(Arrays.toString(a));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        m--;
        n--;
        int index = nums1.length-1;

        while(index>=0){
            if(m <0){
                nums1[index] = nums2[n--];
            } else if (n < 0) {
                nums1[index] = nums1[m--];

            } else {
                if(nums1[m] > nums2[n]){
                    nums1[index] = nums1[m--];
                }else{
                    nums1[index] = nums2[n--];
                }
            }
            index--;
        }
    }
}
