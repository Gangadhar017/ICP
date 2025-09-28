package Assignment;

import java.util.Arrays;
import java.util.Comparator;

public class findMinArrowShots {

    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if (n==1) return 1;
        // if(n==1){
        //     return 1;
        // }
        //sorting
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int a1[], int a2[]){
                if (a1[0]==a2[0]) return 0;
                if (a1[0]<a2[0]) return -1;
                return 1;
            }
        });

        int arrows = 1;
        int commonInterval[] = points[0];

        for (int i=1;i<n;i++){
            int curStart=points[i][0];
            int curEnd=points[i][1];

            // if  are balloons are overlapping we can use same arrow to 
            //burst it
            if (curStart <= commonInterval[1]){
                commonInterval[0] = Math.max(commonInterval[0], curStart);
                commonInterval[1] = Math.min(commonInterval[1], curEnd);
            }
            else {
                //start new interval
                commonInterval[0] = curStart;
                commonInterval[1] = curEnd;
                arrows ++;
            }
        }
        return arrows;
    }
}
