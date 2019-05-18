public class PointCalculator {

    public static Quarter getQuarter(Point point) {
        if (point.getX() > 0 && point.getY() > 0) {
            return Quarter.I;
        } else if (point.getX() > 0 && point.getY() < 0) {
            return Quarter.IV;
        } else if (point.getX()<0 && point.getY() > 0){
            return Quarter.II;
        }
        else if (point.getX() < 0 && point.getY() < 0) {
            return Quarter.III;
        } else {
            return null;
        }
    }

}
