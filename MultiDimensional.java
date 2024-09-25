public class MultiDimensional{
	public static void main(String[] args){
		int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][] = {{2,2,2},{2,2,2},{2,2,2}};

		//Printing array1
		System.out.println("Array -");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println(arr1[i][j] + " ");
			}
			System.out.println();
		}	
		
		//Printing array2
		System.out.println("Array2 -");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println(arr2[i][j] + " ");
			}
			System.out.println();
		}

		//Another array with the same dimension array to store the result
		int arr3[][] = new int[3][3];
		
		System.out.println("Multiplication of array1 and array2 -");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				arr3[i][j] = 0;
				for(int k = 0;k<arr3.length;k++){
					arr3[i][j]+=arr1[i][k] * arr2[k][j];
				}
				System.out.println(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
}	