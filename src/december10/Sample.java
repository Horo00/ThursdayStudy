package december10;

import java.awt.Color;

public class Sample {
	public static void main(String[] args) {
		System.out.println(ParentStatic.sample);
		System.out.println(ChildStatic.sample);
		System.out.println(ChildStatic.hoge);

		ParentStatic parent = new ParentStatic();
		System.out.println(parent.sample);

		parent = new ChildStatic();
		System.out.println(parent.sample);
		System.out.println(parent.hoge);
		
		ChildStatic child = new ChildStatic();
		System.out.println(child.hoge);
		
		ChildStatic.name();
		child.name();
		
		System.out.println(Color.RED);
	}
}
