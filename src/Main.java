import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        GeneralDog alsation = new GeneralDog("donky");
        System.out.println("our record about your dog is: ");
        alsation.writeOutput();
        System.out.println("please enter the correct name");
        String correctName = keyboard.nextLine();
        alsation.setName(correctName);
        System.out.println("correct age");
        int correctAge = keyboard.nextInt();
        alsation.setAge(correctAge);
        System.out.println("correct Weight");
        double correctWeight = keyboard.nextDouble();
        alsation.setWeight(correctWeight);
        System.out.println("my updated record now says");
        alsation.writeOutput();





    }
}
