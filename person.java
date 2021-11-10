package ThuaKe_Bai1;

/**
 *
 * @author admin
 */
public class Person {
    String name;
    char gender;
    int birth_year;

    public Person() {
    }

    public Person(String name, char gender, int birth_year) {
        this.name = name;
        this.gender = gender;
        this.birth_year = birth_year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", birth_year=" + birth_year + '}';
    }
    
}
