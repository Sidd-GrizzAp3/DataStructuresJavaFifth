import java.util.*; 
import java.lang.*; 
public class ArrayStack <E> implements Stack <E> {

    protected int capacity; // how mane elements can this stack hold 
    public static final int CAPACITY = 10; // this is the cap 
    protected E  S[];       // generic array used to implement the stack 
    public int top = -1;    // pointer for the top of the stack 

    // constructor: 
    public ArrayStack () {
        this.capacity = CAPACITY; 
        S = (E[]) new Object [capacity]; // casting the object's type to generic [] 
    }

    public int size () {
        return this.top + 1; 
    }
    
    public boolean isEmpty () {
        return (this.top == -1 ) ; 
    }

    /**
    * Inspect the element at the top of the stack.. 
    * @return top element in the stack.
    * @exception EmptyStackException if the stack is empty.
    */
    public E top ()
    throws EmptyStackException {
        if ( isEmpty() ) throw new EmptyStackException (); 
        else {
            return this.S[this.top]; 
        }
    }
    /**
    * Insert an element at the top of the stack. 
    * @param element to be inserted.
    */
    public void push (E element) {
        this.S[++this.top] = element; 
    }
    /**
    * Remove the top element from the stack.
    * @return element removed.
    * @exception EmptyStackExceptionif the stack is empty. */
    public E pop ()
    throws EmptyStackException{
        if (isEmpty()) throw new EmptyStackException (); 
        else {
            E temp = this.S[this.top];  
            this.S[this.top--] = null;
            return temp; 
        }
    }

    public String toString() {
        String s = "";
              System.out.println(size());
        s += "[";  
        if (size() > 0) s += S[0]; 
        if (size() > 1) 
            for (int i = 1; i < size(); i++) {
                s += ", " + S[i]; 
            }
        return s+="]"; 
    }
}

