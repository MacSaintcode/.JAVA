//package macpackages;
//
//class Arithmetic {
//	void add() {
//		System.out.println("hello");
//	}
//
//	void subtract() {
//	}
//}
//
//class One {
//	void oneAdd(Arithmetic ar) {
//		ar.add();
//	}
//}
//
//public class InnerClasses {
//
//	class RegularInnerClass {
//		void methodA() {
//		}
//	}
//
//	static class StaticInnerClass {
//		void methodC() {
//		}
//	}
//
//	void methodB() {
//		class MethodLocalInnerClass {
//			void methodD() {
//				System.out.println("MethodLocalInnerClass");
//			}
//		}
//		MethodLocalInnerClass mlic = new MethodLocalInnerClass();
//		mlic.methodD();
//	}
//
//	public static void main(String[] args) throws Exception {
//		InnerClasses in = new InnerClasses();
//		in.methodB();
//
//		RegularInnerClass rin = in.new RegularInnerClass();
//		rin.methodA();
//
//		InnerClasses.StaticInnerClass sin = new StaticInnerClass();
//		sin.methodC();
//
//		Arithmetic arr = new Arithmetic();
//
//		One hi = new One();
//		hi.oneAdd(arr);
//		hi.oneAdd(new Arithmetic());
//
//		One h2 = new One();
//		h2.oneAdd(new Arithmetic() {
//			@Override
//			void add() {
//				System.out.println("new definition");
//			}
//
//			void divide() {
//			}
//		});
//
//	}
//
//}
