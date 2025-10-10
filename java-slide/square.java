class square {
    double SIDE;

    public void setSide(double side) {
        this.SIDE = side;
    }
    
    public double getSide() {
        return SIDE;
    }

    public double areaCal() {
        return SIDE * SIDE;
    }

    public double perimeterCal() {
        return SIDE * 4;
    }
}