public class Animal {
    String tipe;

    Animal(String tipe){
        if (tipe == "Not Predator" || tipe == "Predator"){
            this.tipe = tipe;
        }
    }
}