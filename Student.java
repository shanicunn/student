public class Student {
    int studentID;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;

//    public Student (int studentID, String firstName, String lastName, String email, String phoneNumber) {
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }



    public static void main (String[] args) {
        Student newStudent1 = new Student();
        Student newStudent2 = new Student();

        newStudent1.studentID = newStudent1.setStudentID(0001);
        newStudent1.firstName = newStudent1.setFirstName("Todd");
        newStudent1.lastName = newStudent1.setLastName("Hopkins");
        newStudent1.email = newStudent1.setEmail("thop@gmail.org");
        newStudent1.phoneNumber = newStudent1.setPhoneNumber("123-456-7890");
        System.out.println("Student ID: " + newStudent1.getStudentID() + ", Name: " + newStudent1.getFirstName() + " " + newStudent1.getLastName() + ", E-mail: " + newStudent1.getEmail() + ", Phone Number: " + newStudent1.getPhoneNumber());

        newStudent2.studentID = newStudent2.setStudentID(0002);
        newStudent2.firstName = newStudent2.setFirstName("Mario");
        newStudent2.lastName = newStudent2.setLastName("Wells");
        newStudent2.email = newStudent2.setEmail("wario@gmail.org");
        newStudent2.phoneNumber = newStudent2.setPhoneNumber("123-456-7891");
        System.out.println("Student ID: " + newStudent2.getStudentID() + ", Name: " + newStudent2.getFirstName() + " " + newStudent2.getLastName() + ", E-mail: " + newStudent2.getEmail() + ", Phone Number: " + newStudent2.getPhoneNumber());
    }
}