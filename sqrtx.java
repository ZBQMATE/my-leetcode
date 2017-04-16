public class Solution {
    private double ans;
    private double top;
    private double btn;
    private double tgt;
    private int as;
    private int flag;
    private double findit(double a, double t, double b, double g) {
        ans = a;
        top = t;
        btn = b;
        tgt = g;
        if (flag > 330) {
            return btn;
        }
        if (ans*ans == tgt) {
            return ans;
        }
        if (ans*ans < tgt) {
            btn = ans;
            ans = (btn + top)/2;
            flag++;
            findit(ans, top, btn, tgt);
        }
        if (ans*ans > tgt) {
            top = ans;
            ans = (btn + top) / 2;
            flag++;
            findit(ans, top, btn, tgt);
        }
        return ans;
    }
    public int mySqrt(int x) {
        if (x ==1){
            return 1;
        }
        flag = 1;
        ans = (double)x / 2;
        top = (double)x;
        btn = 0.0;
        tgt = (double)x;
        as = (int)findit(ans, top, btn, tgt);
        return as;
    }
}