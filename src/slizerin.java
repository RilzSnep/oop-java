public class slizerin extends hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public slizerin(String fullName, int magicPower, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, magicPower, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
    public static void comparisonSlizerinStudentPower(slizerin firstStudent, slizerin secondStudent) {
        int totalFirst = firstStudent.cunning + firstStudent.determination + firstStudent.ambition + firstStudent.resourcefulness + firstStudent.lustForPower;
        int totalSecond = secondStudent.cunning + secondStudent.determination + secondStudent.ambition + secondStudent.resourcefulness + secondStudent.lustForPower;
        if (totalSecond > totalFirst) {
            System.out.println(secondStudent.getFullName() + " лучший Слизеринец, чем " + firstStudent.getFullName());
        } else if (totalSecond < totalFirst) {
            System.out.println(firstStudent.getFullName() + " лучший Слизеринец, чем " + secondStudent.getFullName());
        } else {
            System.out.println("Силы Слизеринцев равны");
        }
    }
}
