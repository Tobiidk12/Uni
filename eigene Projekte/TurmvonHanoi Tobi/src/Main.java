public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.addProduct("Unentwickeltes Pikachu",100);
        catalog.addProduct("Vier LoL Champions im Paket",4900);
        catalog.showProduct("Unentwickeltes Pikachu");
        catalog.showProduct("Vier LoL Champions im Paket");
        System.out.println(catalog.hasProduct("Vier LoL Champions im Paket"));
        ShoppingBasket shoppingBasket = new ShoppingBasket(catalog);
        shoppingBasket.addItem("Vier LoL Champions im Paket");
        shoppingBasket.addItem("Unentwickeltes Pikachu");
//        System.out.println("_____________");
        shoppingBasket.print();
        shoppingBasket.sortByName();
        shoppingBasket.print();
//        System.out.println("Vier LoL Champions im Paket Kat".length());
        System.out.println(shoppingBasket.decimal(4923));
        System.out.println(shoppingBasket.decimal(4905));

    }}