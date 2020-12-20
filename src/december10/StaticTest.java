package december10;

public class StaticTest {

	String instanceString = "インスタンス変数";

	static String staticString = "クラス変数";

	void instanceToInstance() {
		System.out.println(instanceString);
	}

	void instanceToStatic() {
		System.out.println(staticString);
	}

	static void staticToInstance() {
//		System.out.println(instanceString);
	}

	static void staticToStatic() {
		System.out.println(staticString);
	}
}
