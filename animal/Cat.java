package animal;

public class Cat extends Animal {

    public Cat (int jumpposibilites,int runpossibilites,String name,int age) {
        this.jumppossibilites = jumpposibilites;
        this.runpossibilites = runpossibilites;
        this.name = name;
        this.age = age;

    }

    @Override
    public void run() {
    results[0].competition = "Бег";
    results[0].res = runpossibilites;
    }

    @Override
    public void jump() {
        results[1].competition = "Прыг";
        results[1].res = jumppossibilites;
    }
}
