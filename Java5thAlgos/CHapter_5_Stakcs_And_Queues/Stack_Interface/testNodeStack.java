import java.util.*; 
public class testNodeStack {
    
    public static void main (String [] args) {
        /** 
        ArrayStack <Integer> stack  = new ArrayStack <Integer> ();  
        stack.push(1); 
        stack.push(2); 
        stack.push(3);
        System.out.println(stack.pop()); 
        System.out.println(stack.toString()); 
        **/

        NodeStack <Integer> nodeStack = new NodeStack <Integer> (); 
        
        int [] randomArray =  {1,2,3,4,5,6,7,8,9,10}; 
        Integer [] randomArray2 =  {1,2,3,4,5,6,7,8,9,10}; 

        int [] answer = new int [randomArray.length];

        answer = reverseArray(randomArray, nodeStack); 
        reverse(randomArray2); 

        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(randomArray2));
    }

    public static int [] reverseArray (int [] randomArray, NodeStack <Integer> nodeStack) {
        // iterate through the array, and push all of the elements onto the stack, 
        for (int i = 0; i < randomArray.length; i++) {
            nodeStack.push(randomArray[i]); 
            System.out.println(randomArray[i]); 
        }
        // then once done, iterate and popall values out. 
        for (int i = 0; i < randomArray.length; i ++) {
            randomArray[i] = nodeStack.pop(); 
        }

        return randomArray; 
    }

    public static <E> void reverse (E[] array) {
        NodeStack <E> stack = new NodeStack <E> ();
         for (int i = 0; i < array.length; i++) {
             stack.push(array[i]); 
         }
         for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop(); 
         }
    }
}