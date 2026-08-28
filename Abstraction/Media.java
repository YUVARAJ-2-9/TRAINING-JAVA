package Abstraction;
abstract class MeadiaItem{
    abstract void Play();
    abstract void Calcul();
}
abstract class FilterStrategy{

}
class Song extends MeadiaItem{
    void Play(){
        System.out.println("Song is playing!");
    }

    @Override
    void Calcul() {
        System.out.println("Calculate how many songs are there");
    }
}
class PoadCast extends MeadiaItem{
    void Play(){
        System.out.println("PoadCast is playing!");
    }

    @Override
    void Calcul() {
        System.out.println("how any podcast you heared");
    }
}
class Ad extends MeadiaItem{
    @Override
    void Play() {
        System.out.println("Ad is playing!");
    }

    @Override
    void Calcul() {
        System.out.println("calculate the add price");
    }
}


public class Media {
    public static void main(String[] args) {
        MeadiaItem ob = new Song();
        MeadiaItem ob1 = new PoadCast();
        MeadiaItem ob2 = new Ad();

        ob.Play();
        ob1.Play();
        ob2.Play();
        ob.Calcul();
        ob1.Calcul();
        ob2.Calcul();
    }
}
