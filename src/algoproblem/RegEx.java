package algoproblem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {


    private String firstName;
    private String lastName;
    private String mobileNo;
    private String date;

    //getter and setter methods

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //Method to get Date
    public String date() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return formatter.format(date);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RegEx user = new RegEx();

        String message = "Hello <<name>>, We have your full\n" +
                "name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.\n" +
                "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.\n" +
                "Use Regex to replace name, full name, Mobile#, and Date with proper value.";

        System.out.println();
        System.out.println("Enter FirstName:");
        user.setFirstName(scan.next());
        System.out.println();

        System.out.println("Enter LastName:");
        user.setLastName(scan.next());
        System.out.println();

        System.out.println("Enter Mobile Number:");
        user.setMobileNo(scan.next());
        System.out.println();
        user.setDate(user.date());

        System.out.println(convertString(user, message));

    }
    public static String convertString(RegEx userDetails, String message) {
        Pattern p = Pattern.compile("<<name>>");
        Matcher m = p.matcher(message);
        message = m.replaceAll(userDetails.getFirstName());

        p = Pattern.compile("<<full name>>");
        m = p.matcher(message);
        message = m.replaceAll(userDetails.getFirstName() + " " + userDetails.getLastName());

        p = Pattern.compile("xxxxxxxxxx");
        m = p.matcher(message);
        message = m.replaceAll(userDetails.getMobileNo());

        p = Pattern.compile("01/01/2016");
        m = p.matcher(message);
        message = m.replaceAll(userDetails.getDate());

        return message;
    }
}