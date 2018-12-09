package pl.sda.structural_proxy_adapter;

public class Duck implements Animal{

    public void makeQuack(){
        System.out.println("Quack");
    }

    @Override
    public void makeSound() {

    }
}
