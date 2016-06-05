package java_lab_5.pasha.main;

public class B extends A implements I2 {

	public static String bStart() {
		B b = new B();
		String result = b.b1();

		A a = new A();
		result = result + "\n" + a.a1();

		I1 i1 = new A();
		result = result + "\n" + i1.i1();

		I2 i2 = new B();
		result = result + "\n" + i2.i2();

		I1 bNew = (I1) b;
		result = result + "\n" + ((B) bNew).b1();

		I1 aNew = (I1) a;
		result = result + "\n" + ((A) aNew).a1();

		I1 i1New = (I1) i1;
		result = result + "\n" +  i1New.i1();

		I1 i2New = (I1) i2;
		result = result + "\n" + ((I2) i2New).i2();
		return result;
	}

	public String b1() {
		return "Class B, Method b1";
	}

}
