package java_code.danyuan10;

public class TestStackOfIntegers {
  public static void main(String[] args) {
    System.out.println();

    StackOfIntegers stack = new StackOfIntegers();

    for (int i = 0; i < 10; i++) {
      stack.push(i);
    }

    while(!stack.empty()){
      System.out.print(stack.pop()+"  ");
    }
  }
}
