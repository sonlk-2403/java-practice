package practice_final_2;
import java.util.ArrayList;
import java.util.List;
public abstract class Student {
    // mã sinh viên, họ tên, ngày tháng năm sinh, năm vào học, điểm đầu vào và danh sách kết quả học tập
    private int id;
    private String name;
    private String birthDay;
    private int schoolYear;
    private double point;
    protected List<LearningResult> results = new ArrayList<LearningResult>();
    /**
     * @param id
     * @param name
     * @param birthDay
     * @param schoolYear
     * @param point
     * @param results
     */
    public Student(int id, String name, String birthDay, int schoolYear, double point, List<LearningResult> results) {
        super();
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.schoolYear = schoolYear;
        this.point = point;
        this.results = results;
    }
    public void displayInfoStudent() {
        System.out.println("id: " + getId());
        System.out.println("name: "+ getName());
        System.out.println("brithday: "+ getBirthDay());
        System.out.println("nam vao truong: "+ getSchoolYear());
        System.out.println("diem dau vao: "+ getPoint());
        System.out.println("danh sach hoc tap:"+ getResults());
    }
    public void checkMediumScore() {
        double total = 0;
        for (LearningResult learningResult : results) {
            total += learningResult.getMediumScore();
        }
        System.out.println("Diem trung binh cua sv " + getName() + " la: " + total / results.size());
    }
    public void checkRegularStudent() {
        if (this instanceof RegularStudent) {
            System.out.println(this.getName() + ": day la sinh vien chinh quy");
            return;
        }
        if (this instanceof InserviceStudent) {
            System.out.println(this.getName() + ": day khong phai la sinh vien chinh quy");
            return;
        }
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    public int getSchoolYear() {
        return schoolYear;
    }
    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }
    public double getPoint() {
        return point;
    }
    public void setPoint(double point) {
        this.point = point;
    }
    public List<LearningResult> getResults() {
        return results;
    }
    public void setResults(List<LearningResult> results) {
        this.results = results;
    }
}