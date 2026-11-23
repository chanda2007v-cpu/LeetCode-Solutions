class Solution {
    public int numberOfMatches(int n) {
        int count=0;
        while(n!=1){
        if(n%2==0)
        {
            
            count=count+(n/2);
            n/=2;
        }
        else
        {
            count+=(n/2);
            n=(n+1)/2;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna