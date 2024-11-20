public class cogtevran extends hogwarts{
    private int smart;
    private int wise;
    private int witt;
    private int fullOfCreativity;

    public cogtevran(String fullName, int magicPower, int transgress, int smart, int wise, int witt, int fullOfCreativity) {
        super(fullName, magicPower, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witt = witt;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitt() {
        return witt;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }
    public static void comparisonCogtevranStudentPower(cogtevran firstStudent, cogtevran secondStudent) {
        int totalFirst = firstStudent.smart + firstStudent.wise + firstStudent.witt + firstStudent.fullOfCreativity;
        int totalSecond = secondStudent.smart + secondStudent.wise + secondStudent.witt + firstStudent.fullOfCreativity;
        if (totalSecond > totalFirst) {
            System.out.println(secondStudent.getFullName() + " лучший Когтевранец, чем " + firstStudent.getFullName());
        } else if (totalSecond < totalFirst) {
            System.out.println(firstStudent.getFullName() + " лучший Когтевранец, чем " + secondStudent.getFullName());
        } else {
            System.out.println("Силы Когтевранцев равны");
        }
    }
}