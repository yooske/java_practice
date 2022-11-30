package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
	public static void main(String[] args) {
		Human04 yamada = new Human04("山田");
		Human04.staticMethodPoint();
		System.out.println(Human04.GREETING);

		yamada.instanceMethodPoint();
	}
}
