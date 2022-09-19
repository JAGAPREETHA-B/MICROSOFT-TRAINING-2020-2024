class Solution {
    public int countStudents(int[] students, int[] sandwiches){
        int oc=0;
        int zc=0;
        for(int stu:students){
            if(stu==0){
                zc++;
            }
            else{
                oc++;
            }
        }
        for(int swh:sandwiches){
            if(swh==0){
                if(zc==0){
                    return oc;
                }
                zc--;
            }
            else{
                if(oc==0){
                    return zc;
                }
                oc--;
            }
        }
        return 0;
    }
}
