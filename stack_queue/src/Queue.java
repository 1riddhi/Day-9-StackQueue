public class Queue<T>{
    private LinkedList queueList;

    Queue(){
       this.queueList = new LinkedList<>();
    }

    public void enqueue(T data){
        this.queueList.add(data);
    }

    public boolean isEmpty() {
        return this.queueList.isEmpty();
    }

    public int size() {
        return this.queueList.size();
    }

    public void display() {
        this.queueList.display();
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        else {
            T front=(T)this.queueList.head.data;
            this.queueList.deleteFrom(0);
            return front;
        }
    }

    public T front(){
         if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        else {
            T front=(T)this.queueList.head.data;
            return front;
        }
    }

}
