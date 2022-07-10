public class myAnimal {

    private String name;
    private int ID;

    public myAnimal(String myName,int  myID){
        this.name = myName;
        this.ID = myID;
    }
    public void eat(){
        System.out.println( this.getClass().getName() +  " " + name + " " +  ID + " " + "is eating");
    }
}

