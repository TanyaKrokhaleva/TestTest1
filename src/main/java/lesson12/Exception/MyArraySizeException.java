package lesson12.Exception;

public class MyArraySizeException extends IllegalArgumentException {
  public MyArraySizeException(String message) {
    super(message);
  }
}
