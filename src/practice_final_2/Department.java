package practice_final_2;
import java.util.ArrayList;
import java.util.List;
public class Department {
    private String nameDepartment;
    private List<Student> students;
    /**
     * @param nameDepartment
     * @param students
     */
    public Department(String nameDepartment, List<Student> students) {
        super();
        this.nameDepartment = nameDepartment;
        this.students = students;
    }
    public int countRegularStudent() {
        int count = 0;
        for (Student student : students) {
            if (student instanceof RegularStudent) {
                count += 1;
            }
        }
        System.out.println("So sv chinh quy cua khoa " + getNameDepartment() + " la: " + count);
        return count;
    }
    
    public List<Student> findStudentHighestEntryScore() {
        List<Student> highestEntryScore = new ArrayList<Student>();
        double highestScore = 0;
        for (Student student : this.getStudents()) {
            if (student.getPoint() < highestScore) {
                continue;
            }
            if (student.getPoint() > highestScore) {
                highestScore = student.getPoint();
                highestEntryScore.clear();
            }
            highestEntryScore.add(student);
        }
        System.out.println("So sinh vien co diem dau vao cao nhat khoa" + getNameDepartment() + 
                " la: " + highestEntryScore.size());
        
        return highestEntryScore ;
    }
        
    
    public void displayInfoStudent() {
        System.out.println(nameDepartment);
        students.forEach(std -> std.displayInfoStudent());
    }
    public String getNameDepartment() {
        return nameDepartment;
    }
    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}