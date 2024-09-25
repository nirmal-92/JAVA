public class ThisMain{
	int x;
	
	public ThisMain(int x){
		this.x = x;
	}
	
	public static void main(String[] args){
		ThisMain myobj = new ThisMain(5);
		System.out.println("Value of x:" + myobj.x);
		}
}