package macpackages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
// Pattern pt=Pattern.compile("[A-Za-z]+");
// Matcher m=pt.matcher("efsd");
// Boolean b=m.matches();

public class InnerClass {

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
		InnerClass in = new InnerClass();
		in.methodB();

		RegularInnerClass rin = in.new RegularInnerClass();
		rin.methodA();

		InnerClass.StaticInnerClass sin = new StaticInnerClass();
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
