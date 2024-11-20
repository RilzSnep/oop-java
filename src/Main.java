public class Main {
    public static void main(String[] args) {
        griffendor hermoine = new griffendor("Гермиона Грейнджер", 70, 35, 7, 6, 6);
        griffendor poter = new griffendor("Гарри Поттер", 85, 45, 8, 9, 5);
        hogwarts.describeStudent(hermoine);
        hogwarts.comparisonStudentsMagicPower(hermoine, poter);
        griffendor.comparisonGriffendorStudentPower(hermoine, poter);
        pufendui cedric = new pufendui("Седрик Диггори", 88, 55, 6, 7, 8);
        hogwarts.comparisonStudentsMagicPower(cedric, poter);
    }
}
