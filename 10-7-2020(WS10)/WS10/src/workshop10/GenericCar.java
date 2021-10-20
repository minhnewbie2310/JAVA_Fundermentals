/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop10;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;


/**
 *
 * @author 
 */
public class GenericCar<T>{
    ArrayList<T> list;

    public GenericCar(ArrayList<T> list) {
        this.list = list;
    }
    
    
    boolean Add(T obj){
        return list.add(obj);
    }
    void Display(){
        for (T x : list){
            System.out.println(x);
        }
    }
    int getSize(){
        return list.size();
    }
    void delete(int pos){
        list.remove(pos);
    }
    boolean isEmpty(){
        return list.isEmpty();
    }
    void sort(){
        Collections.sort((List<Car>) list);
    }
    void sort2(){
        Collections.sort((List<Car>) list, Car.compareObj);
    }
    
    
}
