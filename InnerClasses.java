package saintcoded;

class Arithmetic {
	void add() {
		System.out.println("hello");
	}

	void subtract() {
	}
}

class One {
	void oneAdd(Arithmetic ar) {
		ar.add();
	}
}

public class InnerClasses {

	class RegularInnerClass {
		void methodA() {
		}
	}

	static class StaticInnerClass {
		void methodC() {
		}
	}

	void methodB() {
		class MethodLocalInnerClass {
			void methodD() {
				System.out.println("MethodLocalInnerClass");
			}
		}
		MethodLocalInnerClass mlic = new MethodLocalInnerClass();
		mlic.methodD();
	}

	public static void main(String[] args) throws Exception {
		InnerClasses in = new InnerClasses();
		in.methodB();

		RegularInnerClass rin = in.new RegularInnerClass();
		rin.methodA();

		InnerClasses.StaticInnerClass sin = new StaticInnerClass();
		sin.methodC();

		Arithmetic arr = new Arithmetic();

		One hi = new One();
		hi.oneAdd(arr);
		hi.oneAdd(new Arithmetic());

		One h2 = new One();
		h2.oneAdd(new Arithmetic() {
			@Override
			void add() {
				System.out.println("new definition");
			}

			void divide() {
			}
		});

		Calculator cal = new Calculator() {
			public void add() {
			};

			public void subtract() {
			};

			public void divide() {
			};
		};

		Advanced ad = new Advanced();
		ad.addition(cal);

		ad.addition(new Calculator() {
			public void add() {
			};

			public void subtract() {
			};

			public void divide() {
			};
		});

	}

}

interface Calculator {
	void add();

	void subtract();

	void divide();
}

class Advanced {
	void addition(Calculator calc) {
		calc.add();
	}
}
