//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class test {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //
        HashMap <String , Integer> map = new HashMap <String, Integer> (); 
        // get input and populate map 
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone); 
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            try  {
                int number = map.get(s); 
                System.out.println(s+"="+number); 
            } catch (Exception e) {
                // hoping tha this is a an't find error 
                System.out.println("Not found"); 
            }
        }
        in.close();
    }
}
