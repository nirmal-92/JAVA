public class NestedTryBlock2 {
    public static void main(String[] args) {
        //outer (main) try block
        try{
            //inner try block 1
            try{
                //inner try block 2
                try{
                    int arr[] = {1,2,3,4};
                    //printing the array elements out of its bound
                    System.out.println(arr[10]);
                }
                catch(ArithmeticException e){
                    System.out.println("Arithmetic Exception occurs");
                    System.out.println("inner try block 2");
                }
            }
            catch(ArrayIndexOutOfBoundsException e4){
                System.out.println(e4);
                System.out.println("outer (main) try block");
            }
        }
        catch(Exception e5){
            System.out.println(e5);
            System.out.println("Exception occurs");
        }
    }
}
