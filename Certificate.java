package Students;

import java.util.Date;

public class Certificate 
{
    
    private String typeOfCertificate;
    private String title;
    private String dateEntered;
    private boolean certIssueOrNot;
    private String missing;
    private String dateOfIssuance;
    
    
    public Certificate()
    {
        typeOfCertificate = null;
        title = null;
        dateEntered = null;
        certIssueOrNot =  false;
        missing = null;
        dateOfIssuance = null;
        
    }
    
    
    public Certificate(String typeOfCertificate, String title, String dateEntered,  boolean certIssueOrNot, String missing, String dateOfIssuance)
    {
       this.typeOfCertificate = typeOfCertificate;
       this.title = title;
       this.dateEntered = dateEntered;
       this.certIssueOrNot = certIssueOrNot;
       this.missing = missing;
       this.dateOfIssuance = dateOfIssuance;
       
    }
    
    
    
    public String getTypeOfCertificate() 
    {
        return typeOfCertificate;
    }
    public void setTypeOfCertificate(String typeOfCertificate) 
    {
        this.typeOfCertificate = typeOfCertificate;
    }
    
    
    
    
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title =  title;
    }
    
    
    
    public String getDateEntered()
    {
        return dateEntered;
    }
    public void setDateEntered(String dateEntered)
    {
        this.dateEntered = dateEntered;
    }
    
    
    public boolean isCertIssueOrNot() 
    {
        return certIssueOrNot;
    }
    public void setCertIssueOrNot(boolean certIssueOrNot) 
    {
        this.certIssueOrNot = certIssueOrNot;
    }
    
    
    public String getMissing()
    {
        return missing;
    }
    public void setMissing(String missing)
    {
        this.missing = missing;
    }
    
    
    public String getDateOfIssuance()
    
    {
        return dateOfIssuance;
    }
    public void setDateOfIssuance(String dateOfIssuance)
    
    {
        this.dateOfIssuance = dateOfIssuance;
    }
    
}

