import java.util.ArrayList;

class Catalog {

    private class Entry implements Comparable<Entry> {
        String product;
        Integer price;

        public Entry(String name, int priceInCent) {
            product = name;
            price = priceInCent;
        }

        @Override
        public int compareTo(Entry o) {
            return product.compareTo(o.product);
        }

    }

    private ArrayList<Entry> products;

    /**
     * Constructor for objects of class Catalog
     */
    public Catalog() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, int priceInCent) {
        if (!hasProduct(name)) {
            products.add(new Entry(name, priceInCent));
        }
    }

    public void deleteProduct(String name) {
        products.removeIf(p -> p.product.equals(name));
    }

    public void updateProduct(String name, int priceInCent) {
        if (hasProduct(name)) {
            deleteProduct (name);
            addProduct(name, priceInCent);
        }
    }

    private String priceToString(int price) {
        return price / 100 + "€";
    }

    public boolean hasProduct(String name) {
        return products.stream().anyMatch(p -> name.equals(p.product));
    }

    public int getProductPrice(String name) {
        return products.stream().filter(p -> name.equals(p.product)).findAny().get().price;
    }

    public void showProduct(String name) {
        if (hasProduct(name)) {
            int price = getProductPrice(name);
            System.out.println(name + ": " + priceToString(price));
        }
    }
}