public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("|----------STACK----------|");

        Stack stack=new Stack();

        stack.push(56);
        stack.push(30);
        stack.push(70);

        System.out.println("Top element:"+stack.peek());
        stack.display();
        System.out.println("Top(peek) of stack:"+stack.peek());
        System.out.println("After pop operation");
        stack.pop();
        stack.display();

        System.out.println("Top(peek) of stack:"+stack.peek());
        System.out.println("After pop operation");
        stack.pop();
        stack.display();

        System.out.println("Top(peek) of stack:"+stack.peek());
        System.out.println("After pop operation");
        stack.pop();
        stack.display();

        System.out.println("Top(peek) of stack:"+stack.peek());
        System.out.println("After pop operation");
        stack.pop();
        stack.display();




    }
}
