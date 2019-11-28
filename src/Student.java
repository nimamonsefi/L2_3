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
public class Student {
    private String name;
    private ArrayList<String> lesson=new ArrayList<>();
    private ArrayList<Double> mark=new ArrayList<>();
    private ArrayList<Integer> number=new ArrayList<>();
    private double sum1,sum2,sum3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getLesson() {
        for(String l:lesson){
            System.out.println(l+" ");
        }
    }

    public void setLesson(String entry) {
        lesson.add(entry);
        sum3+=1;
    }

    public double getMark() {
        for(double m:mark){
            sum1+=m;
        }
        return  sum1/sum3;
    }

    public void setMark(double entry) {
        mark.add(entry);
    }

    public double getNumber() {
        for(int n:number){
            sum2+=n;
        }
        return sum2;
    }

    public void setNumber(int entry) {
        number.add(entry);
    }

    
    
}
