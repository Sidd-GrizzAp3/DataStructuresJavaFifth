
public class InsertionSort  {

    public int count = 0; 
    public void InsertionSort() {
        // void 
        this.count = 0; 
    }
    public int [] sort(int [] arr) {
        // go through each element 
        // if the element is smaller than the element before it swap. 
        int count = 0; 
        for (int i = 1; i < arr.length; i++) {
        
            for (int j = i - 1; j >= 0; j--) { 
                count++; 
                if (arr[i]<arr[j]) {
                    int temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp; 
                    i = j; 
                }
            }
        
        }
        this.count = count; 
        return arr; 
    }

}