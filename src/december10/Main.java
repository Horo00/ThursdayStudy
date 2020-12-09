package december10;

public class Main {
	public static void main(String[] args) {
		ICTEngineer kawata = new ICTEngineer(5, "川田", "男性");

		ICTEngineer kuramoto = new ICTEngineer(6, "倉本", "女性");

		System.out.println("kawataの名前:" + kawata.name);

		System.out.println("kuramotoの名前:"+kuramoto.name);

		kawata.question();

		kuramoto.question();
	}

}
