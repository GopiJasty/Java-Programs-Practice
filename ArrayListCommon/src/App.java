import java.util.ArrayList;
import java.util.Scanner;

public class App {
    /**
    * @param args
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       int i;
       int j;
        ArrayList<Integer> al1= new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        ArrayList<Integer> al3 = new ArrayList<>();
        
        // Add elements to the first array list
        
         System.out.println("Add elements to the first array list:");
         for (i=0; i <5 ; i++ ) {
            al1.add(i, sc.nextInt());
            System.out.print(al1.get(i)+" ");
            
         }
         System.out.println("");
         System.out.println("Add elements to the second array list:");
         for (i=0; i < 5 ; i++ ) {
            al2.add(i,sc.nextInt());
            System.out.print(al2.get(i)+" ");
         }
         
         for(i=0;i<5;i++){
            for(j=0;j<5;j++){
             if(al1.get(i)==al2.get(j)){
               al3.add(al2.get(j));
             }
            }
         }
         
         System.out.print(al3);
         

    }
}
