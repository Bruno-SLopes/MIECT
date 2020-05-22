import static java.lang.System.*;

public class Room{
    private Point cie, csd;
    private String kind_of_room;

    public Room(Point cie, Point csd, String kind_of_room){
        this.cie = cie;
        this.csd = csd;
        this.kind_of_room = kind_of_room;
    }

    public String roomType(){
        return kind_of_room;
    }

    public Point bottomLeft(){
        return cie;
    }

    public Point topRight(){
        return csd;
    }

    public Point geomCenter(){
        Point center = cie.halfWayTo(csd);
        return center;
    }

    public double area(){
        double r_area = (csd.x() - cie.x()) * (csd.y() - cie.y());
        return r_area;
    }
}