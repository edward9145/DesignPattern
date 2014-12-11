package adapter;

public class Hanako implements Chairperson {

    private Taro taro;

    public Hanako(){
        this.taro = new Taro();
    }

    @Override
    public void organizeClass() {
        taro.enjoyWithAllClassmate();

    }

}
