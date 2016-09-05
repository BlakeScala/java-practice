import java.io.Console;

public class ClassGrade {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("What grade did you get in your last class? (A, B, C, D, F)");
    String userGrade = console.readLine();

    Boolean a = userGrade == "A";
    Boolean b = userGrade == "B";
    Boolean c = userGrade == "C";
    Boolean d = userGrade == "D";
    Boolean f = userGrade == "F";

    if ( a || b ) {
      System.out.println("Nice job!");
    } else if ( c ) {
      System.out.println("Ehh, come on man...");
    } else if ( d || f ) {
      System.out.println("Just drop out already.");
    }
  }
}
