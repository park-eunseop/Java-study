package generics;

public class GenericPrinterTest2 {
    public static void main(String[] args) {

        GenericExtendsPrinter<Powder> powderGenericPrinter = new GenericExtendsPrinter<>();
        powderGenericPrinter.setMaterial(new Powder());
        powderGenericPrinter.printing();

        GenericExtendsPrinter<Plastic> materialGenericExtendsPrinter = new GenericExtendsPrinter<>();
        materialGenericExtendsPrinter.setMaterial(new Plastic());
        materialGenericExtendsPrinter.printing();
    }
}
