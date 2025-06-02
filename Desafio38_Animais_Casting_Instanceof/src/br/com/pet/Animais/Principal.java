package br.com.pet.Animais;

import br.com.pet.Animais.models.Animal;
import br.com.pet.Animais.models.Cachorro;

public class Principal {
    public static void main(String[] args) {

        //Instanciando objeto da classe Cachorro
        Cachorro dog1 = new Cachorro();
        dog1.setRaca("Buldogue");
        dog1.setCor("Preto");

        //Casting para o Animal - Upcasting
        Animal animal = dog1;

        // Mesmo com tipo Animal, o objeto continua sendo Cachorro por dentro
        System.out.println("Resultado Após Casting");
        animal.emitirSom(); // Vai executar o método da classe Cachorro

        // Podemos reverter (DOWNCASTING), com segurança, se quisermos usar métodos específicos:
        if (animal instanceof Cachorro) {
            Cachorro dogCast = (Cachorro) animal;
            System.out.println(dogCast); // usa toString da classe Cachorro
        }

        Animal outroAnimal = new Animal();
        if (outroAnimal instanceof Cachorro) {
            // Isso não será executado, pois Animal não é um Cachorro
            System.out.println("Esse animal é um cachorro.");
        } else {
            System.out.println("Esse animal NÃO é um cachorro.");
        }

    }
}
