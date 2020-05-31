package test;

public class MainClass {

	public static void main(String[] args) {
		Arithemetic ob1 = new Arithemetic() {

			@Override
			public float process(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;
			}
		};
		Arithemetic ob2 = new Arithemetic() {

			@Override
			public float process(int x, int y) {
				// TODO Auto-generated method stub
				return x - y;
			}
		};
		Arithemetic ob3 = new Arithemetic() {

			@Override
			public float process(int x, int y) {
				// TODO Auto-generated method stub
				return x * y;
			}
		};
		Arithemetic ob4 = new Arithemetic() {

			@Override
			public float process(int x, int y) {
				// TODO Auto-generated method stub
				return (float) x / y;
			}
		};
		Arithemetic ob5 = new Arithemetic() {

			@Override
			public float process(int x, int y) {
				// TODO Auto-generated method stub
				return x % y;
			}
		};
		System.out.println("Add:" + ob1.process(10, 20));
		System.out.println("Sub:" + ob2.process(10, 20));
		System.out.println("Mul:" + ob3.process(10, 20));
		System.out.println("Div :" + ob4.process(10, 20));
		System.out.println("ModDiv:" + ob5.process(10, 20));

	}

}
