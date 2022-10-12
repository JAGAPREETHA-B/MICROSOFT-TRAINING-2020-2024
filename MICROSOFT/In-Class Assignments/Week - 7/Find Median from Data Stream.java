class MedianFinder {
    
    private PriorityQueue<Integer> maxVal=new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> minVal=new PriorityQueue<>();
    private boolean Even=true;
    
    public void addNum(int num) {
        if(Even){
            minVal.offer(num);
            maxVal.offer(minVal.poll());
        }
        else{
            maxVal.offer(num);
            minVal.offer(maxVal.poll());
        }
        Even=!Even;
    }
    
    public double findMedian() {
        if(Even){
            return (maxVal.peek()+minVal.peek())/2.0;
        }
        else{
            return maxVal.peek();
        }
    }
}
