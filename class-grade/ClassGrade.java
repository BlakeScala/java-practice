import java.io.Console;

public class ClassGrade {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("What grade did you get in your last class? (A, B, C, D, F)");
    String userGrade = console.readLine();

    Boolean goodGrade = userGrade == "A" || userGrade == "B";
    Boolean midGrade = userGrade == "C";
    Boolean badgrade = userGrade == "D" || userGrade == "F";
    if ( goodGrade) {
      System.out.println("Nice job!");
    } else if ( midGrade ) {
      System.out.println("Ehh, come on man...");
    } else if ( badGrade ) {
      System.out.println("Just drop out already.");
    }
  }
}
