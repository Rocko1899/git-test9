package gr.aueb.cf.testgit;

/**
 *
 */
public class Student {
   private static int studentCount=0;
    private int id;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;


    }
    //Default Constructor
    public Student () {
        studentCount++;
    }

    //Overloaded constructor
    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}
