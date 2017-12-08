import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

//test comment
public class AddressDirectory
{
  public static void PrintContacts (PrintWriter out, ArrayList<String> familyName, ArrayList<String> streetAddress, ArrayList<String> cityStateZip, ArrayList<String> phoneNumber, ArrayList<String> email)
  {
    int size2 = familyName.size();
    String temp = "";
    for (int i = 0; i < size2; i++)
    {
      temp = temp + (i + 1) + ".Name: " + familyName.get(i) + "\r\n";
      temp = temp + "Street Adress: " + streetAddress.get(i) + "\r\n";      
      temp = temp + cityStateZip.get(i) + "\r\n";
      temp = temp + "Phone Number: " + phoneNumber.get(i) + "\r\n";
      temp = temp + "Email: " + email.get(i) + "\r\n\r\n";
      
//      out.printf(i + 1 + ".Name: " + familyName.get(i));
//      out.println();
//      out.printf("Street Adress: " + streetAddress.get(i));
//      out.println();
//      out.printf(cityStateZip.get(i));
//      out.println();
//      out.printf("Phone Number: " + phoneNumber.get(i));
//      out.println();
//      out.printf("Email: " + email.get(i));
//      out.println();
    }
     out.printf(temp);
     out.close();
     
    
   
  }
 
  public static void main(String[] args) throws FileNotFoundException
  {
    Scanner in = new Scanner(System.in);
    
    //Asking the user to name the file of the direcctory
    System.out.print("Please enter a file name for your Directory: ");
    File outputFile = new File(in.next());
    PrintWriter out = new PrintWriter(outputFile);
    
    System.out.print("Please enter how many contacts you want in your Directory: ");
    int size = in.nextInt();
    
    ArrayList<String> familyName = new ArrayList<String>();
    ArrayList<String> streetAddress = new ArrayList<String>();
    ArrayList<String> cityStateZip = new ArrayList<String>();
    ArrayList<String> phoneNumber = new ArrayList<String>();
    ArrayList<String> email = new ArrayList<String>();
    
    //This is the Loop that takes all the inputs for contacts
    
    while (size > 0)
    {
      System.out.println("Please enter the name of the Contact: ");
      in.nextLine();
      familyName.add(in.nextLine()); 
      System.out.println("Please enter the street address: ");
      streetAddress.add(in.nextLine());
      System.out.println("Please enter the City, State and Zip code");
      System.out.println("Example: Oxford OH, 11100");
      cityStateZip.add(in.nextLine());
      System.out.println("Please enter the phone number: ");
      phoneNumber.add(in.nextLine());
      System.out.println("Please enter the email address");
      email.add(in.nextLine());
      
      size--;
    }
    
    PrintContacts(out ,familyName, streetAddress, cityStateZip, phoneNumber, email);
    
    in.close();

  }
}
    
    
    
    