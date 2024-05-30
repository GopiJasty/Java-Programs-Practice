public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int[] arr1= {1,2,3,4};
        int count=0;
        int sum=5;
        int total=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
               total=arr1[i]+arr1[j];
              // while(arr1[i]!=0||arr1[j]!=0){
                if(sum==total){
                    count++;
                }
            
            }
            
        }
        System.out.println(count);

    }
}
