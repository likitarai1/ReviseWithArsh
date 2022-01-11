class Solution
{
    Long func(int n)
    {
        if(n==0) return Long.valueOf(0);
        
        if(n==1) return Long.valueOf(1);
        
        if(n==2) return Long.valueOf(2);
        
        if(n%2==1)
            return 1+func(n-2);
        else 
            return 1+func(n-1);  
            
    }
    
    Long countWays(int m)
    {
        return func(m);
    }    
}