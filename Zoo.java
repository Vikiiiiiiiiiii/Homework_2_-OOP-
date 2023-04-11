import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List <Animal> animals = new ArrayList<>();
    private Radio radio = new Radio();


    public void addAnimal (Animal newAnimal){   // добавление
        this.animals.add(newAnimal);
    }
 
    public void showAll (){                     // демонстрация
        for (Animal animal: this.animals) {
            System.out.println(animal);
        }
    }

    public void noise (){                       // перекличка
        for (Speakable speak:noises()) {
            System.out.print(speak.speak());
        }
        System.out.println();
    }

    private List<Speakable> noises(){
        List<Speakable> res = new ArrayList<>();
        for (Animal animal:animals) {           // два разных класса, но они объединены одним интерфейсом,
            res.add(animal);                    // поэтому мы их отправляем в один список 
        }
        res.add(radio);
        return res;
    }

    private List<Walkable> runners (){          // список ходящих
        List<Walkable> res = new ArrayList<>();
        for (Animal animal:animals) {
            if (animal instanceof Walkable) {   // если мы можем animal преобразовать в Walkable, тогда мы 
                res.add((Walkable) animal);     // отправляем его в этот список
            }
        }
        return res;
    }

    public Animal championByRun () {            // определяем чемпиона 
        List<Walkable> start = runners();
        Walkable champ = start.get(0);
        for (Walkable runner:start) {
            if (champ.runSpeed()< runner.runSpeed()){
                champ = runner;
            }
        }
        return (Animal)champ;
    }

    private List<Flyable> flyers (){            // список летающих
        List<Flyable> res = new ArrayList<>();
        for (Animal animal:animals) {
            if (animal instanceof Flyable) {
                res.add((Flyable) animal);
            }
        }
        return res;
    }

    public Animal championByFly () {            // определяем чемпиона 
        List<Flyable> start = flyers();
        Flyable champ = start.get(0);
        for (Flyable flyer:start) {
            if (champ.flySpeed()< flyer.flySpeed()){
                champ = flyer;
            }
        }
        return (Animal)champ;
    }
}
