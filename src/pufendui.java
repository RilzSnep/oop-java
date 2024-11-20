public class pufendui extends hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public pufendui(String fullName, int magicPower, int transgress, int hardworking, int loyal, int honest) {
        super(fullName, magicPower, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public static void comparisonPufenduiStudentPower(pufendui firstStudent, pufendui secondStudent){
        int totalFirst = firstStudent.hardworking + firstStudent.loyal + firstStudent.honest;
        int totalSecond = secondStudent.hardworking + secondStudent.loyal + secondStudent.honest;
        if (totalSecond > totalFirst){
            System.out.println(secondStudent.getFullName() + " лучший Пуфендуец, чем " + firstStudent.getFullName());
        } else if (totalSecond < totalFirst){
            System.out.println(firstStudent.getFullName() + " лучший Пуфендуец, чем " + secondStudent.getFullName());
        } else {
            System.out.println("Силы Пуфендуйцев равны");
        }
    }
}