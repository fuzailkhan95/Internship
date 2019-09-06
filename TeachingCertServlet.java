package teachingcerts.controller;

import teachingcerts.model.Degree;
import teachingcerts.model.Student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;

@WebServlet(name = "TeachingCertServlet", urlPatterns = { "/staff/education/certificates" })
public class TeachingCertServlet extends HttpServlet {
    @SuppressWarnings("compatibility:11680449075914116")
    private static final long serialVersionUID = 1L;

    public void processRequest(HttpServletRequest request, 
                               HttpServletResponse response) 
        throws ServletException,IOException {
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = null;
        
        Map<String,Integer> certificateDropdown = new HashMap<String,Integer>();
        
        // No database code yet, adding static values
        certificateDropdown.put("Teaching Internship", 3);
        certificateDropdown.put("NYS Teaching Certificates", 1);
        certificateDropdown.put("Choose a Certificate Type Below", 0);
        certificateDropdown.put("Stem Certificates", 2);
        
        List<Map.Entry<String,Integer>> dropDownKeyValuePairs = 
            certificateDropdown.entrySet()
                .stream()
                .collect(Collectors.toList());
        
        dropDownKeyValuePairs = dropDownKeyValuePairs.stream().sorted((o1, o2)->o1.getValue().
                                           compareTo(o2.getValue())).
                                           collect(Collectors.toList());
        
        HttpSession session = request.getSession(false);
        
        for (Map.Entry<String,Integer> entry : dropDownKeyValuePairs) {
            // The Key or text for the label
            entry.getKey();
            // The value of the input 0, 1, or 2
            entry.getValue();
        }
        
        request.setAttribute("certificateTypes", dropDownKeyValuePairs);
        
        
        Degree sDeg0 = new Degree();
        sDeg0.setDegreeType("Bachelor");
        sDeg0.setDateOfDegree("02/05/1992");
        sDeg0.setGpa(3.5);
        sDeg0.setPlan("English");
        sDeg0.setSubplan("Education");
        sDeg0.setCredits(90);
        sDeg0.setSpecialProg("N/A");
        sDeg0.setInternCourse("EDU 500");
        sDeg0.setSemester("FALL 1989");
        sDeg0.setGrades("A-");
        sDeg0.setSchool("Lehman College");
        sDeg0.setFinalGrade("A");

        Degree sDeg1 = new Degree();
        sDeg1.setDegreeType("Master");
        sDeg1.setDateOfDegree("04/15/1995");
        sDeg1.setGpa(4.0);
        sDeg1.setPlan("Math");
        sDeg1.setSubplan("Education");
        sDeg1.setCredits(160);
        sDeg1.setSpecialProg("N/A");
        sDeg1.setInternCourse("EDU 1020");
        sDeg1.setSemester("Spring 1994");
        sDeg1.setGrades("A");
        sDeg1.setSchool("CUNY Grad");
        sDeg1.setFinalGrade("A");

        Degree sDeg2 = new Degree();
        sDeg2.setDegreeType("PHD");
        sDeg2.setDateOfDegree("04/15/2000");
        sDeg2.setGpa(4.0);
        sDeg2.setPlan("Math");
        sDeg2.setSubplan("N/A");
        sDeg2.setCredits(200);
        sDeg2.setSpecialProg("N/A");
        sDeg2.setInternCourse("ESC 500, EDU 1040");
        sDeg2.setSemester("Spring 2001");
        sDeg2.setGrades("A");
        sDeg2.setSchool("Hunter College");
        sDeg2.setFinalGrade("A");



        Student sInfo = new Student();
        sInfo.getListDegree().add(sDeg0);
        sInfo.getListDegree().add(sDeg1);
        sInfo.getListDegree().add(sDeg2);

        request.setAttribute("sInfo", sInfo);
        
        
        
        rd = request.getRequestDispatcher("/staff/certificates/index.jsp");
        rd.forward(request, response);
    }
}
