import transport.Bus;
import transport.Car;
import transport.Train;

import java.security.Key;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Person maxim = new Person("Максим", "Минск",1987,  "Бренд-менеджер");
//        Person anna = new Person("Аня","Москва", 1993,"методист образовательных программ");
//        Person kate = new Person("Катя","Калининград", 1994,"продакт-менеджер");
//        Person artem = new Person(null,null, -4,"директор по развитию бизнесса");
//        Person vladimir = new Person("Владимир","Казань", 2001,null);
//
//        maxim.say();
//        anna.say();
//        kate.say();
//        artem.say();
//        vladimir.say();


        Car car1 = new Car(null,"Grande",1.7,"Жёлтый", -2015,"Россия", "Седан","A123AA321",1,1, "Автомат",150, "Бензин");
        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0 ,"Чёрный", 0,"Германия", "Седан","N705NN432",4,2,"Автомат",150, "Бензин");
        Car car3 = new Car("BMW","Z8",3.0,"Чёрный", 2021,"Германия", "","",2,3,"",150, "Дизель");
        Car car4 = new Car("Kia","Sportage 4 поколение",2.4,"Красный", 2018,"Южная Корея", "","A123AA",4,3,"Автомат",150, "Бензин");
        Car car5 = new Car("Hyundai","Avante",1.6,"Оранжевый", 2016,"Южная Корея", "Седан","A123AA",5,0,"Механика",150, "Дизель");

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

        Train train1 = new Train("Ласточка", "В-901", "", 2011, "Россия", 301, 3500, "Белорусский вокзал", "Минск-Пассажирский", 11, "Дизель");
        Train train2 = new Train("Ленинград", "D-125", "", 2019, "Россия", 270, 1700, "Ленинградский вокзал", "Ленинград-Пассажирский", 8, "Дизель");

        train1.info();
        train2.info();

        Bus bus1 = new Bus("MAN","Lions City","Черный",2020,"Германия",150, "Дизель");
        Bus bus2 = new Bus("Hyundai","H350","Серый",2019,"Южная Корея",160, "Бензин");
        Bus bus3 = new Bus("Ford","Sprinter 2","Красмный",2021,"США",140, "Бензин");

        bus1.info();
        bus2.info();
        bus3.info();


    }
}