public class Month {
    private final int month;
    public Month(int m){
        month = m;
    }

    public boolean isRmonth(){
        int m = month;
        while (m<0){
        m = m +12;
        }
        m = m%12;
        
        if (m>8){
        return true;
    }
    
            if (m<5){
        return true;
    }
    return false;
}
public int crossTotal(int n){
    int i;
    for (i = 0; n > 9; i++){
        n= n-10;
    }
    return i + n;
    
    
    
}
}
