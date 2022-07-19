
class Animales{
    public void animalSound(){
        System.out.println("Los animales hacen sonidos");
    }
}

class Leon extends Animales{
    public void animalSound(){
        System.out.println("El leon ruge con fuerza");
    }
}

class Perro extends Animales{
    public void animalSound(){
        System.out.println("Los Perros Ladran");
    }
}

class Polymorfismo{
    public static void main(String[] args) {
        Animales myAnimal = new Animales();
        Animales myLeon = new Leon();
        Animales myPerro = new Perro();
        myAnimal.animalSound();
        myLeon.animalSound();
        myPerro.animalSound();
    }
}