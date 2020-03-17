package Java;

public class Show {
    String name, desc;
    int length;
    public Show (String name, int length) {
        this.name=name;
        this.length=length;
    }
    public int getLength () {
        return length;
    }
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc (String desc) {
        this.desc=desc;
    }
}
