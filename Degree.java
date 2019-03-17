package Students;

import java.util.*;

public class Degree 
{        
    
    private String DegreeType;
    private Date DateOfDegree;
    private double GPA;
    private String Plan;
    private String Subplan;
    private int CreditsCompleted;
    
    
    public Degree() 
    {
        DateOfDegree = null;
        Plan = null;
        Subplan = null;
        DegreeType = null;
    }
    
    public Degree(String DegreeType, Date DateOfDegree, double GPA, String Plan, String Subplan, int CreditsCompleted)
    {
        
        this.DegreeType = DegreeType;
        this.DateOfDegree = DateOfDegree;
        this.GPA = GPA;
        this.Plan = Plan;
        this.Subplan = Subplan;
        this.CreditsCompleted = CreditsCompleted;
        
    }
    
    public String getDegreeType()
    {
        return DegreeType;
    }
    
    public void setDegreeType(String DegreeType)
    {
        this.DegreeType = DegreeType;
    }
    
    
    public Date getDateOfDegree()
    {
        return DateOfDegree;
    }
    
    
    public void setDateOfDegree(Date DateOfDegree)
    {
        this.DateOfDegree = DateOfDegree;
    }
    
    public double getGPA() 
    {
        return GPA;
    }
    
    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }
    
    public String getPlan()
    {
        return Plan;
    }
    
    
    public void setPlan(String Plan)
    {
        this.Plan = Plan;
    }
    
    
    public String getSubplan()
    {
        return Subplan;
    }
    
    
    public void setSubplan(String Subplan)
    {
        this.Subplan = Subplan;
    }
    
    
    public int getCreditsCompleted()
    {
        return CreditsCompleted;
    }
    
    
    public void setCreditsCompleted(int CreditsCompleted)
    {
        this.CreditsCompleted = CreditsCompleted;
    }
    
    
}
