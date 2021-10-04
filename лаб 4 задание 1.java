public class lab4 {
    public static void main(String args[]){
        Animal a = new Cat("Серая", false, "рыба, мясо", 4);
        System.out.println(a.getVegetarian());
        System.out.println(a.getEats());
        System.out.println(a.getNoOfLegs());
    }
}
public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;
    public void setVegetarian(boolean vegetarian){
        this.vegetarian = vegetarian;
    }
    public boolean getVegetarian(){
        return vegetarian;
    }
    public String getEats(){
        return eats;
    }
    public void setEats(String eats){
        this.eats = eats;
    }
    public void setNoOfLegs(int noOfLegs){
        this.noOfLegs = noOfLegs;
    }
    public int getNoOfLegs(){
        return noOfLegs;
    }
}
public class Cat extends Animal{
    private String color;
    public Cat(String color, boolean vegetarian, String eats, int noOfLegs){
        this.color=color;
        setVegetarian(vegetarian);
        setEats(eats);
        setNoOfLegs(noOfLegs);
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
