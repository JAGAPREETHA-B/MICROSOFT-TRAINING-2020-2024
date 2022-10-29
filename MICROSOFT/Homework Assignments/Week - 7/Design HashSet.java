class MyHashSet {

    //public MyHashSet() {
        boolean[] res=new boolean[1000001];   
    //}
    
    public void add(int key) {
        res[key]=true;
    }
    
    public void remove(int key) {
        res[key]=false;
    }
    
    public boolean contains(int key) {
        return res[key];
    }
}
