public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int[] arr1= {1,2,3,4};
        int[] arr2= new int[5];
        int[] arr3= new int[5];

        int count=0;
        int sum=5;
        int total=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
               total=arr1[i]+arr1[j];
                if(sum==total){
                    arr2[i]=arr1[i];

                    arr2[j]=arr1[j];
                    System.out.print(arr2[i]+" ");
                    System.out.println(arr2[j]);
                    count++;
                }
            }
            
        }

        
        System.out.println("count=" +count);
       // for(int x=0;x<arr2.length;x++){
         //   System.out.println(arr2[x]);
        //}
    }
}
