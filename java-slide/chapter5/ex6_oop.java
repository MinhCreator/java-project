class Hotel {
    private Place place;
    private String name;
    private Room room;

    public Hotel(Room room, Place place, String name) {
        this.room = room;
        this.place = place;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Room getRoom() {
        return room;
    }

    public Place getPlace() {
        return place;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "place=" + place +
                ", name='" + name + '\'' +
                ", room=" + room +
                '}';
    }
    
}

class Place {
    private String cityName;
    private String countryName;
    private Currency currency;
    private String cityHallTel;

    public Place(String cityName, String countryName, Currency currency, String cityHall) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.currency = currency;
        this.cityHallTel = cityHall;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setCityHall(String cityHall) {
        this.cityHallTel = cityHall;
    }

    @Override
    public String toString() {
        return "Place{" +
                "cityName='" + cityName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", currency=" + currency +
                ", cityHall='" + cityHallTel + '\'' +
                '}';
    }
}

class Currency {
    private String name;
    private double Curr_Dollar_rate;

    public Currency(String name, double Curr_Dollar_rate) {
        this.name = name;
        this.Curr_Dollar_rate = Curr_Dollar_rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setCurr_Dollar_rate(double Curr_Dollar_rate) {
        this.Curr_Dollar_rate = Curr_Dollar_rate;
    }

    public double getCurr_Dollar_rate() {
        return Curr_Dollar_rate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", Curr_Dollar_rate=" + Curr_Dollar_rate +
                '}';
    }
}

class Room {
    private int beds;
    private boolean tv;
    private boolean telephone;

    public Room(int beds, boolean tv, boolean telephone) {
        this.beds = beds;
        this.tv = tv;
        this.telephone = telephone;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public void setTelephone(boolean telephone) {
        this.telephone = telephone;
    }

    public int getBeds() {
        return beds;
    }

    public boolean getTv() {
        return tv;
    }

    public boolean getTelephone() {
        return telephone;
    }
}

