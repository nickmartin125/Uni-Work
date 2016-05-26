
package basketmod;




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
