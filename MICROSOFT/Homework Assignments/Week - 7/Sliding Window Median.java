class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        Comparator<Integer> comp=new Comparator<>(){
            public int compare(Integer x,Integer y){
                if(nums[x]!=nums[y]){
                    return Integer.compare(nums[x],nums[y]);
                }
                else{
                    return x-y;
                }
            }
        };
        TreeSet<Integer> l=new TreeSet<>(comp.reversed());
        TreeSet<Integer> r=new TreeSet<>(comp);
        double[] fr=new double[nums.length-k+1];
        for(int i=0;i<k;i++){
            l.add(i);
        }
        sw(l,r);
        fr[0]=Median(k,nums,l,r);
        int m=1;
        for(int i=k;i<nums.length;i++){
            if(!l.remove(i-k)){
                r.remove(i-k);
            }
            r.add(i);
            l.add(r.pollFirst());
            sw(l,r);
            fr[m]=Median(k,nums,l,r);
            m++;
        }
        return fr;
    }
    private void sw(TreeSet<Integer> l,TreeSet<Integer> r){
        while(l.size()>r.size()){
            r.add(l.pollFirst());
        }
    }
    private double Median(int k,int[] nums,TreeSet<Integer> l,TreeSet<Integer> r){
        if(k%2==0){
            return ((double) nums[l.first()]+nums[r.first()])/2;
        }
        else{
            return (double) nums[r.first()];
        }
    }
}
