package clases;

public class cliente extends classPadre  {

    private int id;

    public cliente(String name, String lastname, int age, String email, int id) {
        super(name, lastname, age, email);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "cliente [id=" + id + "]";
    }

}
