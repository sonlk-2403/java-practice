package practice_final_2;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<LearningResult> sonResult = new ArrayList<LearningResult>();
        List<LearningResult> nhuResult = new ArrayList<LearningResult>();
        List<LearningResult> tuanResult = new ArrayList<LearningResult>();
        List<LearningResult> miResult = new ArrayList<LearningResult>();
        List<LearningResult> nhatResult = new ArrayList<LearningResult>();
        sonResult.add(new LearningResult("HK1", 6));
        sonResult.add(new LearningResult("HK2", 8));
        nhuResult.add(new LearningResult("HK1", 7));
        nhuResult.add(new LearningResult("HK2", 8));
        tuanResult.add(new LearningResult("HK1", 7));
        tuanResult.add(new LearningResult("HK2", 6));
        miResult.add(new LearningResult("HK1", 8));
        miResult.add(new LearningResult("HK2", 5));
        
        nhatResult.add(new LearningResult("HK1", 4));
        nhatResult.add(new LearningResult("HK2", 9));
        Student son = new RegularStudent(101, "son", "01/10/1992", 2014, 8, sonResult);
        Student mi = new RegularStudent(102, "mi", "01/10/1992", 2014, 7, miResult);
        Student nhat = new RegularStudent(101, "nhat", "01/10/1992", 2014, 8, nhatResult);
        Student nhu = new InserviceStudent(103, "nhu", "01/10/1992", 2014, 6, nhuResult, "DN");
        Student tuan = new InserviceStudent(104, "tuan", "01/10/1992", 2014, 5, tuanResult, "QN");
        
        // check chinh quy
        System.out.println("kiem tra sinh vien chinh quy");
        tuan.checkRegularStudent();
        mi.checkRegularStudent();
        nhat.checkRegularStudent();
        son.checkRegularStudent();
        nhu.checkRegularStudent();
        
        List<Student> literatureStudent = new ArrayList<Student>();
        List<Student> mathStudent = new ArrayList<Student>();
        
        literatureStudent.add(son);
        literatureStudent.add(nhu);
        literatureStudent.add(nhat);
        mathStudent.add(tuan);
        mathStudent.add(mi);
            
        
        Department literature = new Department("literature", literatureStudent);
        Department math = new Department("math", mathStudent);
                
        System.out.println("check diem trung binh cua sinh vien trong cac hoc ky");
        literature.getStudents().forEach(std -> std.checkMediumScore());
        math.getStudents().forEach(std -> std.checkMediumScore());
        
        System.out.println("check so sinh vien chinh quy cua moi khoa");
        literature.countRegularStudent();
        math.countRegularStudent();
        
        System.out.println("tim sinh vien co diem dau vao cao nhat cua moi khoa");
        literature.findStudentHighestEntryScore().forEach(std -> std.displayInfoStudent());
        math.findStudentHighestEntryScore().forEach(std -> std.displayInfoStudent());
    }
}