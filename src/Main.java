import transport.Car;

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

        car1.info();
        car2.info();
        car3.info();
        car4.info();
        car5.info();


    }
}