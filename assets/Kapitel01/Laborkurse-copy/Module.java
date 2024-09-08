public class Module {
    private String code;
    private String name;
    public Module(String _code, String _name){
        code=_code;
        name=_name;
    }
    public void setName(String _name){
        name=_name;
    }
    public String getName(){
        return name;
    }
    public String getCode(){
        return code;
    }
    private int contactHours;
public void set_contactHoursn(int contactHours) {
     contactHours = contactHours;
}
public int getcontactHours() {
    return contactHours;
}


}