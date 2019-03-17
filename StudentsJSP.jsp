<!DOCTYPE html>
<%@ page import = "java.util.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
    <head>
        <style>
        
        
            .personal
            {
                border: 1px solid black;
                background-color: lightblue;
                font-size : 18px;
            }
            .deg 
            {
                border: 1px solid black;
                background-color: lightblue;
                font-size : 18px;
            }
            .cert 
            {
                border: 1px solid black;
                background-color: lightblue;
                font-size : 18px;
            }
        
            .personal input
            {
                margin-left: 22em;
            }
            
            .deg input
            {
                margin-left: 22em;
            }
            
            .cert input
            {
                margin-left: 22em;
            }
        
            .personal label
            {
                position : absolute;
            }
            
            .deg label
            {
                position : absolute;
            }
            
            .cert label
            {
                position : absolute;
            }
            
            
         
        </style>  
    </head>
    
    <body>
        <form>
            <b>Personal Information :</b>
                <div class = "personal">
                    <label>First Name : ${student.getPersonalInfo().getFirstName()}</label><br>
                    <label>Midlle Name : ${student.getPersonalInfo().getMiddleName()}</label><br>
                    <label>Last Name : ${student.getPersonalInfo().getLastName()}</label><br>
                    <label>Date Of Birth : ${student.getPersonalInfo().getDOB()}</label><br>
                    <label>EMPLID : ${student.getPersonalInfo().getEMPLID()}</label><br>
                    <label>Last 4 SSN : ${student.getPersonalInfo().getLast4SSN()}</label><br>
                    <label>Gender : ${student.getPersonalInfo().getGender()}</label><br>
                    <label>Email : ${student.getPersonalInfo().getEmail()}</label><br>
                    <label>Phone : ${student.getPersonalInfo().getPhone()}</label><br>
                </div>
        </form><br>
        
        <c:forEach var="degree" items = "${student.getListDegree()}" >
            <form>
                <b>Degree :</b>
                     <div class = "deg">
                            <label>Degree : ${degree.getDegreeType()}</label><br>
                            <label>Date of the Degree : ${degree.getDateOfDegree()}</label><br>
                            <label>GPA : ${degree.getGpa()}</label><br>
                            <label>Academic Plan : ${degree.getPlan()}</label><br>
                            <label>Academic Subplan : ${degree.getSubplan()}</label><br>
                            <label>Number of Credits Completed : ${degree.getCreditsCompleted()}</label><br>
                            <label>Specialized Program : ${degree.getSpecializedProg()}</label><br>
                            <label>Student Teaching/Intern Course : ${degree.getInternCourse()}</label><br>
                            <label>Semester : ${degree.getSemester()}</label><br>
                            <label>Grades : ${degree.getGrades()}</label><br>
                            <label>School : ${degree.getSchool()}</label><br>
                            <label>Final Grade : ${degree.getFinalGrade()}</label><br>
                     </div>
            </form><br>
        </c:forEach>
        
        <c:forEach var = "certificate" items = "${student.getListCertificates()}">
            <form>
                <b>Certificate :</b>
                    <div class = "cert">
                        <label>Type of Certificates : ${certificate.getTypeOfCertificate()}</label></br>
                        <label>Title : ${certificate.getTitle()}</label><br>
                        <label>Date Entered : ${certificate.getDateEntered()}</label><br>
                        <label>Status(Issued/Not Issued) : ${certificate.isCertIssueOrNot()}</label><br>
                        <label>Missing : ${certificate.getMissing()}</label><br>
                        <label>Date of Issuance : ${certificate.getDateOfIssuance()}</label><br>
                    </div>
            </form><br>
        </c:forEach>
        
            <form>
                <b>Certificates for administrator :</b>
                    <div class = "cert">
                        <label>Type of Certificates :</label>
                            <select>
                                <option value = "transitionalB">Transitional B</option>
                                <option value = "internship">Internship</option>
                                <option value = "initial">Initial</option>
                                <option value = "professional">Professional</option>
                                <option value = "professionalAEx">Professional Annotation Extension </option>
                                <option value = "initialAEx">Initial Annotation Extension</option>
                                <option value = "provisional">Provisional</option>
                                <option value = "permanent">Permanent</option>
                                <option value = "provisionalEx">Provisional Extension</option>
                                <option value = "permanentEx">Permanent Extension</option>
                            </select><br>
                        <label>Title :</label><input type = "text" value = "${certificate.getTitle()}"><br>
                        <label>Date Entered :</label><input type = "text" value = "${certificate.getDateEntered()}"><br>
                        <label>Status(Issued/Not Issued) :</label><input type = "text" value = "${certificate.isCertIssueOrNot()}"><br>
                        <label>Missing :</label><input type = "text" value = "${certificate.getMissing()}"><br>
                        <label>Date of Issuance :</label><input type = "text" value = "${certificate.getDateOfIssuance()}"><br>
                    </div>
            </form><br>
    </body>
</html>