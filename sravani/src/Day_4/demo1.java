package Day_4;
class priv{
	protected void add() {
		System.out.println("hi");
	}
}
public class demo1 extends priv {

	public static void main(String[] args) {
		
		demo1 p=new demo1();
		p.add();//we are trying to access but it is private method
	}

}
