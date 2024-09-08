public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString; 
    
    
    public ClockDisplay(){
        hours = new NumberDisplay(60,new NumberDisplay(24));
        //minutes = new NumberDisplay(60);
        updateDisplay();
    }
    public ClockDisplay(int hour, int minute){
        hours = new NumberDisplay(60, new NumberDisplay(24));
        //minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }
    public void timeTick(){
        hours.increment();
        /*
        if(minutes.getValue() == 0) {  
            hours.increment();
        }
        */
        updateDisplay();
    }
    public void setTime(int hour, int minute) {
        hours.setValue(hour, minute);
        //minutes.setValue(minute);
        updateDisplay();
    }

    public String getTime() {
        return displayString;
    }
    
    private void updateDisplay() {
        displayString = hours.getDisplayValueHour() + ":" + 
        hours.getDisplayValueMinute();
                        //minutes.getDisplayValue();
    }
}
