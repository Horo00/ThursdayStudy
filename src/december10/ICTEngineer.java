package december10;

public class ICTEngineer {
	int id;
	String name;
	String gender;

//	public ICTEngineer(int id, String name, String gender) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.gender = gender;
//	}


//	---------------------------------------------------------------//
	String teacherName;

public ICTEngineer(int id, String name, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.teacherName = "菊池先生";
}

//---------------------------------------------------------------------

	int teacherHealth = 100;

	public void question() {
		System.out.println(name + "は先生に質問をした" + teacherName + "の体力が10減った");
		teacherHealth -= 10;

		if(teacherHealth < 0 ) {
			throw new NullPointerException("先生が倒れてしまった・・・");
		}

		System.out.println(teacherName + "の現在体力:" + teacherHealth);
	}
}
