public class Person {
    int age;
    String name;
    String city;
    String work;

    Person(String name, String city, int age, String work) {
        if (name == null) {
            this.name = "<<Информация не указана>>";
        } else {
            this.name = name;
        }
        if (city == city) {
            this.city = "<<Информация не указана>>";
        } else {
            this.city = city;
        }
        if (age <= 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
        if (name == null) {
            this.work = "<<Информация не указана>>";
        } else {
            this.work = name;
        }
    }


    void say() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + age + " году. Я работаю на должности " + work + ". Будем знакомы!" );
    }
}
