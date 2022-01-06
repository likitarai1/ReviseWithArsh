// 264. Ugly Number II

class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> minh = new PriorityQueue<>();
        long k = 0;
        minh.add(1L);
        while(n-- > 0){
            k = minh.poll();
            if(!minh.contains(2*k)){
                minh.add(2*k);
            }
            if(!minh.contains(3*k)){
                minh.add(3*k);
            }
            if(!minh.contains(5*k)){
                minh.add(5*k);
            }
        }
        return (int)k;
    }
}

// TC = O(N)
// SC = O(N)