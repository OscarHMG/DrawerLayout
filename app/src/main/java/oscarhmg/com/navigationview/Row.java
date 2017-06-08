package oscarhmg.com.navigationview;

/**
 * Created by user on 07/06/2017.
 */
public class Row {

    public int icon;
    public String name;

    public Row(int icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
