package factory;

public class Main {

    public static void main(String[] args) {
        CutPrint woodPrint = new TanakasWoodCutPrint();
        woodPrint.createWoodCutPrint();

        CutPrint potatoPrint = new ImagawasCutPrint();
        potatoPrint.createWoodCutPrint();
    }

}
