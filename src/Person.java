public class Person {
    int age;
    String name;
    String city;
    String work;

    Person(String name, String city, int age, String work) {
        this.age = age;
        this.name = name;
        this.city = city;
        this.work = work;
    }

    void say() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + age + " году. Я работаю на должности " + work + ". Будем знакомы!" );
    }
}
