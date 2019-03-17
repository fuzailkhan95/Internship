package Students;

import java.util.*;

public class Degree 
{        
    
    private String degreeType;
    private String dateOfDegree;
    private double gpa;
    private String plan;
    private String subplan;
    private int creditsCompleted;
    private String specializedProg;
    private String internCourse;
    private String semester;
    private String grades;
    private String school;
    private String finalGrade;
    
    
    public Degree() 
    {
        degreeType = null;
        dateOfDegree = null;
        plan = null;
        subplan = null;
        specializedProg = null;
        internCourse = null;
        semester = null;
        grades = null;
        school = null;
        finalGrade = null;
        
    }
    
    public Degree(String degreeType, String dateOfDegree, double gpa, String plan, String subplan, int creditsCompleted, String specializedProg, String internCourse, String school, String semester, String grades, String finalGrade)
    {
        
        this.degreeType = degreeType;
        this.dateOfDegree = dateOfDegree;
        this.gpa = gpa;
        this.plan = plan;
        this.subplan = subplan;
        this.creditsCompleted = creditsCompleted;
        this.specializedProg = specializedProg;
        this.internCourse = internCourse;
        this.semester =  semester;
        this.grades = grades;
        this.school = school;
        this.finalGrade = finalGrade;
        
    }
    
    public String getDegreeType()
    {
        return degreeType;
    }
    public void setDegreeType(String degreeType)
    {
        this.degreeType = degreeType;
    }
    
    
    public String getDateOfDegree()
    {
        return dateOfDegree;
    }
    public void setDateOfDegree(String dateOfDegree)
    {
        this.dateOfDegree = dateOfDegree;
    }
    
    
    public double getGpa() 
    {
        return gpa;
    }
    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }
    
    
    public String getPlan()
    {
        return plan;
    }
    public void setPlan(String plan)
    {
        this.plan = plan;
    }
    
    
    public String getSubplan()
    {
        return subplan;
    }
    public void setSubplan(String subplan)
    {
        this.subplan = subplan;
    }
    
    
    public int getCreditsCompleted()
    {
        return creditsCompleted;
    }
    public void setCreditsCompleted(int creditsCompleted)
    {
        this.creditsCompleted = creditsCompleted;
    }
    
    
    public String getSpecializedProg()
    {
        return specializedProg;
    }
    public void setSpecializedProg(String specializedProg)
    {
        this.specializedProg = specializedProg;
    }
    
    
    public String getInternCourse() 
    {
        return internCourse;
    }
    public void setInternCourse(String internCourse) 
    {
        this.internCourse = internCourse;
    }
    
    
    public String getSemester() 
    {
        return semester;
    }
    public void setSemester(String semester) 
    {
        this.semester = semester;
    }
    
    
    public String getGrades() 
    {
        return grades;
    }
    public void setGrades(String grades) 
    {
        this.grades = grades;
    }
    
    
    public String getSchool() 
    {
        return school;
    }
    public void setSchool(String school) 
    {
        this.school = school;
    }
    
    
    public String getFinalGrade() 
    {
        return finalGrade;
    }
    public void setFinalGrade(String finalGrade) 
    {
        this.finalGrade = finalGrade;
    }
    
    
}

