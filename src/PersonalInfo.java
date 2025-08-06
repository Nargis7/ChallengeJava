//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PersonalInfo {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("*\n* *\n* * *\n* * * *\n* * * * *");
//        System.out.println("* * * * *\n* * * *\n* * *\n* *\n*");
//        System.out.println("        *\n      * *\n    * * *\n  * * * *\n* * * * *");

        if(args.length != 3){
            System.out.println("Usage: java PersonalInfo <Name>  <DateOfbirth>  <MobileNumber>");
            return;
        }
        String name = args[0];
        String dob = args[1];
        String Mobile = args[2];

        System.out.println("Name: " + name);

        System.out.println("Date of Birth: " + dob);

        System.out.println("Mobile Number: " + Mobile);
    }
}