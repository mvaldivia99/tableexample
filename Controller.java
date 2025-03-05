// description: this is a class that will control the flow of the program
// author: Michell Valdivia
// CS 141 example week 10

// simulate a simple database using ArrayLists
import java.util.ArrayList;
import java.util.Scanner;

class Controller{

    // CRUD operations - CREATE - READ - UPDATE - DELETE
    // CREATE
    public void addRow(ArrayList<Row> table){
        Scanner in = new Scanner(System.in);
        Row newRow = new Row();

        System.out.print("Enter row id: ");
        newRow.id = in.nextInt();

        System.out.print("Enter product name: ");
        newRow.prodName = in.nextLine();

        System.out.print("Enter product price: ");
        newRow.price = in.nextDouble();

        table.add(newRow);
        in.close();

        System.out.println("1 row added");
    }


    public static void main(String[] args) {
        ArrayList<Row> table = new ArrayList<Row>();

        table.add(new Row(312, "Chai", 13.5));
        table.add(new Row(12, "Dates", 4.5));
        table.add(new Row(45, "broom", 12.30));
    }
}