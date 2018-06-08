package my.pack;

import java.util.Arrays;
import static Integer.MAX_INT;

/**
 * @version 1
 */
@Deprecated
public abstract class Child extends Father implements Mother {
  // one line comment
  private int intVar;
  protected Float floatVar;
  Child var;
  public static final String MY_STR = "String";
  public static final Integer MY_INT = 10;
  public static final float MY_FLOAT = 1.0f;
  public static final char MY_CHAR = 'y';
  public static final boolean IS_BOOLEAN = true;

  /*
  Multiple line comment
  */
  private enum  MyEnum{
    TEST,
    ABC
  }

  enum Test{
    A(0),
    B(2)
  }

  public Child(int intVar) {
    super();
    this.intVar = intVar;
  }

  protected Child(Float floatVar) {
    this.floatVar = floatVar;
  }

  private Child(Child child) {
    this.var = child;
  }

  private Child getVar() {
    System.out.println(var);
    var.toString();
    return var;
  }

  public void setVar(Child var) {
    this.var = var;
  }

  public void test() {
    try {
      Arrays.asList(var.toString())
          .stream()
          .filter(String::isEmpty)
          .map(v -> new Object())
          .map(o -> {
            return o.toString();
          });
      } catch (RuntimeException | Exception e) {
        e.printStackTrace();
      }
  }

  @Override
  public String toString() {
    return super.toString() + var.toString() + intVar;
  }

  private static class InnerClass {

  }
}
