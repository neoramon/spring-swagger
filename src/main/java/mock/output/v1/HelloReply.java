package mock.output.v1;

public class HelloReply {

    private String name;
    private Integer number;

    public HelloReply() {
        super();
    }

    public HelloReply(String name, Integer number) {
        super();
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "HelloReply [name=" + name + ", number=" + number + "]";
    }
}
