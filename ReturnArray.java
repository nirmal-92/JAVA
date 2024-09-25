public class ReturnArray{
	public static int[] doMultiplication(int[] arr){
		for(int i = 0;i<arr.length;i++){
			arr[i] = arr[i] * 2;
		}
		return arr;
	}
public static void main(String[] args){
	int myArray = {1,2,3,4,5};
	int[] multiplyArr = doMultiplication(myArray);
	System.out.println("Multiplication of the array by 2 is -");
	for(int i : multiplyArr){
		System.out.println(i + " ");
	}
}
}