public class Swedish extends Human{
    public Swedish(String name){
        super(name);
        talk();
    }

    @Override
    public void talk (){
        System.out.println("Hej jag heter" + name);
    }
}
