package animal;

public class Team {
    Animal [] champions = new Animal[4];


public Team (){

    champions[0]=new Cat(5,100,"Barsic",4);
    champions[1]=new Dog (10,2,1000,"Zhuchka",7);
    champions[2]=new Human(1000,1,10000,"Oleg",28);
    champions[3]=new Human(500,2,5000,"Maria",22);
}
 void premiere (){
     for (Animal animal : champions){
         System.out.println("Имя участника "+ animal.name + " возраст " + animal.age);
     }
 }
             protected void showResults(){
                 for (Animal animal :champions){
                     for (int i =0 ; i< animal.results.length;i++){
                         System.out.println("Результат участника " +animal.name + " в дисциплине " + animal.results[i].competition + " составил " + animal.results[i].res);
         }

     }
}

}
