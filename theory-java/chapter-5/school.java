
import java.util.Arrays;

class Person {
    private String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "%s(%s)".format(getName(), getAddress());

    }
}

class Student extends Person {
    public int numCourses = 0;
    public String[] Courses = {};
    public double[] Grades = {};
    private static final int MAX_COURSES = 30;


    public Student(String name, String address, int numCourses, String[] courses, double[] Grades) {
        super(name, address);
        this.numCourses = numCourses;
        this.Courses = new String[MAX_COURSES];
        this.Grades = Grades;

    }

    @Override
    public String toString() {
        return "Student: %s(%s)".format(getName(), getAddress());
    }

    public void addCourse(String name, double grade) {
        Courses[numCourses] = name;
        Grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println(Courses[i] + ": " + Grades[i]);
        }
    }

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += Grades[i];
        }
        return sum / numCourses;
    }
}

class Teacher extends Person {
    public int numCourses = 0;
    public String[] Courses = {};
    private static final int MAX_COURSES = 5;

    public Teacher(String name, String address) {
        super(name, address);
        Courses = new String[MAX_COURSES];
    }

    @Override
    public String toString() {
        return "Teacher: %s(%s)".format(getName(), getAddress());
    }

    public boolean addCourse(String nameCourse) {
        if (Arrays.asList(Courses).contains(nameCourse)) {

            return false;
        }
        else
         Courses[numCourses] = nameCourse;
            numCourses++;

        return true;
    }
    
    public boolean removeCourse(String nameCourse) {
        if (Arrays.asList(Courses).contains(nameCourse)) {
            int index = Arrays.asList(Courses).indexOf(nameCourse);
            Courses[index] = null;
            numCourses--;
            return true;
        }
        return false;
    }
    
}





public class school {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("teacher", "address");
        System.out.println(teacher.addCourse("course"));
        // teacher.removeCourse("course");

    }
}