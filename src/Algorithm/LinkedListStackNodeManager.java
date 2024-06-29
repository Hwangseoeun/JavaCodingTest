package Algorithm;

public class LinkedListStackNodeManager {
    LinkedListStackNode top;

    public LinkedListStackNodeManager(){
        this.top = null;
    }

    public void push(int data){
        LinkedListStackNode node = new LinkedListStackNode(data);
        node.linkNode(top);
        top = node;
    }

    public void pop(){
        top = top.getNextNode();
    }

    public int peek(){
        return top.getData();
    }
}
