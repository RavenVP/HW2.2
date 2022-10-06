import transport.Car;

import java.security.Key;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person maxim = new Person("Максим", "Минск",1987,  "Бренд-менеджер");
        Person anna = new Person("Аня","Москва", 1993,"методист образовательных программ");
        Person kate = new Person("Катя","Калининград", 1994,"продакт-менеджер");
        Person artem = new Person(null,null, -4,"директор по развитию бизнесса");
        Person vladimir = new Person("Владимир","Казань", 2001,null);

        maxim.say();
        anna.say();
        kate.say();
        artem.say();
        vladimir.say();


        Car car1 = new Car(null,"Grande",1.7,"Жёлтый", -2015,"Россия", "Седан","A123AA321",1,1, "Автомат");
        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0 ,"Чёрный", 0,"Германия", "Седан","N705NN432",4,2,"Автомат");
        Car car3 = new Car("BMW","Z8",3.0,"Чёрный", 2021,"Германия", "","",2,3,"");
        Car car4 = new Car("Kia","Sportage 4 поколение",2.4,"Красный", 2018,"Южная Корея", "","A123AA",4,3,"Автомат");
        Car car5 = new Car("Hyundai","Avante",1.6,"Оранжевый", 2016,"Южная Корея", "Седан","A123AA",5,0,"Механика");

        Car.Key c1 = new Car.Key("Да", "Нет");
        Car.Key c2 = new Car.Key("", "Нет");
        Car.Key c3 = new Car.Key("Нет", "");
        Car.Key c4 = new Car.Key("Да", "Да");
        Car.Key c5 = new Car.Key("Нет", "Нет");

        Car.Insurance c1I = new Car.Insurance(LocalDate.of(2020,11,21),75000,"54367897");
        Car.Insurance c2I = new Car.Insurance(LocalDate.of(2023,12,21),150000,"765234876");
        Car.Insurance c3I = new Car.Insurance(LocalDate.of(2025,6,16),350000,"543214");
        Car.Insurance c4I = new Car.Insurance(LocalDate.of(2021,6,11),75000,"876123657");
        Car.Insurance c5I = new Car.Insurance(LocalDate.of(2025,11,27),432456,"456432867");

        car1.setInsurance(c1I);
        car2.setInsurance(c2I);
        car3.setInsurance(c3I);
        car4.setInsurance(c4I);
        car5.setInsurance(c5I);

        car1.setKey(c1);
        car2.setKey(c2);
        car3.setKey(c3);
        car4.setKey(c4);
        car5.setKey(c5);

        car1.info();
        car2.info();
        car3.info();
        car4.info();
        car5.info();


    }
}