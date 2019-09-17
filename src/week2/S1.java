package week2;

public class S1 {
    private String name;
    private String ID;

    public S1() {
    }

    public S1(String name, String ID) {
        this.name = name;
        this.ID = ID;

    }

    public static void main(String[] args) {
        S1[] student = new S1[31];
        for (int i = 1; i <= 30; i++) {
            student[i] = new S1();
            student[i].setName("学生" + i);
            student[i].setID("12312313");
            System.out.println(student[i]);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        this.ID = iD;
    }

    public String toString() {
        return "Student[Name=" + name + "，ID=" + ID + "]";
    }

}
