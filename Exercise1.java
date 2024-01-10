import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.Scanner; 
public class Exercise1 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a short date in this format (YYYY-MM-DD): "); 
        String shortDate = scanner.next(); 
        try { 
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(shortDate); 
            String monthName = new SimpleDateFormat("MMMM").format(date); 
            String fullDate = new SimpleDateFormat("MMMM dd, yyyy").format(date); 
            System.out.println("Full Date: " + fullDate); 
        } catch (Exception e) { 
            System.out.println("Invalid date format. Please enter date in YYYY-MM-DD format."); 
        } 
    } 
}