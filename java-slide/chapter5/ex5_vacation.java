import java.time.*;

class vacation {

    private int length;
    private LocalDate date;
    private String place;

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getPlace() {
        return place;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "vacation{" +
                "length=" + length +
                ", date=" + date +
                ", place='" + place + '\'' +
                '}';
    }
}

public class ex5_vacation {
    public static void main(String[] args) {
 
    }
}