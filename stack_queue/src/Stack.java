public class Stack<T> {
    
    private LinkedList stackList;

    Stack(){
       this.stackList = new LinkedList<>();
    }

    public void push(T data){
        this.stackList.insertAt(0,data);
    }

    public void pop(){
        this.stackList.deleteFrom(0);
    }

    public boolean isEmpty(){
        return this.stackList.head==null;
    }

    public T peek(){
        if(isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return (T)this.stackList.head.data;

    }

    public int size(){
        return this.stackList.size();
    }

    public void display(){
        this.stackList.display();
    }

}
