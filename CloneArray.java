public class CloneArray{
	public static void main(String[] args){
		int myArray[][] = {{1,2,3},{4,5,6}};
		int cloneArray[][] = myArray.clone();
		System.out.println(myArray == cloneArray);
		System.out.println(myArray[1] == cloneArray[1]);
	}
}