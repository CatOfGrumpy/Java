package Patients;

public class WhiteBloodCells extends Analysis
{
    public WhiteBloodCells(Integer value)
    {
        this.value = value;
    }
    @Override
    public String toString()
    {
        return switch (value) {
            case 4, 5, 6, 7 ,8 ,9, 10 -> "Norm";
            default -> "Not norm";
        };
    }
}
