public class myCat extends myAnimal {

    public myCat(String myname, int myID){
        super(myname,  myID);
    }


    public static void main(String[] args) {
        myCat cat = new myCat("kitte", 2);
        cat.eat();
    }
    // public void eat(){
    //     System.out.println(this.name + this.ID + "eating ");
    // }
}
