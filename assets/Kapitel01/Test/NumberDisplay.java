public class NumberDisplay
{
    private int limit;
    private int value;
    private NumberDisplay parent;
    
    public NumberDisplay(int rollOverLimit,NumberDisplay parent){
        this.parent = parent;
        limit = rollOverLimit;
        value = 0;
    }
    
    public NumberDisplay(int rollOverLimit)    {
        limit = rollOverLimit;
        value = 0;
    }

    public int getValue()    {
        return value;
    }
    

    public String getDisplayValueMinute()    {
        if(value < 10) {
            return "0" + value;
        }
        else {
            return "" + value;
        }
    }
    
    public String getDisplayValueHour()    {
        if(parent.value < 10) {
            return "0" + parent.value;
        }
        else {
            return "" + parent.value;
        }
    }

    public void setValue(int replacementValueHour, int replacementValueMinute)    {
        if((replacementValueHour >= 0) && (replacementValueHour < parent.limit)) {
            parent.value = replacementValueHour;
        }
        if((replacementValueMinute >= 0) && (replacementValueMinute < limit)) {
        value = replacementValueMinute;
        }
    }

    public void increment() {
        if (parent != null)
        {
            value = (value + 1) % limit;
            if (value==0){
        
                parent.value++;
                if(parent.value == 24){
                    parent.value = 0;
                }
            }
            
        }
    }
}