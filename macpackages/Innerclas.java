package macpackages;

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

public class Innerclas {

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
		Innerclas in = new Innerclas();
		in.methodB();

		RegularInnerClass rin = in.new RegularInnerClass();
		rin.methodA();

		Innerclas.StaticInnerClass sin = new StaticInnerClass();
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

	}

}
