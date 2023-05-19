public class Swedish extends Human{
    public Swedish(String name){
        super();
    }

    @Override
    public void talk (){
        System.out.println("Hej jag heter" + name);
    }
}
