package factory;

public class ImagawasCutPrint extends CutPrint {

    @Override
    public void draw(Cuttable hanzai) {
        System.out.println("マンガの絵を描く");
    }

    @Override
    public void cut(Cuttable hanzai) {
        System.out.println("彫刻刀を利用して器用に彫る");
    }

    @Override
    public void print(Cuttable hanzai) {
        System.out.println("インクとして、自分の血を使いプリントする");
    }

    @Override
    public Cuttable createCuttable(){
        return new Potato();
    }
}
