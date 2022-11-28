package praktikum5.soal1;
public abstract class shape {
    protected String shapeName;
    
    protected shape (String a) {
        this.shapeName = a;
    }
    
    protected abstract double area();
        
    protected String keString() {
        return shapeName;
    };
}
