package Examproblems;

public class Minmax {
        static class Result {
            int min;
            int max;
        }

        public static Result findMinMax(int[] arr, int low, int high) {
            Result res = new Result();

            // Only one element
            if (low == high) {
                res.min = res.max = arr[low];
                return res;
            }

            // Two elements
            if (high == low + 1) {
                if (arr[low] < arr[high]) {
                    res.min = arr[low];
                    res.max = arr[high];
                } else {
                    res.min = arr[high];
                    res.max = arr[low];
                }
                return res;
            }

            // More than two elements
            int mid = (low + high) / 2;
            Result left = findMinMax(arr, low, mid);
            Result right = findMinMax(arr, mid + 1, high);

            res.min = Math.min(left.min, right.min);
            res.max = Math.max(left.max, right.max);

            return res;
        }

        public static void main(String[] args) {
            int[] arr = {100, 11, 445, 1, 330, 300, 10};
            int n = arr.length;

            Result res = findMinMax(arr, 0, n - 1);
            System.out.println("Minimum: " + res.min);
            System.out.println("Maximum: " + res.max);
        }
    }


