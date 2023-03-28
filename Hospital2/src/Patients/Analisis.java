package Patients;

public abstract class Analysis<T> {
    private String name;
    private String description;
    private T result;

    public Analysis(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public T getResult() {
        return result;
    }

    public void performAnalysis() {

    }

    @Override
    public String toString() {
        return "Name: " + name + ", Description: " + description + ", Result: " + result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Analysis)) return false;
        Analysis<?> analysis = (Analysis<?>) o;
        return Objects.equals(name, analysis.name) && Objects.equals(description, analysis.description) && Objects.equals(result, analysis.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, result);
    }
}