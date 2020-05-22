import static java.lang.System.*;

public class House{
    private String houseType;
    private int tamanho = 0;
    private int tamanho_expansao;
    private Room[] rooms;

    public House(String houseType){
        this(houseType, 8, 4);
    }

    public House(String houseType, int tamanho, int tamanho_expansao){
        this.houseType = houseType;
        this.tamanho_expansao = tamanho_expansao;
        rooms = new Room[tamanho];
    }

    public void addRoom(Room room){
        if(tamanho == rooms.length){
            extendHouse();
        }
        rooms[tamanho] = room;
        tamanho++;
    }

    private void extendHouse(){
        Room[] newRooms = new Room[tamanho + tamanho_expansao];
        arraycopy(rooms, 0, newRooms, 0, rooms.length);
        rooms = newRooms;
    }

    public int size(){
        return tamanho;
    }

    public int maxSize(){
        return rooms.length;
    }

    public Room room(int index){
        return rooms[index];
    }

    public double area(){
        double totalArea = 0;
        for(int i = 0; i < tamanho; i++){
            totalArea += rooms[i].area();
        }
        return totalArea;
    }

    public RoomTypeCount[] getRoomTypeCounts(){
        RoomTypeCount[] a = new RoomTypeCount[1];
        for(int i = 0; i < a.length; i++){
            a[i].roomType = rooms[i].roomType();
        }
        return a;
    }

    public double averageRoomDistance(){
        int cont = 0;
        double distance = 0;
        for(int i = 0; i < tamanho-1; i++){
            for(int j = i+1; j < tamanho; j++){
                distance += rooms[i].geomCenter().distTo(rooms[j].geomCenter());
                cont++;
            }
        }
        //out.println(distance);
        //out.println(cont);
        return distance/cont;
    }
}