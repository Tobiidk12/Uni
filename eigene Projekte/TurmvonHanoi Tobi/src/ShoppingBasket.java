import java.util.ArrayList;
import java.util.Collections;

public class ShoppingBasket {

    private Catalog Katalog;
    ArrayList<String> shoppingList;


    public ShoppingBasket (Catalog input){
        Katalog = input;
        shoppingList = new ArrayList<>();
    }

    public void addItem (String item){
    if (Katalog.hasProduct(item)){
        shoppingList.add(item);
    }

    }
    public void deleteitem(String item) {
        if (Katalog.hasProduct(item))
        {shoppingList.remove(item);}


    }
    public void deleteitems(){
        for (int i = 0; i < shoppingList.size(); i++){
            shoppingList.remove(i);
        }

    }

   public void printPackList(){
       for (String s : shoppingList) {
           System.out.println(s);
       }
    }

    public ArrayList sortByName(){
        Collections.sort(shoppingList);
        return shoppingList;
    }

    public void print(){
       String format = "+-----------------------------------+-------+";
        System.out.println(format);
        System.out.println("|Pos|Produkt                        |Preis  |");
        System.out.println(format);
        int pos = 1;
        int sum = 0;
        int maxLength = 31;
        String item;
        int preis = 0;
        int dif;
for (int i = 0; i < shoppingList.size(); i++){
    item = shoppingList.get(i);
    preis = Katalog.getProductPrice(item);
    if (item.length() > maxLength) {
        item = item.substring(0, maxLength);
    }
    System.out.print("|  " + i + item);
    if (item.length() <= maxLength) {
        dif = maxLength - item.length();
        for (int j = 0; j < dif; j++) {
            System.out.print(" ");
        }
        System.out.print("|" + decimal(preis));
        System.out.println("");
    }

    ;
    sum += preis;
}
        System.out.println(format);
        System.out.println("|                             Summe:" + sum);
        System.out.println(format);
    }
    public  String decimal(int num){
        String deci = "";
        int first = num / 100;
        int second2 = num % 100;
        if (second2 < 10 ){
            int second1 = num % 10;
            deci = first + "," + second1 + String.valueOf(second2);
        }
        else{
            deci = first + "," + String.valueOf(second2);
        }






        return deci;
    }



}
