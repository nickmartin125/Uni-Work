/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basketmod;

import java.util.ArrayList;


public class Product {
    private String name;
    private Double price;
    private Integer code;
   
     
    public void setName (String name){
        this.name = name;
    }
    public void setPrice (Double price){
        this.price = price;
    }
    public void setCode (Integer code){
        this.code = code;
    }
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
    public Integer getCode(){
        return code;
    }

}
