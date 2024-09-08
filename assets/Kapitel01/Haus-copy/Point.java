public class Point {
    private final int x;
    private final int y;
    public Point(int xPos, int yPos){
        x=xPos;
        y=yPos;
    }
    
    public boolean isOnXAxis () {
        return x == 0;
 }
}