package Patients;

import java.util.List;

public class Patient implements PatientInterface {
    private String name;
    private int age;
    private String gender;

    public Patient(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Patient: " + name + ", Age: " + age + ", Gender: " + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return age == patient.age &&
                Objects.equals(name, patient.name) &&
                Objects.equals(gender, patient.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public void addAnalysis(Analysis analysis) {

    }

    @Override
    public List<Analysis> getAnalyses() {
        return null;
    }

    @Override
    public Analysis getAnalysis(String name) {
        return null;
    }

    @Override
    public boolean removeAnalysis(Analysis analysis) {
        return false;
    }
}