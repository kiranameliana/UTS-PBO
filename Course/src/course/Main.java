/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Instructor instr = new Instructor("Yustanti", "Wiyli", "1234");
	    Textbook book = new Textbook("Fundamentals of Database System 7th Edition", "Elmasri & Navathe", "Pearson");
	    Course e = new Course("Manajemen Basis Data", instr, book);
	    System.out.println(e.toString());
    }
}