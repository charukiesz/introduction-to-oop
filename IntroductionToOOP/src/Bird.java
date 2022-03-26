

public abstract class Bird implements Dance{
    protected String name;
    protected String color;

    public static void main(String[] args) {

        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        pingu.spin();
        pingu.doTheCaterpillar();
        pingu.jump();

    }

    public Bird (String name, String color){
        this.name = name;
        this.color = color;
    }
//This method is marked with the Abstract keyword
//This means that any classes extending on Bird must implement this
//Abstract methods don't have a method body
    public abstract void speak();

    public void fly(){
        System.out.println("I'm " + name + " and I can fly high in the blue sky!");
    }

    @Override
    public void spin() {
        System.out.println(name + " spin!");
    }

    @Override
    public void doTheCaterpillar() {
        System.out.println(name + " do the wriggly woo!");
    }

    @Override
    public void jump() {
        System.out.println(name + " jump in the air!");
    }
}
