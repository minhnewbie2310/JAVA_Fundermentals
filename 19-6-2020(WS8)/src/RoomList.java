
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


public class RoomList extends Vector<Room> {
    Utinity u = new Utinity();
    Scanner sc = new Scanner(System.in);

    public RoomList() {
        super();
    }
    String roomID;
    String name;
    int totalSeat;
    int bookedSeat;

    public void addFromFile(String filename) {
        try {
            File f = new File(filename);
            if (f.exists() == false) {
                return;
            }
            FileReader fr = new FileReader(f);
            BufferedReader bfr = new BufferedReader(fr);
            String detail;
            while ((detail = bfr.readLine()) != null) {
                String[] stk = detail.split("\t");
                roomID = stk[0];
                name = stk[1];
                bookedSeat = Integer.parseInt(stk[2]);
                totalSeat = Integer.parseInt(stk[3]);

                Room addRoom = new Room(roomID, name, totalSeat, bookedSeat);
                this.add(addRoom);
            }
            fr.close();
            bfr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveToFile(String room) {
        if (this.isEmpty()) {
            System.out.println("Empty room list!!!");
            return;
        }
        try {
            File f = new File(room);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (Room x : this) {
                pw.println(x.getRoomID() + "\t" + x.getName() + "\t"
                        + x.getBookedSeat() + "\t" + x.getTotalSeat());
            }
            fw.close();
            pw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private int find(String rname){
        for (int i = 0; i < this.size(); i++){
            if (this.get(i).getName().toLowerCase().equals(rname)){
                return i;
            }
        }
        return -1;
    }
    
    public void addNewRoom(){
        String newRoomID;
        String newname;
        int newTotalSeat;
        int newBookedSeat;
        int pos;
        System.out.println("Enter new room information");
        System.out.print("Enter Room number: ");
        newRoomID = sc.nextLine();
        do {            
            System.out.print("Enter new room name: ");
            newname = sc.nextLine();
            pos = find(newname.toLowerCase());
            if(pos >= 0){
                System.out.println("This room is already exist!!!");
            }
        } while (pos >=0);
//        System.out.print("Enter number oftotal seat in room: ");
        
//        System.out.print("Enter number of booked seat in room: ");
        newBookedSeat = u.getInt("Enter number of booked seat in room: ");
        do {            
            newTotalSeat = u.getInt("Enter number of total seat in room: ");
            if(newTotalSeat < newBookedSeat){
                System.out.println("number of total seat must larger than booked seat");
            }
        } while (newTotalSeat < newBookedSeat);
        
        this.add(new Room(newRoomID, newname, newBookedSeat, newTotalSeat));
        System.out.println("New room has been added!!!");
    }
    
    public void display(){
        if(this.isEmpty()){
            System.out.println("Empty room list!!!");
            return; 
        }
        Collections.sort(this);
        System.out.println("Room list");
        System.out.println("-------------------------------------");
        for (Room x : this){
            x.display();
        }
    }
}
