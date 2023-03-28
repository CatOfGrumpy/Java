package Patients;

import java.util.ArrayList;
import java.util.List;

public class Patient implements PatientInterface
{
    protected String FirstName;
    protected String LastName;
    protected List<Laboratory<Analysis>> list;
    public void setFirstName(String FirstName)
    {
        this.FirstName = FirstName;
    }
    public String getFirstName()
    {
        return FirstName;
    }
    public void setLastName(String LastName)
    {
        this.LastName = LastName;
    }
    public String getLastName()
    {
        return LastName;
    }
    public Patient(String FirstName, String LastName)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.list = new ArrayList<>();
    }
    @Override
    public void append_laboratory(Laboratory laboratory)
    {
        list.add(laboratory);
    }
    @Override
    public void remove_laboratory(Laboratory laboratory)
    {
        list.remove(laboratory);
    }
    @Override
    public void remove_laboratory(int index)
    {
        list.remove(index);
    }
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode()) + ((LastName == null) ? 0 : LastName.hashCode());
        return result;
    }
    @Override
    public String toString()
    {
        List<String> output = new ArrayList<>();
        for (Laboratory laboratory : list)
        {
            output.add(laboratory.getNumber() + " " + laboratory.getAnalysis().getValue() + " " + laboratory.getAnalysis().toString());
        }
        return output.toString();
    }
}
