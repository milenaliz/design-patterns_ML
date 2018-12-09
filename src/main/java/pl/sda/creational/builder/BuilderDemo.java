package pl.sda.creational.builder;

public class BuilderDemo {
    public static void main(String[] args, String name, String lastName) {

        Customer customer = new Customer.Builder(name,lastName)
                            .withName("John")
                            .withLastName("Smith")
                            .build();

        Customer defaultCustomer = Customer.createDefault();
        Customer emptyCustomer = Customer.createEmpty();
    }

}
