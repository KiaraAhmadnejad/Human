public class English extends Human{

    public English (String name){
        super(name);
        talk();

    }

    @Override

    public void talk(){

        System.out.println("Hello my name is" + name);
    }
}
