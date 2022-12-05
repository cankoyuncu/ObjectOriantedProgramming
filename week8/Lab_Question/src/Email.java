import java.util.ArrayList;

public class Email extends  Document{

    public String subject;
    public ArrayList<String> to = new ArrayList<String>();

    public String getSubject() {
        return subject;
    }

    public void addTo(String name){
        to.add(name);
    }
}
