package Patients;

public class Laboratory<T extends Analysis>
{
    protected String number;
    protected T analysis;
    public Laboratory(String number, T analysis)
    {
        this.number = number;
        this.analysis = analysis;
    }
    public String getNumber()
    {
        return number;
    }
    public void setNumber(String number)
    {
        this.number = number;
    }
    public T getAnalysis()
    {
        return analysis;
    }
    public void setAnalysis(T analysis)
    {
        this.analysis = analysis;
    }
    @Override
    public String toString()
    {
        return "Laboratory: " + this.getNumber();
    }
}
