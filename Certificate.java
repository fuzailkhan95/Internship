package Students;

import java.util.Date;

public class Certificate 
{
    
    private String TypeOfCertificate;
    private String Title;
    private Date DateEntered;
    private String IssueOrNot;
    private Date DateOfIssuarance;
    
    
    public Certificate()
    {
        TypeOfCertificate = null;
        Title = null;
        DateEntered = null;
        IssueOrNot =  null;
        DateOfIssuarance = null;
    }
    
    
    public Certificate(String TypeOfCertificate, String Title, Date DateEntered,  String IssueOrNot, Date DateOfIssuarance)
    {
       this.TypeOfCertificate = TypeOfCertificate;
       this.Title = Title;
       this.DateEntered = DateEntered;
       this.IssueOrNot = IssueOrNot;
       this.DateOfIssuarance = DateOfIssuarance;
       
    }
    
    public String getTypeOfCertificate() 
    {
        return TypeOfCertificate;
    }
    
    public void setTypeOfSertificate(String TypeOfCertificate) 
    {
        this.TypeOfCertificate = TypeOfCertificate;
    }
    
    
    public String getTitle()
    {
        return Title;
    }
    
    public void setTitle(String Title)
    {
        this.Title =  Title;
    }
    
    public Date getDateEntered()
    {
        return DateEntered;
    }
    
    public void setDateEntered(Date DateEntered)
    {
        this.DateEntered = DateEntered;
    }
    
    
    public String getIssueOrNot() 
    {
        return IssueOrNot;
    }
    
    public void setIddueOrNot(String IssueOrNot)
    
    {
        this.IssueOrNot = IssueOrNot;
    }
    
    public Date getDateOfIssuarance()
    
    {
        return DateOfIssuarance;
    }
    
    public void setDateOfIssuarance(Date DateOfIssuarance)
    
    {
        this.DateOfIssuarance = DateOfIssuarance;
    }
    
}
