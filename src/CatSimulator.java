public class CatSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to Cat Simulator!");

        Cat mou = new Cat("Mouchan", 4, "black and white", "male", true);
        System.out.println(mou.describe());
//        mou.neuter();
    }
}
