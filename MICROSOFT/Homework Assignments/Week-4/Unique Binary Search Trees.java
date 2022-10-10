class Solution {
    public int numTrees(int n) {
        return cn(n);
    }
    public int cn(int n){
        int[] cn=new int[n+1];
        cn[0]=1;
        cn[1]=1;
        for(int i=2;i<=n;i++){
            cn[i]=0;
            for(int j=0;j<i;j++){
                cn[i]+=cn[j]*cn[i-j-1];
            }
        }
        return cn[n];
    }
}
