public class Person {
    private int yearOfBirth;
    String name;
     private String city;
    String work;

    Person(String name, String city, int yearOfBirth, String work) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "<<Информация не указана>>";
        } else {
            this.name = name;
        }
        if (city == null || city.isBlank() || city.isEmpty()) {
            this.city = "<<Информация не указана>>";
        } else {
            this.city = city;
        }
        if (yearOfBirth <= 0 ) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (work == null || work.isBlank() || work.isEmpty()) {
            this.work = "<<Информация не указана>>";
        } else {
            this.work = work;
        }
    }


    void say() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + work + ". Будем знакомы!" );
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getCity() {
        return city;
    }
}
