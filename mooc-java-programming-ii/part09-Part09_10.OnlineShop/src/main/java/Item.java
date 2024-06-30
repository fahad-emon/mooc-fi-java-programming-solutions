public class Item {

    private String product;
    private int quantity;
    private int price;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.quantity = qty;
        this.price = unitPrice;
    }

    public String getProduct(){
        return this.product;
    }

    public int price() {
        return this.price * this.quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    public String toString() {
        return this.product + ": " + this.quantity;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (price != item.price) return false;
        return product != null ? product.equals(item.product) : item.product == null;
    }    

}
