// this class will represent a row in a table

public class Row {
    int id;
    String prodName;
    double price;

    // set defaut row
    Row(){
        id = -1;
        prodName = null;
        price = -1.0;
    }

    // 3-arg 
    Row(int id, String prodName, double price){
        this.id = id;
        this.prodName = prodName;
        this.price = price;
    }

    // toString 
    // TODO: Format string better
    public String toString(){
        return this.id + " " + this.prodName + " " + this.price + "\n";
    }
}
