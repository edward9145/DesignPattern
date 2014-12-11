package factory;

public abstract class WoodCutPrint {

    public abstract void draw( Cuttable hanzai );
    public abstract void cut( Cuttable hanzai );
    public abstract void print( Cuttable hanzai );

    protected Cuttable createCuttable(){
        return new Wood();
    }

    public void createWoodCutPrint(){
        Cuttable hanzai = this.createCuttable();
        draw( hanzai );
        cut( hanzai );
        print( hanzai );
    }

}
