public class Parrot extends Bird{
    public Parrot(String name, String color){
        super(name, color);
    }

    @Override
    public void speak(){
        System.out.println("Shiver me timbers! I'm " + name + " and I'm a " + color + " parrot.");
    }
}
