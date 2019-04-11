package animal;


import interfaces.Swimable;

public class Course {
String [] competition = new String[3];
public Course (){
    competition[0] = "run";
    competition[1] = "jump";
    competition[2] = "swim";
}

public void doIt(Team team){

    for (Animal animal : team.champions) {
        for (int i = 0; i <competition.length ; i++) {
            switch (competition[i]){
                case "run" : animal.run();
                    break;
                case "jump" :animal.jump();
                break;
                case "swim" : if(animal instanceof Swimable) {
                    ((Swimable) animal).swim(); }
                    else animal.dontswim();
                break;
        }
        }
    }

    }
}

