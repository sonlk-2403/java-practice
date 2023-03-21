package practice_final_2;
public class LearningResult {
    private String nameSemester;
    private double mediumScore;
    /**
     * @param nameSemester
     * @param mediumScore
     */
    public LearningResult(String nameSemester, double mediumScore) {
        super();
        this.nameSemester = nameSemester;
        this.mediumScore = mediumScore;
    }
    
    
    public String getNameSemester() {
        return nameSemester;
    }
    public void setNameSemester(String nameSemester) {
        this.nameSemester = nameSemester;
    }
    public double getMediumScore() {
        return mediumScore;
    }
    public void setMediumScore(double mediumScore) {
        this.mediumScore = mediumScore;
    }
    @Override
    public String toString() {
        return "LearningResult [nameSemester=" + nameSemester + ", mediumScore=" + mediumScore + "]";
    }
    
    
    
}
