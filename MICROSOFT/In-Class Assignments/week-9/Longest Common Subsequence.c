int max(int a,int b){
    return (a>b)?a:b;
}

int longestCommonSubsequence(char * text1, char * text2){
    int m=strlen(text1);
    int n=strlen(text2);
    
    int lcs[m+1][n+1];
    for(int i=0;i<=m;i++){
        for(int j=0;j<=n;j++){
            if(i==0 || j==0){
                lcs[i][j]=0;
            }
            else if(text1[i-1]==text2[j-1]){
                lcs[i][j]=1+lcs[i-1][j-1];
            }
            else{
                lcs[i][j]=max(lcs[i-1][j],lcs[i][j-1]);
            }
        }
    }
    return lcs[m][n];
}
