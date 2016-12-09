package com.so.interfacesexample;

/**
 *
 * @author stan
 */
public class Apple extends Fruit {
    private String sort;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Apple{ " +"color= "+color+ ", sort= " + sort + ", weight= "+this.weight+"}";
    }

    
    
}
