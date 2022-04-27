import java.util.Random;

public class Dot {
    int x;
    int y;
    int diameter = 12;
    public Dot() {
        x = new Random().nextInt(WhiteBoard.sizeX - 10);
        y = new Random().nextInt(WhiteBoard.sizeY - 10);
    }
    public Dot(int x, int y){
        this.x = x;
        this.y = y;
    }
}
