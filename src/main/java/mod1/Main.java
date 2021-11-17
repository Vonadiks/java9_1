package mod1;

public class Main {
    public static void main(String[] args) {
        Person pers = new Person.Builder().addFirstName("Leonid").addMiddleName("Ilyich").addLastName("Brezhnev").addCountry("USSR").build();
        System.out.println("The Person is " + pers.getFirstName() + " " + pers.getMiddleName() + " " + pers.getLastName() + " from " + pers.getCountry());
    }
}
