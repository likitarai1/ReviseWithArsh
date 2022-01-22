class Solution{
    static int minSteps(int D){
        int steps = 0, sum = 0;
        while(true){
            sum = sum + steps;
            steps++;
            if(sum == D){
                return steps-1;
            }
            if(sum > D && (sum-D)%2 == 0){
                return steps-1;
            }
        }
    }
}