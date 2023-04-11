public abstract class Predator extends Mammal{   // класс Хищник 
    
    public Predator(String name){
        super(name);
    }

    @Override
    public String feed(){
        return "Мясо";
    }

}
