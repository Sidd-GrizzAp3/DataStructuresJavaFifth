public class Scores {
    public static final int maxEntries = 10; 
    protected int numEntries; 
    protected GameEntry[] entries; 

    public Scores() {
        entries = new GameEntry [maxEntries]; 
        numEntries = 0 ; 
    }    

    public String toString() {
        String s = "["; 
        for (int i = 0 ; i < numEntries ; i ++ ) {
            if ( i > 0) s += ", "; 
            s += entries[i]; 
        }
        return s + "]"; 
    }

    public void add (GameEntry e) {
        int newScore = e.getScore(); 
        if (numEntries == maxEntries) {
            if (newScore < entries[numEntries - 1].getScore() )  return; 
        }
        else 
            numEntries++; 
        
        int i = numEntries - 1;
        for ( ; (i >= 1) && (newScore > entries[i-1].getScore()); i--) {
            entries[i] = entries[i-1]; 
        }
        entries[i] = e; 
    }

    // implement the remove function and then look into the 
        // detailed soultion at 122
    public GameEntry remove  (int i )  
        throws IndexOutOfBoundsException 
    {
        //TODO: implement this bit 
        // remove the one in question. 
        // throw an exception if we're out of bounds for the array 
        if (( i < 0) || (i > numEntries))
            throw new IndexOutOfBoundsException("Invalid Index: " + i);
        

        /*
        int i = numEntries -1;
        for ( ; (i >=1 )  ; i--) {
           if ( e.getScore() == entries[i].getScore()  ) break;
        }
        // entry was found, now remove it 
        */
        GameEntry temp = entries[i];
        // move all the ones to the right of it to the left 
        int iterationCount = numEntries - 1; 
        for(; i < iterationCount ; i ++  ) {
            // move each element up 
            entries[i] = entries[i+1];  
        }
        // make last element null 
        entries[++i] = null; 
        // decrement the number of entries;
        numEntries--;  
        return temp;
    }

}