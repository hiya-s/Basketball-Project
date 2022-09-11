/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.NotesDAO;
import View.StudentHome;
import View.StudentNotesFromCoach;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author rajasharma
 */
public class StudentNotesFromCoachController {

  
    private StudentHome studentHomeView;
    private int sid;
    private StudentNotesFromCoach notesFromCoachView;
    private NotesDAO notesDAO;
    
    StudentNotesFromCoachController(StudentHome studentHomeView1, int s) {
       studentHomeView = studentHomeView1;
       sid = s;        
      notesFromCoachView = new StudentNotesFromCoach();
       notesDAO = new NotesDAO();
    }
    
     public void startApp() {
        JLabel notes =  notesFromCoachView.getNotesFromCoachLabel(); 
        String notesinData = notesDAO.getNotes(sid);
       
        System.out.println(notesinData + "notes&DATA");
        
        
        notes.setText(notesinData);
        
        System.out.println(notes.getText());
        notesFromCoachView.setVisible(true);
        System.out.println("notes from Coach View in method");
     
     }
   
    
}
