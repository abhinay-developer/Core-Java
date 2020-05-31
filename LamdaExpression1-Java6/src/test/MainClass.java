package test;

public class MainClass {

	public static void main(String[] args) {
		Addition ob1 = new Addition();
		Subtraction ob2 = new Subtraction();
		Multiplication ob3 = new Multiplication();
		Division ob4 = new Division();
		ModDivision ob5 = new ModDivision();
		System.out.println("Add:" + ob1.process(10, 20));
		System.out.println("Sub:" + ob2.process(10, 20));
		System.out.println("Mul:" + ob3.process(10, 20));
		System.out.println("Div:" + ob4.process(10, 20));
		System.out.println("ModDiv:" + ob5.process(10, 20));

	}

}
