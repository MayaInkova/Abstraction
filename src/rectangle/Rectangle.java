package rectangle;

public class Rectangle {
    private  Point bottomLeft;
    private  Point topRight;

    public Rectangle(int bottomLeftX,int bottomLeftY,int topRightX,int topRightY) {
        this.bottomLeft = new Point (bottomLeftX,bottomLeftY);
        this.topRight = new Point(topRightX,topRightY);
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }
    public  boolean contains (Point toCheck) {
        if (toCheck.getX() >= this.bottomLeft.getX() && toCheck.getX()<= this.topRight.getX()) {
            if (toCheck.getY() >= this.bottomLeft.getY() && toCheck.getY()<= this.topRight.getY() ) {
                return  true;
            }
        }
        return  false;
    }
}
