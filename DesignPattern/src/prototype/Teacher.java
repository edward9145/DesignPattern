package prototype;

public class Teacher {

    public Paper[] createManyCrystals(){
        Paper[] papers = new Paper[10];
        for(int n=0; n<papers.length; n++){
            this.drawCrystal(papers[n]);  // 時間がかかる
            this.cutAccordanceWithLine(papers[n]);  // 時間がかかる
        }
        return papers;
    }

    public Paper[] createManyCrystalsByPrototype(){
        Paper prototype = new Paper("雪の結晶");
        this.drawCrystal(prototype);
        this.cutAccordanceWithLine(prototype);
        Paper[] papers = new Paper[10];

        for(int n=0; n<papers.length; n++){
            papers[n] = (Paper)prototype.createClone();
        }
        return papers;
    }


    private void drawCrystal(Paper paper){
        // きれいに描くため時間がかかる
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }
    private void cutAccordanceWithLine(Paper paper){
        // 描かれた線に沿ってきれいに切るには時間がかかる
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }
}
