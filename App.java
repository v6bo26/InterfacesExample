package com.so.interfacesexample;

import java.util.Random;

/**
 *
 * @author stan
 */
public class App {
    public static void main(String[] args) {
        Plant[] plants = new Plant[10];
        for(int i = 0; i < plants.length; i++){
            Apple a = new Apple();
            a.setSort("sort"+i);
            a.setWeight(i+new Random().nextInt(100));
            plants[i] = a;
            a.setColor("color"+i);
        }
        System.out.println("before peeling");
        for(Plant a : plants){
            System.out.println(a);
        }
        
        ApplePeelingMachine apm = new ApplePeelingMachine();
        for(int i = 0; i < plants.length; i++){
            apm.peel(plants[i]);
        }
        
        System.out.println("\n\nafter peeling");
        for(Plant a : plants){
            System.out.println(a);
        }
        
        Plant[] herb = new Plant[10];
        for(int i = 0; i < herb.length; i++){
            Potato pt = new Potato();
            pt.setSort("sort"+i);
            pt.setWeight(i+new Random().nextInt(100));
            herb[i] = pt;
            pt.setColor("color"+i);
        }
        System.out.println("before peeling");
        for(Plant pt : plants){
            System.out.println(pt);
        }
        
        PotatoPeelingMachine ppm = new PotatoPeelingMachine();
        for(int i = 0; i < plants.length; i++){
            ppm.peel(plants[i]);
        }
        
        System.out.println("\n\nafter peeling");
        for(Plant pt : plants){
            System.out.println(pt);
        }
        
//        public put(){
//        
//        }
       
    }
}
