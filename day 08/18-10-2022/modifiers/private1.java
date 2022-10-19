package modifiers;

public class private1 extends priv {
	public static void main(String[] args) {
		priv obj=new private();
		//compile error cause private methods cannot be accessed outside the class
		obj.display();
	}
}
