package gr.aueb.cf.ch19Collections.maps;

public class Product implements Comparable<Product> {
    private String id;
    private String description;
    private double price;
    private int quantity;

    public Product() {
    }


    public Product(String id, String description, double price, int quantity) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }




//    @Override
//    public int compareTo(Product o) {
//        return this.description.compareTo(o.description);
//        //return o.description.compareTo(this.description);  //desc ordering
//    }
//


//    @Override
//    public int compareTo(Product o) {
//        return this.quantity - o.quantity;
//   }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }
}
