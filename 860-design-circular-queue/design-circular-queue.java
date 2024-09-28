class MyCircularQueue {
    int capacity;
    int f,r;
    int queue[];
    int size;
    public MyCircularQueue(int k) {
        capacity=k;
        f=-1;
        r=-1;
        size=0;
        queue=new int[capacity];
        
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
           return false;
        }
        else{
             if(isEmpty()){
                f=r=0;
            }
            else{
                r=(r+1)%capacity;
            }
            queue[r]=value;
            size++;
            
        }
        return true;   
    }
    
    public boolean deQueue() {
         if(isEmpty()){
            f=r=-1;
            return false;
        }
        else{
        int x=queue[f];
        f=(f+1)%capacity;
       
        size--;
        }
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return queue[f];
        
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return queue[r];
    }
    
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
        
    }
    
    public boolean isFull() {
        
        if(size==capacity){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */