package Students;

import java.util.Date;

public class PersonalInformation
{
    
    private String firstName;
    private String middleName;
    private String lastName;
    private String dob;
    private String emplid;
    private int last4SSN;
    private String gender;
    private String email;
    private int phone;
    
    
    
    public PersonalInformation() 
    {
        firstName = null;
        middleName = null;
        lastName = null;
        dob = null;
        emplid = null;
        gender = null;
        email = null;
    }
    
    
    public PersonalInformation(String firstName, String middleName, String lastName, String dob, String emplid, int last4SS, String gender, String email, int phone)
    {
        
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.emplid = emplid;
        this.last4SSN = last4SS;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        
    }
    
    public String getFirstName() 
    {
        
        return firstName;
        
    }
    
    public void setFirstName(String firstName) 
    {
        
        this.firstName = firstName;
        
    }
    
    public String getMiddleName() 
    {
        
        return middleName;
        
    }
    
    public void setMiddleName(String middleName) 
    {
        
        this.middleName = middleName;
        
    }
    
    public String getLastName() 
    {
        
        return lastName;
    
    }
    
    public void setLastName(String lastName) 
    {
        
        this.lastName = lastName;
        
    }
    
    public String getDOB()
    {
        
        return dob;               
                   
    }
    
    public void setDOB(String dob)
    {
        
        this.dob = dob;               
                   
    }
    
    public String getEMPLID() 
    {
        
        return emplid;
        
    }
    
    public void setEMPLID(String emplid)
    {
        
        this.emplid = emplid;
        
    }
    
    public int getLast4SSN()
    {
        
        return last4SSN;
        
    }
    
    public void setLast4SSN(int last4SSN)
    {
        
        this.last4SSN = last4SSN;
        
    }
    
    public String getGender()
    {
        
        return gender;
        
    }
   
    public void setGender(String gender)
    {
        
        this.gender = gender;
        
    }
    
    public String getEmail()
    {
        
        return email;
        
    }
    
    public void setEmail(String email)
    {
        
        this.email = email;
        
    }
    
    public int getPhone()
    {
        
        return phone;
        
    }
    
    public void setPhone(int phone)
    {
        
        this.phone = phone;
        
    }
    
}

