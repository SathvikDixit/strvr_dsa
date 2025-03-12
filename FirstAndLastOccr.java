// 6th problem in Binary Search i.e., First and Last Occurance of X

// public class FirstAndLastOccr {
//     public static int lowerBound(int[] arr, int x, int n) {
//         int low = 0, high = n - 1;
//         int ans = -1;

//         while (low <= high) {
//             int mid = (low + high) / 2;

//             if (arr[mid] >= x) {
//                 ans = mid;
//                 high = mid - 1;
//             } 
//             else {
//                 low = mid + 1;
//             }
//         }
//         return ans;
//     }

//     public static int upperBound(int arr[], int n, int x) {
//         int low = 0, high = n - 1;
//         int ans = -1;

//         while (low <= high) {
//             int mid = (low + high)/2;
//             if (arr[mid] > x) {
//                 ans = mid;
//                 high = mid -1;
//             }
//             else {
//                 low = mid + 1;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 3, 5, 7, 7, 9, 10};
//         int x = 11, n = arr.length;

//         int lb = lowerBound(arr, x, n);
//         int ub = (upperBound(arr, n, x) - 1);

//         System.out.println("first to last is "+lb+ " and "+ub);
//     }

// }

class Solution {
    private int firstOccurance(int[] nums, int target) {
        int answer = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high) {
            int mid = (low) + ((high-low)/2);
            if(nums[mid]==target) {
                answer = mid;
                high = mid-1;
            } else if(nums[mid] > target) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return answer;
    }

    private int lastOccurance(int[] nums, int target) {
        int answer = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high) {
            int mid = (low) + ((high-low)/2);
            if(nums[mid]==target) {
                answer = mid;
                low = mid+1;
            } else if(nums[mid] > target) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return answer;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] answer = new int[2];
        answer[0] = firstOccurance(nums, target);
        if(answer[0]==-1) {
            answer[1] = -1;
        } else {
            answer[1] = lastOccurance(nums, target);
        }
        return answer;
    }
}

public class FirstAndLastOccr {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = solution.searchRange(nums, target);

        System.out.println("First and last position of target " +target+ " is : [" + result[0] + ", " + result[1] + "]");
    }
}
