public class Maximal_Rectangle {
    public int maximalRectangle(char[][] matrix) {
        int ans = 0;
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0;i<n;i++) {
            int r[] = new int[m];
            for(int j=i;j<n;j++) {
                for(int k=0;k<m;k++){
                    r[k]+=matrix[j][k]-'0';
                }

                int h=j-i+1;
                int sum=0;
                for(int k=0;k<m;k++) {
                    if(r[k]==h) {
                        sum+=h;
                        ans=Math.max(ans,sum);
                    }
                    else sum=0;
                }
            }
        }

        return ans;
    }
}
