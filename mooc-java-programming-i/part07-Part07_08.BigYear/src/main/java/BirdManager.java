import java.util.ArrayList;

public class BirdManager {
    ArrayList<Bird>birdList;

    public BirdManager(){
        this.birdList = new ArrayList<>();
    }

    public void addBird(Bird bird){
        this.birdList.add(bird);
    }

    public void removeBird(Bird bird){
        this.birdList.remove(bird);
    }

    public void clearBirdList(){
        this.birdList.clear();
    }

    public ArrayList<Bird> getBirdList(){
        return this.birdList;
    }
}
