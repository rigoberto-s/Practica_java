
import java.util.Objects;

public class Astronauta {

    private String id;

    public Astronauta(String id){
        this.id=id;
    }

    public Astronauta(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Astronauta other = (Astronauta) obj;
        return Objects.equals(this.id, other.id);
    }

    
}
