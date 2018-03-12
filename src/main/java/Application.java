import java.time.LocalDate;
import java.time.LocalDateTime;

public class Application {

  public static void main(String[] args) {

    LocalDate todayDate = LocalDate.now();
//    LocalDateTime time = LocalDateTime.now();
    Operations obj = new Operations();
    String dob = "1994-06-30";
    System.out.println("Birthday days");
    System.out.println(obj.getDayOfBirth(dob));
    System.out.println("Number of seconds Mahatma Gandhi lived");
    System.out.println(obj.getSeconds());
    System.out.println("Current time of the given Time Zone.");
    System.out.println(obj.getTimeOfZone("UTC"));
    System.out.println("All the leap years from 1900 till date.");
    System.out.println(obj.getLeapYear(todayDate,1900));
  }

}
