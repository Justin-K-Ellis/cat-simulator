import java.text.MessageFormat;

public class Cat {
    private String name;
    private int age;
    private String color;
    private String sex;
    private boolean isNeutered;
    private int happinessLevel;
    private boolean isPurring;

    public Cat(String name, int age, String color, String sex, boolean isNeutered) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
        this.isNeutered = isNeutered;
        this.happinessLevel = 1;
        this.isPurring = false;
    }

    public String describe() {
        String pronoun = this.sex.equals("male") ? "He" : "She";
        String neuteredStatus = this.isNeutered ? "is" : "is not";
        String description = "";
        description += MessageFormat.format("{0} is {1}.", this.name, this.color);
        description += MessageFormat.format(" {0} {1} neutered, and is {2} years old.", pronoun, neuteredStatus, this.age);
        return description;
    }

    public void neuter() {
        if (!this.isNeutered) {
            this.isNeutered = true;
            System.out.println(MessageFormat.format("{0}: 'Meeooow!'", this.name));
            System.out.println(MessageFormat.format("{0} has been neutered!", this.name));
        } else {
            System.out.println(MessageFormat.format("{0} has already been neutered!", this.name));
        }
    }
}
