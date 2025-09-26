package Assignment;

import java.util.*;

public class maxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n =nums.length;
        int [] res = new int[n - k + 1];
        if(n==0) {
            return res;
        }

        Deque<Integer> deque = new ArrayDeque<Integer>();
        int index=0;
        
        // Initial window ki setup    ..............(size k)
        
        while(index<k) {
            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[index]){
                deque.pollLast();
            }
            deque.offerLast(index);
            index++;
        }       
        res[0]= nums[deque.peekFirst()];
        
        //Slide the   window
        
        for(int i=1; i<n-k+1; i++){

            // Remove purana index
        	
            if(!deque.isEmpty() && deque.peekFirst()<i){ 
                deque.pollFirst();
            }

            // Add naya index ........................(i + k - 1)    
            while (!deque.isEmpty() && nums[deque.peekLast()]<= nums[i + k - 1]) {
                deque.pollLast();
            }
            deque.offerLast(i+k-1);

            res[i]=nums[deque.peekFirst()]; // current window ki max store 
        }
        
        return res;
    }
}