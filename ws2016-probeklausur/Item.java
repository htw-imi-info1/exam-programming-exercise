/**
 * Single Item for the Shopping List
 */
public class Item
{
    String name;
    public Item(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
