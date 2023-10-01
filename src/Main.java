import java.util.Scanner;

class BirthMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your birth month (integer 1 - 12 inclusive): ");
        int birthMonth = input.nextInt();

        if (birthMonth >= 1 & birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

        input.close();
    }
}
