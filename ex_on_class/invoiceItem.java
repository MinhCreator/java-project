class invoiceItem {
    
    String id, desc;
    int qty;
    double unitPrice;

    public invoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
    public double getUnitPrice() {
        return unitPrice;
    }

    
    public void setUnitPrice(double unitprice) {
        this.unitPrice = unitprice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    public static String ToString() {
        return invoiceItem.ToString();

    }
    
    
    public static void main(String[] args) {
        invoiceItem ivn = new invoiceItem("rgvs", "wefbwfh", 45, 3.5);

        System.out.println(ivn.toString());
    }
}