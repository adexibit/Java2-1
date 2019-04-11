package animal;

import interfaces.Swimable;

public class Dog extends Animal implements Swimable {
    public int swimpossibilites;

   public Dog (int swimpossibilites,int jumpposibilites,int runpossibilites,String name,int age) {
       this.swimpossibilites = swimpossibilites;
       this.jumppossibilites = jumpposibilites;
       this.runpossibilites = runpossibilites;
       this.name = name;
       this.age = age;

   }
    public void run() {
        results[0].competition = "Бег";
        results[0].res = runpossibilites;
    }

    @Override
    public void jump() {
        results[1].competition = "Прыг";
        results[1].res = jumppossibilites;
    }

    @Override
    public void swim() {
        results[2].competition = "Заплыв";
        results[2].res = swimpossibilites;
    }
}
