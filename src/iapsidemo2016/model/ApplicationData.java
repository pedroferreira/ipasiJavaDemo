/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iapsidemo2016.model;

import java.util.ArrayList;

/**
 *
 * @author romeu
 */
public class ApplicationData {
    
    private static final ApplicationData instance = new ApplicationData();

    public static ApplicationData getInstance() {
        return instance;
    }
    private ArrayList<Student> students;

    public ApplicationData(){
        
        this.students = new ArrayList<>();
        this.students.add(new Student("Leonardo Henriques","2160484"));
        this.students.add(new Student("pedro ferreira", "2121212"));
        this.students.add(new Student("ricardo martinho", "2121213"));        
        this.students.add(new Student("aluno nome", "2111222"));      
        this.students.add(new Student("carlos pedroso", "2161728"));
        this.students.add(new Student("Rui Simões", "2160481"));    
        this.students.add(new Student("luis morgado", "2160435")); 
        this.students.add(new Student("Alexandre Pereira", "2160479"));


        this.students.add(new Student("ricardo martinho", "2121213"));        
        this.students.add(new Student("aluno nome", "21112  22"));  
        this.students.add(new Student("Francisco Ronsani", "2160477"));
        this.students.add(new Student("Rafael Batista", "2160432"));
    }

    public ArrayList<Student> getStudents() {
        return (ArrayList<Student>) students.clone();
    }
    
}
