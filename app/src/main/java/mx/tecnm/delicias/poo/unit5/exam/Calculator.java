package mx.tecnm.delicias.poo.unit5.exam;

public class Calculator {

  public int unsafeDivision(int first, int second) {
    return first / second;
  }

  public int safeDivision(int first, int second) {
    try {
      return unsafeDivision (first,second);
    } catch (ArithmeticException ae){
     return 0;
    }  
  }

  public int uncheckedDivision(int first, int second) {
    try {
      return unsafeDivision (first,second);
    } catch (ArithmeticException ae){
      throw new ArithmeticException ("Cannot divide by zero");
    }  
  }

  public int checkedDivision(int first, int second)throws DivisionByZero {
    try {
      return unsafeDivision (first,second);
    } catch (ArithmeticException ae){
      throw new DivisionByZero (ae);
    }  
}
}