
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


/**
 * 
 * 
 * Beschreiben Sie hier die Klasse Test_5.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Test_5
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Test_5
     */
    public Test_5()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

  public ArrayList<String> unify(ArrayList<String> input){
    ArrayList<String> result = new ArrayList<>();
    int i = 0;
    while(i < input.size()){
        if(input.get(i) != null && !(result.contains(input.get(i)))){
            result.add(input.get(i));
        }
        i++;
    }
    return result;
}
    
/*
public  List<String> arrayToList(String[] strings){
        if(strings == null) return null;
        ArrayList<String> List =new ArrayList<>();
        for(int i = strings.length -1; i >=0; i--){
            List.add(strings[i]);
        }
        return List;
    }
 
    public String[] listToArray(List<String> list){
        if(list == null) return null;
        String[] stringArray = list.toArray(new String[list.size()]);
        return stringArray;
    }
    */


   public  List<String> arrayToList(String[] strings){
       if(strings == null) return null;
       ArrayList<String> List = new ArrayList<>();
       for (String array : strings){
           List.add(array);
       }
return List;
    }
    
    public String[] listToArray(List<String> list){
if(list == null) return null;
String [] array = new String[list.size()];
for (int i = 0; i < list.size(); i++)
{ array [i] = list.get(i);

    
}
return array;   
        
        
}
    


public void deleteTabu(ArrayList<String> posts, String tabu){
    Iterator<String> i = posts.iterator();
        if (i.next() != null)
        {
        if (i.next().contains(tabu)){
            i.remove();
         }
        
    }

    while (i.hasNext()){
        if (i.next() != null)
        {
        if (i.next().contains(tabu)){
            i.remove();
         }
        
    }
}
    }
    
    
    /*public ArrayList<String> unify(ArrayList<String> input){
        for( arraylist 
        
        
    }
    */

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
}
