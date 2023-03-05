public class Menu {
    int number;
    String text;

    public int testInt;
    public Integer testInteger;

    Menu(int number, String text){
        this.number = number;
        this.text = text;
    }

    void test(){
        System.out.println(this.number + " - " + this.text);
        //return this.number + " - " + this.text;
    }

    void gClass(){
        Class myClass = getClass();
        String name = myClass.getName();
        //Class c = Menu.class;
        System.out.println(name);
        //return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
