
public class Room implements Comparable<Room>{
    String roomID;
    String name;
    int totalSeat;
    int bookedSeat;

    public Room() {
    }

    public Room(String roomID, String name, int totalSeat, int bookedSeat) {
        this.roomID = roomID;
        this.name = name;
        this.totalSeat = totalSeat;
        this.bookedSeat = bookedSeat;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public int getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(int bookedSeat) {
        this.bookedSeat = bookedSeat;
    }
    
    public void display(){
        System.out.println(roomID + "\t" + name + "\t" + bookedSeat + "\t"
                + totalSeat +"\t");
        
    }

    @Override
    public int compareTo(Room o) {
        return name.compareTo(o.name);
    }
}
