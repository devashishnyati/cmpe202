package five_guys_burger;

public interface Component {

    void display() ;
    void addChild(Component c);
    void removeChild(Component c);
    Component getChild(int i);
}
