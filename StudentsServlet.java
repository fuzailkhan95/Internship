//package src.Students;

import Students.Certificate;

import Students.Degree;

import java.io.IOException;
import Students.PersonalInformation;
import Students.Student;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



@WebServlet(name = "Servlet1", urlPatterns = { "/servlet1" })
public class StudentsServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        
        
        
        PersonalInformation pInfo = new PersonalInformation();
        pInfo.setFirstName("Fuzail");
        pInfo.setMiddleName("A.");
        pInfo.setLastName("Khan");
        pInfo.setDOB("01/01/2000");
        pInfo.setEMPLID("12345678");
        pInfo.setLast4SSN(1234);
        pInfo.setGender("Male");
        pInfo.setEmail("123@gmail.com");
        pInfo.setPhone(123456789);
        
        Student sInfo = new Student();
        sInfo.setPersonalInfo(pInfo);
        
        
        
        
        Degree sDeg1 = new Degree();
        sDeg1.setDegreeType("Teaching Certificate");
        sDeg1.setDateOfDegree("01/10/2001");
        sDeg1.setGpa(3.4);
        sDeg1.setPlan("Planing to graduate after in semester");
        sDeg1.setSubplan("I don't know");
        sDeg1.setCreditsCompleted(135);
        sDeg1.setSpecializedProg("STEM");
        sDeg1.setInternCourse("CMP487");
        sDeg1.setSemester("Spring 2019");
        sDeg1.setGrades("A");
        sDeg1.setSchool("Lehman College");
        sDeg1.setFinalGrade("A-");
        
        
        
        Degree sDeg2 = new Degree();
        sDeg2.setDegreeType("Teaching Certificate");
        sDeg2.setDateOfDegree("05/03/2018");
        sDeg2.setGpa(3.4);
        sDeg2.setPlan("Planing to graduate after in semester");
        sDeg2.setSubplan("I don't know");
        sDeg2.setCreditsCompleted(135);
        sDeg2.setSpecializedProg("STEM");
        sDeg2.setInternCourse("CMP487");
        sDeg2.setSemester("Spring 2019");
        sDeg2.setGrades("A");
        sDeg2.setSchool("Lehman College");
        sDeg2.setFinalGrade("A-");
        
  
        
        Degree sDeg3 = new Degree();
        sDeg3.setDegreeType("Teaching Certificate");
        sDeg3.setDateOfDegree("12/16/1998");
        sDeg3.setGpa(3.4);
        sDeg3.setPlan("Planing to graduate after in semester");
        sDeg3.setSubplan("I don't know");
        sDeg3.setCreditsCompleted(135);
        sDeg3.setSpecializedProg("STEM");
        sDeg3.setInternCourse("CMP487");
        sDeg3.setSemester("Spring 2019");
        sDeg3.setGrades("A");
        sDeg3.setSchool("Lehman College");
        sDeg3.setFinalGrade("A-");
        
        sInfo.getListDegree().add(sDeg1);
        sInfo.getListDegree().add(sDeg2);
        sInfo.getListDegree().add(sDeg3);
        
        
       
        
        Certificate sCert1 = new Certificate();
        sCert1.setTypeOfCertificate("Internship");
        sCert1.setTitle("Teacher Assistant");
        sCert1.setDateEntered("08/19/2018");
        sCert1.setCertIssueOrNot(true);
        sCert1.setMissing("Nothing");
        sCert1.setDateOfIssuance("01/19/2019");
        
        
        Certificate sCert2 = new Certificate();
        sCert2.setTypeOfCertificate("Transitional B");
        sCert2.setTitle("Teacher");
        sCert2.setDateEntered("05/19/2015");
        sCert2.setCertIssueOrNot(true);
        sCert2.setMissing("Nothing");
        sCert2.setDateOfIssuance("10/10/2015");
        
        sInfo.getListCertificates().add(sCert1);
        sInfo.getListCertificates().add(sCert2);
        
        HttpSession session = request.getSession();
        session.setAttribute("student", sInfo);
        /*session.setAttribute("degree", dInfo1);
        session.setAttribute("degree", dInfo2);
        session.setAttribute("degree", dInfo3);*/
        
        /*session.setAttribute("firstName", pInfo.getFirstName());
        session.setAttribute("middleName", pInfo.getMiddleName());
        session.setAttribute("lastName", pInfo.getLastName());
        session.setAttribute("dob", pInfo.getDOB());
        session.setAttribute("emplid", pInfo.getEMPLID());
        session.setAttribute("last4SSN", pInfo.getLast4SSN());
        session.setAttribute("gender", pInfo.getGender());
        session.setAttribute("email", pInfo.getEmail());
        session.setAttribute("phone", pInfo.getPhone());*/
        
        
        
        RequestDispatcher dispatcher = null;
        dispatcher = request.getRequestDispatcher("/StudentsJSP.jsp");
        
        dispatcher.forward(request, response);
        
        
        
        
    }
}
