package mod1;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    private Person(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.country = builder.country;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private  String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        Builder addFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        Builder addLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        Builder addMiddleName(String middleName){
            this.middleName = middleName;
            return this;
        }

        Builder addCountry(String country){
            this.country = country;
            return this;
        }

        Builder addAddress(String address){
            this.address = address;
            return this;
        }

        Builder addPhone(String phone){
            this.phone = phone;
            return this;
        }

        Builder addAge(int age){
            this.age = age;
            return this;
        }

        Builder addGender(String gender){
            this.gender = gender;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
