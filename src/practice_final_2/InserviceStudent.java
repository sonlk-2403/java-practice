package practice_final_2;
import java.util.List;
public class InserviceStudent extends Student {
    private String trainingPlace;
    public InserviceStudent(int id, String name, String birthDay, int schoolYear, double point, List<LearningResult> learningResult, String trainingPlace) {
        super(id, name, birthDay, schoolYear, point, learningResult);
        this.trainingPlace = trainingPlace;
    }
    public String getTrainingPlace() {
        return trainingPlace;
    }
    public void setTrainingPlace(String trainingPlace) {
        this.trainingPlace = trainingPlace;
    }
}
