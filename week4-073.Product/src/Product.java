/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laurent
 */

/*
Consigne :
Create a class Product that represents a product sold in a webshop. 
A product has a price, amount and name.
A new class can be created as follows: 
Point at the project 073.Product in the projects tab 
and click the right mouse button. 
Then select new and java class. 
When a dialog opens, give the class the name Product.

The class should have:
    A constructor public Product(String nameAtStart, double priceAtStart, int amountAtStart)
    A method public void printProduct() 
    that prints a product in the following form: Banana, price 1.1, amount 13
 */
public class Product {
    private String name; private double price; private int amount;
    

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void printProduct() {
        System.out.println("Name: " + name + " Price: " + price + " Amount: " + amount);
    }
}
/* SOLUTION-TYPE :
public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", amount" + this.amount);
    }
}
*/