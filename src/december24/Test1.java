package december24;

public class Test1 {

	int a;
	int b;
	public Test1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	//①
//	public Test1() {
//		super();
//		this(0,0);
//	}

	//②
//	public Test1() {
//		this(0, 0);
//		super();
//	}

	//③
//	public Test1() {
//		this(0, 0);
//	}

	//④
//	public Test1() {
//		this();
//	}

}
