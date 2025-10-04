class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int b= 0;
        int left = 0, right = people.length - 1;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            b++;
        }
        return b;
    }
}
