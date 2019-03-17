package Students;

import java.util.Date;

public class Personal_Info
{
    
    private String Name;
    private Date DOB;
    private String EMPLID;
    private int Last4SS;
    private String Gender;
    private String Email;
    private int Phone;
    
    
    
    public Personal_Info() 
    {
        Name = null;
        DOB = null;
        EMPLID = null;
        Gender = null;
        Email = null;
    }
    
    
    public Personal_Info(String Name, Date DOB, String EMPLID, int Last4SS, String Gender, String Email, int Phone)
    {
        
        this.Name = Name;
        this.DOB = DOB;
        this.EMPLID = EMPLID;
        this.Last4SS = Last4SS;
        this.Gender = Gender;
        this.Email = Email;
        this.Phone = Phone;
        
    }
    
    public String getName() 
    {
        
        return Name;
        
    }
    
    public void setName(String Name) 
    {
        
        this.Name = Name;
        
    }
    
    public Date getDOB()
    {
        
        return DOB;               
                   
    }
    
    public void setDOB(Date DOB)
    {
        
        this.DOB = DOB;               
                   
    }
    
    public String getEMPLID() 
    {
        
        return EMPLID;
        
    }
    
    public void setEMPLID(String EMPLID)
    {
        
        this.EMPLID = EMPLID;
        
    }
    
    public int getLast4SS()
    {
        
        return Last4SS;
        
    }
    
    public void setLast4SS(int Last4SS)
    {
        
        this.Last4SS = Last4SS;
        
    }
    
    public String getGender()
    {
        
        return Gender;
        
    }
   
    public void setGender(String Gender)
    {
        
        this.Gender = Gender;
        
    }
    
    public String getEmail()
    {
        
        return Email;
        
    }
    
    public void setEmail(String Email)
    {
        
        this.Email = Email;
        
    }
    
    public int getPhone()
    {
        
        return Phone;
        
    }
    
    public void setPhone(int Phone)
    {
        
        this.Phone = Phone;
        
    }
    
}
