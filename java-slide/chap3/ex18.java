public class ex18 {
    static int n;
    static double[] x = new double[6];
    static double[] y = new double[6];
    static double p(double xx) {
        double ans = 0;
        for(int i = 0; i < n; ++ i) {
            double prod = y[i];
            
            for (int j = 0; j < n; ++j) {
                
                if (i == j)
                    continue;
                
                prod *= (xx - x[j]) / (x[i] - x[j]);
            }
            ans += prod;
        }
        return ans;
    }
    public static void main(String[] args) {
        n = 6;
        x[0] = 0; y[0] = 1;
        x[1] = 1; y[1] = 7;
        x[2] = 2; y[2] = 16;
        x[3] = 3; y[3] = 36 + 1;
        x[4] = 4; y[4] = 79;
        x[5] = 5;
        y[5] = 173;
        
        for (int i = 0; i < 10; ++i) {
            
            System.out.print((int) p(i) + " ");
        }
    }
}