/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        Student s1=new Student();
        Student s2=new Student();
        
        ArrayList<Student> studentList=new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        
        for(Student s:studentList){
            System.out.print("\nEnter Your Name : ");
            s.setName(scanner.next());
            
            while(true){
                System.out.print("Enter Your Lesson : ");
                s.setLesson(scanner.next());
                
                System.out.print("Enter Your Mark : ");
                s.setMark(scanner.nextDouble());
                
                System.out.print("Enter Your Number : ");
                s.setNumber(scanner.nextInt());
                
                System.out.print("Continue ?(Y or N) : ");
                
                if(scanner.next().equalsIgnoreCase("N")){
                    break;
                }
            }
        }
        
        for(Student s:studentList){
            System.out.print("\nEnter Your Name : ");
            
            if(scanner.next().equalsIgnoreCase(s.getName())){
                System.out.print("Lessons : ");
                s.getLesson();
                
                System.out.println("Average : "+s.getMark());
                
                System.out.println("Numbers : "+s.getNumber());                
            }
        }
    }
    
}
