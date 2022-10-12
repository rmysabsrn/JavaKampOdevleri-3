public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        ProductManager manager = new ProductManager();
        product.name = "Mouse";
        product.price = 10;

        manager.add(product);
    }
}