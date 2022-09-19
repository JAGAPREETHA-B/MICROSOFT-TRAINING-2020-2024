class MyCircularQueue {
    int[] qArr;
    int fe=0,re=-1,len=0;
    public MyCircularQueue(int k) {
        qArr=new int[k];
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            re=(re+1)%qArr.length;
            qArr[re]=value;
            len++;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            fe=(fe+1)%qArr.length;
            len--;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int Front() {
        return isEmpty()?-1:qArr[fe];
    }
    
    public int Rear() {
        return isEmpty()?-1:qArr[re];
    }
    
    public boolean isEmpty() {
        return len==0;
    }
    
    public boolean isFull() {
        return len==qArr.length;
    }
}
