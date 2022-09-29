public class Main {
    public static void main(String[] args) {
        Person maxim = new Person("Максим", "Минск",1987,  "Бренд-менеджер");
        Person anna = new Person("Аня","Москва", 1993,"методист образовательных программ");
        Person kate = new Person("Катя","Калининград", 1994,"продакт-менеджер");
        Person artem = new Person(null,null, -4,"директор по развитию бизнесса");

        maxim.say();
        anna.say();
        kate.say();
        artem.say();


        Car car1 = new Car(null,"Grande",1.7,"Жёлтый", -2015,"Россия");
        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0 ,"Чёрный", 0,"Германия");
        Car car3 = new Car("BMW","Z8",3.0,"Чёрный", 2021,"Германия");
        Car car4 = new Car("Kia","Sportage 4 поколение",2.4,"Красный", 2018,"Южная Корея");
        Car car5 = new Car("Hyundai","Avante",1.6,"Оранжевый", 2016,"Южная Корея");

        car1.info();
        car2.info();
        car3.info();
        car4.info();
        car5.info();


    }
}