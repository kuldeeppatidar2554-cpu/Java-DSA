public class VariableNamingRules {
    public static void main(String[] args) {

        // Valid variable names
        int age = 20;
        int Age = 25;          // Case-sensitive
        int studentAge = 21;   // Camel case
        int student_age = 22;  // Underscore allowed
        int $salary = 50000;   // $ allowed
        int _marks = 95;       // Starts with underscore
        int num1 = 100;        // Numbers allowed after first character

        System.out.println(age);
        System.out.println(Age);
        System.out.println(studentAge);
        System.out.println(student_age);
        System.out.println($salary);
        System.out.println(_marks);
        System.out.println(num1);

        // Invalid variable names (Examples only)

        // int 1num = 10;       // Cannot start with a number
        // int my-name = 20;    // Hyphen (-) not allowed
        // int student name = 30; // Space not allowed
        // int class = 40;      // Reserved keyword
        // int @age = 50;       // Special characters not allowed
    }
}
