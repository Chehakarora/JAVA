public class ArrayConstructionProblems
{
    //LeetCode 2011
    public int finalValueAfterOperations(String[] operations)
    {
        int x=0;

        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].contains("+"))
                x++;
            else
                x--;
        }
        return x;
    }

    //LeetCode 1480
    public int[] runningSum(int[] nums)
    {
        int[] ans=new int[nums.length];

        if(nums.length==0)
            return ans;

        ans[0]=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            ans[i]=ans[i-1]+nums[i];
        }
        return ans;
    }
}