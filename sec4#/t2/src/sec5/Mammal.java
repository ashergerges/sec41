/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sec5;

/**
 *
 * @author asher
 */
public class Mammal implements animal {
    private String Name;
    int num=2;
    String eat;
    public void setname(String name)
    {
        this.Name=name;
    }
    
    public void Eat(String eat)
    {
        System.out.print("the eat of"+Name+" is: "+eat);
    }
    public void travel()
    {
    System.out.print(" lblblb");
    }
    public void setNumberofLeges(int n)
    {
        this.num=n;
    }
    public int NoOfleg()
    {
        return (num);
    }
    public void setfaveat(String M)
    {
        this.eat=M;
    }
    public String FavFood()
    {
        return eat;
    }
    public void printmemal(){
    System.out.print("the Name of Mamal is =="+Name+
            "the FavFood is =="+FavFood()+
            "the Number of legs == "+NoOfleg());
    }

    @Override
    public void eat(String eat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
