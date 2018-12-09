package pl.sda.creational.builder;

import java.time.LocalDate;

public class Customer {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String pesel;
    private String profession;
    private String city;
    private String country;

//    public Customer(String name, String lastName, LocalDate birthDate, String pesel, String profession, String city, String country) {
//        this.name = name;
//        this.lastName = lastName;
//        this.birthDate = birthDate;
//        this.pesel = pesel;
//        this.profession = profession;
//        this.city = city;
//        this.country = country;
//    }

    private Customer() {

    }

    public static Customer createEmpty(){
        return new Customer();
    }

    public static Customer createDefault(){
        Customer customer = new Customer();
        customer.name = "";
        customer.lastName = "";
        return customer;
    }

    public static Builder create(String name, String lastName){
        return new Builder (name, lastName);
    }

    public static class Builder {
        private Customer customer = new Customer();

        public Builder(String name, String lastName){
            customer.birthDate = LocalDate.now();
        }

        public Builder withName(String name) {
            customer.name = name;
            return this;
        }

        public Builder withLastName(String lastName) {
            customer.lastName = lastName;
            return this;
        }

        public Builder bornAt (LocalDate birthDate) {
            customer.birthDate = birthDate;
            return this;
        }

        public Builder withPesel(String pesel) {
            customer.pesel = pesel;
            return this;
        }

        public Builder withProfession(String profession) {
            customer.profession = profession;
            return this;
        }

        public Builder withCity(String city) {
            customer.city = city;
            return this;
        }

        public Builder withCountry(String country) {
            customer.country = country;
            return this;
        }

        public Customer build(){
            return customer;
        }
    }
}