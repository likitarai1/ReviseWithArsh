class Solution
{
    static int waysrecur(int x, int n, int num, int sum){
        int ans = 0;
        int p = Math.pow(num,n);
        
        while(p+sum < x){
            ans += waysrecur(x,n,num+1,p+sum);
            num++;
            p = Math.pow(num,n);
        }
        
        if(p+sum == x){
            ans++;
        }
        
        return ans;
    }
    
    static int numOfWays(int n, int x)
    {
        return waysrecur(x,n,1,0);
    }
}