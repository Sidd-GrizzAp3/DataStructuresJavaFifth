public class ArrayQueue <E> implements Queue <E> {
    
    private int size; 
    private int f; 
    private int r; 
    private int N;
    private E array []; 
    public static final int CAPACITY = 10; 


    // consstructor 
    public ArrayQueue () {
        N = CAPACITY; 
        array = (E[]) new Object [N]; 
        f = 0; 
        r = 0; 
        size = 0; 
    } 


    public int size () {
        return (N - f + r) % N; 
    }
    /**
    * Returns whether the queue is empty.
    * @return true if the queue is empty, false otherwise. */
    public boolean isEmpty () {
        return (size() == 0); 
    }
    /**
    * Inspects the element at the front of the queue.
    * @return element at the front of the queue.
    * @exception EmptyQueueException if the queue is empty. */
    public E front () throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException (); 
        return array[i]; 
    }
    /**
    *Inserts an element at the rear of the queue. *@param element new element t () be inserted. */
    public void enqueue (E element) throws FullQueueException {
        // append it to the array, by deducing the inedex 
        if (size() == N-1) throw new FullQueueException (); 
        array[r] = element; 
        r = (r +1) % N;  // circular array wrapping around of the 
    }
    /**
    * Removes the element at the front of the queue. *@return element removed.
    * @exception EmptyQueueException if the queue is empty. */
    public E dequeue () throws EmptyQueueException {
        
    }
    
}