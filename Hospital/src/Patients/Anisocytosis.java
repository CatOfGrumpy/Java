package Patients;

public class Anisocytosis extends Analysis
{
    public Anisocytosis(Integer value)
    {
        this.value = value;
    }
    @Override
    public String toString()
    {
        return switch (value) {
            case 0 -> "No anisocytosis";
            case 1 -> "Has anisocytosis";
            default -> "Error 404";
        };
    }

}