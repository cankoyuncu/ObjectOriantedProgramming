import java.util.ArrayList;
import java.util.Date;

public class Document {
    //İstediğimiz kadar string veririnin dizi benzeri bu yapıya eklenmesini sağlar.
    public ArrayList<String> authors = new ArrayList<String>();
    public Date date;//tarihsel veri

    public Date getDate() {
        System.out.println("Get Date");
        return date;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }
    public void addAuthor(String name){
        authors.add(name); // listenin boştaki ilk elemanına bunu ekler
    }

    public void showMessage(){
        System.out.println("showMessage calls in an object which created from document Class");
    }
}
