import java.util.ArrayList;
import java.util.Date;

public class Book extends Document {

    public String title;

    public String getTitle() {
        return this.title;
    }

    @Override
    public void showMessage() {
        System.out.println("Show Message in Book Class");
        super.showMessage();
        System.out.println("showMessage calls in an object which created from BOOK Class");
    }
}
