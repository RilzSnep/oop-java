public class griffendor extends hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public griffendor(String fullName, int magicPower, int transgress, int nobility, int honor, int courage) {
        super(fullName, magicPower, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }
    public static void comparisonGriffendorStudentPower(griffendor firstStudent, griffendor secondStudent){
        int totalFirst = firstStudent.nobility + firstStudent.honor + firstStudent.courage;
        int totalSecond = secondStudent.nobility + secondStudent.honor + secondStudent.courage;
        if (totalSecond > totalFirst){
            System.out.println(secondStudent.getFullName() + " лучший Гриффиндорец, чем " + firstStudent.getFullName());
        } else if (totalSecond < totalFirst){
            System.out.println(firstStudent.getFullName() + " лучший Гриффиндорец, чем " + secondStudent.getFullName());
        } else {
            System.out.println("Силы гриффендорцев равны");
        }
    }
}