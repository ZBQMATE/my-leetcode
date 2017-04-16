public class Solution {
    
    private int mxl;
    private int rgp;
    private int rg;
    private int leth;
    private int times;
    private int[] sjtu;
    
    public int jump(int[] nums) {
        leth = nums.length;
        sjtu = nums;
        rg = 0;
        rgp = 0;
        
        while(rg < leth-1){
            mxl = rg;
            for(int i=rgp; i<=rg; i++){
                
                if(mxl<sjtu[i]+i){
                    mxl=sjtu[i]+i;
                }
            }
            rgp=rg;
            rg=mxl;
            times++;
        }
        return times;
    }
}