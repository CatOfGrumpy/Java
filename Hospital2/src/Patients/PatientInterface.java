package Patients;
import java.util.ArrayList;
import java.util.List;

public interface PatientInterface {
    public void addAnalysis(Analysis analysis);
    public List<Analysis> getAnalyses();
    public Analysis getAnalysis(String name);
    public boolean removeAnalysis(Analysis analysis);
}
