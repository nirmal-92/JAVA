import java.io.*;
import java.util.Scanner;

public class range{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			n = sc.nextInt();
			for(int i=0;i<n;i++){
				int a;
				a = sc.nextInt();
				if(a>=0 && a<=255){
					System.out.println("Boolean");
				}
				if(a>=-128 && a<=127){
					System.out.println("Byte");
				}
				if(a>=-32768 && a<=32767){
					System.out.println("Short");
				}
				if(a>=0 && a<=255){
					System.out.println("Boolean");
				}
				if(a>=-2147483648 && a<=2147483647){
					System.out.println("int");
				}
				if(a>=-2147483648 && a<=2147483647){
					System.out.println("Boolean");
				}
			}
			System.out.println(n);
		}
	}
}