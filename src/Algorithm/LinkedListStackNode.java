package Algorithm;

import org.w3c.dom.Node;

public class LinkedListStackNode {
    private int item;
    private LinkedListStackNode node;

    public LinkedListStackNode(int item){
        this.item = item;
        this.node = null;
    }

    protected void linkNode(LinkedListStackNode node){
        this.node = node;
    }

    protected int getData(){
        return this.item;
    }

    protected LinkedListStackNode getNextNode(){
        return this.node;
    }
}
