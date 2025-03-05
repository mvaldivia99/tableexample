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

    // READ - fetch - select
    public static void readRow(ArrayList<Row> table){
        // read by id
        Scanner in = new Scanner(System.in);
        int id = -1;
        
        System.out.print("Enter id of product to search for: ");
        id = in.nextInt();

        for (Row r : table){
            if (r.id == id){
                System.out.println(r);
                break;
            }
        }

        if (id == -1){
            System.out.println("Error: product not found.");
        }

        in.close();
        // read by product name
        // search by a range
    }

    // UPDATE
    // update - make a change to a row
    // change product name?
    // change price?
    // TODO: Menu system that will prompt the user to request a different way to change
    public static void updateRow(ArrayList<Row> table){
        // update price of row
        Scanner in = new Scanner(System.in);
        int id = -1, index = -1;
        
        System.out.print("Enter id of product to search for: ");
        id = in.nextInt();

        for (int i = 0; i < table.size(); i++){
            if (table.get(i).id == id){
                index = i;
                break;
            }
        }

        if (id == -1){
            System.out.println("Error: product not found.");
        } else {
            System.out.print("Enter new price for product " + table.get(index).id + ": ");
            table.get(index).price = in.nextDouble();
            System.out.println("1 row updated");
        }

        in.close();
    }

    public static void deleteRow(ArrayList<Row> table){
        // delete by id
        Scanner in = new Scanner(System.in);
        int id = -1, index = -1;
        
        System.out.print("Enter id of product to delete for: ");
        id = in.nextInt();

        for (int i = 0; i < table.size(); i++){
            if (table.get(i).id == id){
                index = i;
                break;
            }
        }
        
        in.close();

        if (id == -1){
            System.out.println("Error: product not found.");
        } else {
            table.remove(index);
            System.out.println("1 row deleted.");
        }
    }


    public static void main(String[] args) {
        ArrayList<Row> table = new ArrayList<Row>();

        table.add(new Row(312, "Chai", 13.5)); // 0
        table.add(new Row(12, "Dates", 4.5)); // 1
        table.add(new Row(45, "broom", 12.30)); // 2

        // create a menu system to allow the user to interact with the table
        // call the methods above
    }
}