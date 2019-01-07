

public class Animal  {
    public static void main(String[] args) {

        Dog pies = new Dog();
        Cat kot = new Cat();


        pies.dogType = "Labrador";
        kot.catType = "Pers";

        pies.showDogAttributes();
        pies.checkDogSpeed();
        kot.showCatAttributes();
        kot.checkCatAge();

    }

}
