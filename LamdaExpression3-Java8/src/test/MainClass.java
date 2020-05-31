package test;

public class MainClass {

	public static void main(String[] args) {
		Arithemetic ob1=(int x,int y)->x+y;
		Arithemetic ob2=(int x,int y)->x-y;
		Arithemetic ob3=(int x,int y)->x*y;
		Arithemetic ob4=(int x,int y)->(float)x/y;
		Arithemetic ob5=(int x,int y)->x%y;
		System.out.println("Add:"+ob1.process(10, 20));
		System.out.println("Sub:" + ob2.process(10, 20));
		System.out.println("Mul:" + ob3.process(10, 20));
		System.out.println("Div :" + ob4.process(10, 20));
		System.out.println("ModDiv:" + ob5.process(10, 20));

	}

}
