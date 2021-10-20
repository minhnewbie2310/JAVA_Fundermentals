
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        String filmFile = "Films.txt";
        String roomFile = "Rooms.txt";
        Scanner sc = new Scanner(System.in);
        Utinity u = new Utinity();
        FilmList fl = new FilmList();
        RoomList rl = new RoomList();
        fl.addFromFile(filmFile);
        rl.addFromFile(roomFile);
        boolean done = true;
        do {
            int choose = u.getInt("IA1501 HE150552 Phan Tuan Minh"
                    + "\n 1. Add film to film list"
                    + "\n 2. Display list film"
                    + "\n 3. Save list film to file"
                    + "\n 4. Add room to room list"
                    + "\n 5. Display room list"
                    + "\n 6. Save list room to file\n");

            switch (choose) {
                case 1:
                    fl.addNewFilm();
                    break;
                case 2:
                    fl.display();
                    System.out.println();
                    break;
                case 3:
                    fl.saveToFile(filmFile);
                    break;
                case 4:
                    rl.addNewRoom();
                    break;
                case 5:
                    rl.display();
                    break;
                case 6:
                    rl.saveToFile(roomFile);
                    break;
                default:
                    System.out.println("Re-enter your choice!!!");
            }
            System.out.print("Continue ? (Y/N) ");
            boolean ok = true;
            do {
                String ch = sc.next();
                switch (ch.toLowerCase()) {
                    case "y":
                        ok = false;
                        break;
                    case "n":
                        ok = false;
                        done = false;
                        break;
                    default:
                        System.out.println("y/Y or n/N !!!");
                }
            } while (ok);
        } while (done);
    }
}
