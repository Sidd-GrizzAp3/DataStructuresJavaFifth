public class Node <E>{
    private     E   data; 
    private   Node <E> next; 
    
    //constructor:
    public Node (E data, Node <E> next) {
        this.data = data; 
        this.next = next; 

    }   
    public E getData () {
        return this.data; 
    }
    public Node <E> getNext () {
        return this.next; 
    }

    //setter methods: 
    public void setData (E data) {
        this.data = data; 
    }

    public void setNext (Node <E> next ) {
        this.next = next; 
    }
}