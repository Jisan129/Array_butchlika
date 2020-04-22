package com.company;

import java.util.LinkedList;

public class Cities {

     private String name;
     private LinkedList<String>cities;

    public Cities(String name,LinkedList<String> cities) {
        this.name =name;
        this.cities = new LinkedList<String>();
    }

    public LinkedList<String> getCities() {
        return cities;
    }
    public void addCities(String cityName){
             this.cities.add(cityName);
    }
    public void printCity(){
        if(!this.cities.isEmpty()){
            System.out.println("City: "+cities.element());
        }
    }

}
