import java.util.EmptyStackException;

// generic 
public class NodeStack <E> implements Stack <E> {

    private Node <E> top; 
    private int size; 
    
    public NodeStack () {
        this.top    = null; 
        this.size   = 0; 
    }
    
    /**
    * Return the number of elements in the stack.
    * @return number of elements in the stack.
    */
    public int size () {
        return this.size; 
    }
    /**
    * Return whether the stack is empty.
    * @return true if the stack is empty, false otherwise.
    */
    public boolean isEmpty () {
        return (this.size() == 0); 
    }
    /**
    * Inspect the element at the top of the stack.. *@return top element in the stack.
    * @exception EmptyStackException if the stack is empty.
    */
    public E top ()
    throws EmptyStackException{
        if (this.isEmpty()) throw new EmptyStackException(); 
        else {
            return top.getData(); 
        }
    }
    /**
    * Insert an element at the top of the stack. * @param element to be inserted.
    */
    public void push (E data){
        // save the current head. 
        //Node <E> temp = top;
        // creaate a new node
        Node <E> newNode = new Node (data, top);  
        // insert the data 
        // make it the head
        top = newNode; 
        // set its next to the saved previous head
        this.size++; 


    }
    /**
    * Remove the top element from the stack.
    *@return element removed.
    * @exception EmptyStackExceptionif the stack is empty. */
    public E pop ()
    throws EmptyStackException{
        if (this.isEmpty()) throw new EmptyStackException(); 
        else {
            // get the top 
            E data = top.getData();
            // set top -> next to the top , 
            top = top.getNext(); 
            // decrement the size counter 
            this.size--; 
            // return the temporarily savved top's data 
            return data; 
        }

    }


}