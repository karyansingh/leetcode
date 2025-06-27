class Solution {
    
    public boolean isTrue(int[] arr , int k , int m){
        int count = 1;         
        int temp = arr[0];      

        for(int i = 1; i < arr.length; i++){
            
            if(arr[i] - temp >= k){
                count++;       
                temp = arr[i];  
            }
        }
        
        return count >= m;
    }

    public int maxDistance(int[] position, int m) {
        
        Arrays.sort(position);

        int l = 0;  
        int r = position[position.length - 1] - position[0];  
        int ans = 0;  

        
        while(l <= r){
            int mid = (l + r) / 2; 

            if(isTrue(position, mid, m)){
                ans = mid;       
                l = mid + 1;
            } else {
                r = mid - 1;     
            }
        }

        return ans;  
    }
}