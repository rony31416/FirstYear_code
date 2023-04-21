package generics;

public class Stack_generics {

	private Double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
	private Integer[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

	private String[] stringElements = { "rony", "majumder", "hello", "bangladesh", "varsity" };

	private Stack<Double> doubleStack;
	private Stack<Integer> integerStack;
	private Stack<String> stringStack;

	public void testStacks() {
		doubleStack = new Stack<Double>(5);
		integerStack = new Stack<Integer>(10);
		stringStack = new Stack<String>(4);

		testPush("doubleStack", doubleStack, doubleElements);
		testPop("doubleStack", doubleStack);
		testPush("integerStack", integerStack, integerElements);
		testPop("integerStack", integerStack);
		testPush("stringStack", stringStack, stringElements);
		testPop("stringStack", stringStack);

	}

	public <T> void testPush(String name, Stack<T> stack, T[] elements) {
		try {
			System.out.printf("\nPushing elements onto %s\n", name);

			for (T element : elements) {
				System.out.printf("%s ", element);
				stack.push(element);
			}

		} catch (FullStackException fullStackException) {
			System.out.println();
			fullStackException.printStackTrace();
		}
	}

	public <T> void testPop(String name, Stack<T> stack) {
		try {
			System.out.printf("\nPushing elements onto %s\n", name);

			T popValue;

			while (true) {
				popValue = stack.pop();
				System.out.printf("%s ", popValue);
			}
		} catch (EmptyStackException emptyStackException) {
			System.out.println();
			emptyStackException.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Stack_generics application = new Stack_generics();
		application.testStacks();
	}

}
