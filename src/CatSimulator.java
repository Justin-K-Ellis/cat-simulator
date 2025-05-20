import java.util.Scanner;

public class CatSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Cat Simulator!");
        System.out.println("First, tell me about your cat.");
        System.out.println("What is their name?");
        String name = scanner.nextLine();
        System.out.println("How old are they?");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("What color are they?");
        String color = scanner.nextLine();
        System.out.println("Male or female?");
        String sex = scanner.nextLine();
        Cat cat = new Cat(name, age, color, sex);
        System.out.println(cat.describe());


        String mainPrompt = "What do you want to do?";
        mainPrompt += "\n1. Pet cat.";
        mainPrompt += "\n2. Feed cat.";
        mainPrompt += "\n3. Neuter cat.";
        mainPrompt += "\n4. Describe cat.";
        mainPrompt += "\n5. Quit.";


        while (true) {
            System.out.println(mainPrompt);
            String answer = scanner.nextLine();
            switch (answer) {
                case "1":
                    cat.pet();
                case "2":
                    //todo
                case "3":
                    cat.neuter();
                case "4":
                    cat.describe();
                case "5":
                    System.out.println("Thank you for playing Cat Simulator.");
                    break;
            }
        }
    }
}
