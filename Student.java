package Students;


import java.util.ArrayList;
import java.util.List;


public class Student 
{
    
    private PersonalInformation PersonalInfo;
    
    private ArrayList<Certificate> listCertificates =  new ArrayList<Certificate>();
    private ArrayList<Degree> listDegree = new ArrayList<Degree>();
    
    
    
    public Student()
    {
        PersonalInfo = new PersonalInformation();
        
    }
    
    
    public PersonalInformation getPersonalInfo() 
    {
        return PersonalInfo;
    }
    public void setPersonalInfo(PersonalInformation PersonalInfo)
    {
        this.PersonalInfo = PersonalInfo;
    }
    

    public void setListCertificates(ArrayList<Certificate> listCertificates) {
        this.listCertificates = listCertificates;
    }

    public ArrayList<Certificate> getListCertificates() {
        return listCertificates;
    }

    public void setListDegree(ArrayList<Degree> listDegree) {
        this.listDegree = listDegree;
    }

    public ArrayList<Degree> getListDegree() {
        return listDegree;
    }
}
