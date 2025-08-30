public class ContainsDuplicate {
    public static void main(String [] args) {
        int[] numn={1,2,3,1,2,3};
       boolean ans= containsNearbyDuplicate(numn,2);
        System.out.println(ans);
    }
        public static boolean containsNearbyDuplicate(int[] nums, int k) {
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){

                    if((nums[i]^nums[j] )== 0){
                        if((j-i) <= k){
                            return true;
                        }

                    }

                }

            }
            return false;

        }

}
