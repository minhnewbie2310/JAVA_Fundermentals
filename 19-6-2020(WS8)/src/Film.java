
public class Film implements Comparable<Film> {

    int filmID;
    int genre;
    String name;
    String country;
    String year;

    public Film() {
    }

    public Film(int filmID, int genre, String name, String country, String year) {
        this.filmID = filmID;
        this.genre = genre;
        this.name = name;
        this.country = country;
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public void display() {
        System.out.println(filmID + "\t" + genre + "\t" + name + "\t"
                + "\t" + year + "\t" + country);
    }

    @Override
    public int compareTo(Film o) {
        if(filmID<=o.filmID){
            return -1;
        }else{
            return 1;
        }
    }

}
