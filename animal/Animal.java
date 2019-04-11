package animal;

import interfaces.Jumpable;
import interfaces.Runnable;

public abstract class Animal implements Runnable, Jumpable {
    protected String name;
    protected int age;
    protected int runpossibilites;
    protected int jumppossibilites;
    protected Results[] results ;
    public Animal(){
        this.results = new Results[3];
        this.results[0] = new Results();
        this.results[1] = new Results();
        this.results[2] = new Results();
    }



    protected void dontswim() {
        results[2].competition = "Не плавал";
        results[2].res = 0;
    }


}

