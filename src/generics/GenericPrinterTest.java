package generics;

public class GenericPrinterTest {

    public static void main(String[] args) {
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();

        powderGenericPrinter.setMaterial(new Powder());

        Powder material = powderGenericPrinter.getMaterial();

        System.out.println(powderGenericPrinter);


        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();

        plasticGenericPrinter.setMaterial(new Plastic());

        Plastic material1 = plasticGenericPrinter.getMaterial();

        System.out.println(plasticGenericPrinter);
    }
}
