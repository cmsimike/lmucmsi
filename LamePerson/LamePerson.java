// This is a bad way to write depict a Person in code 
public class LamePerson {
    public static void main(String[] args) {
        if(args.length != 3) {
            //throw new IllegalArgumentException("Not enough args");
            System.err.println("Usage:");
            System.err.println("java LamePerson <firstname> <lastName> <age>");
            return;
        }
        String firstName = args[0];
        String lastName = args[1];
        int age = Integer.parseInt(args[2]);

        System.out.println("Person created:");
        System.out.println("first name: " + firstName);
        System.out.println("last name: " + lastName);
        System.out.println("age: " + age);
        System.out.println("HAPPY BIRTHDAY!!");

        age = age + 3; // BAD, no protection
    }
}