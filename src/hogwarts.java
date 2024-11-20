public class hogwarts {
    private String fullName;
    private int magicPower;
    private int transgress;

    public hogwarts(String fullName, int magicPower, int transgress) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.transgress = transgress;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgress() {
        return transgress;
    }
    public static void comparisonStudentsMagicPower(hogwarts firstStudent, hogwarts secobdStudent){
        if (firstStudent.magicPower + firstStudent.transgress > secobdStudent.magicPower + secobdStudent.transgress){
            System.out.println(firstStudent.fullName + " сильнее " + secobdStudent.fullName + " в магической силе");
        } else if (firstStudent.magicPower + firstStudent.transgress < secobdStudent.magicPower + secobdStudent.transgress){
            System.out.println(secobdStudent.fullName + " сильнее " + firstStudent.fullName + " в магической силе");
        } else {
            System.out.println("Магические силы студентов равны");
        }
    }
    public static void describeStudent(hogwarts Student) {
        if (Student instanceof griffendor) {
            griffendor student = (griffendor) Student;
            System.out.println("У студента " + student.getFullName() + " " + student.getMagicPower()
                    + " магической силы и " + student.getTransgress() + " расстояние трансгресии и" + " столько благородства, чести и храбрости " +
                    student.getHonor() + ", " + student.getCourage() + ", " + student.getNobility());
        } else if (Student instanceof pufendui) {
            pufendui students = (pufendui) Student;
            System.out.println("У студента " + students.getFullName() + " " + students.getMagicPower()
                    + " магической силы и " + students.getTransgress() + " расстояние трансгресии и " + " трудолюбивы, верны, честны " +
                    students.getHardworking() + ", " + students.getLoyal() + ", " + students.getHonest());
        } else if (Student instanceof cogtevran) {
            cogtevran students = (cogtevran) Student;
            System.out.println("У студента " + students.getFullName() + " " + students.getMagicPower()
                    + " магической силы и " + students.getTransgress() + " расстояние трансгресии и " + " умны, мудры, остроумны и полны творчества " +
                    students.getSmart() + ", " + students.getSmart() + ", " + students.getWise() + ", " + students.getFullOfCreativity());
        } else if (Student instanceof slizerin) {
            slizerin students = (slizerin) Student;
            System.out.println("У студента " + students.getFullName() + " " + students.getMagicPower()
                    + " магической силы и " + students.getTransgress() + " расстояние трансгресии и " + " хитрость, решительность, амбициозность, находчивость и жажда власти " +
                    students.getCunning() + ", " + students.getDetermination() + ", " + students.getAmbition() + ", " + students.getResourcefulness() + ", " + students.getLustForPower());
        }
    }
}