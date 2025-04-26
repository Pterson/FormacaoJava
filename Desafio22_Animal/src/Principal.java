import br.com.petAnimal.models.Cachorro;
import br.com.petAnimal.models.Gato;

public class Principal {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro();
        dog.emitirSom();
        dog.abanarRabo();

        Gato cat = new Gato();
        cat.emitirSom();
        cat.arranharMoveis();

    }
}
