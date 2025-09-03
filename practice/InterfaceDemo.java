package practice;

/*  Interface Implementation

Q7. Create an interface Playable with method play().

Classes Guitar, Piano, and Drum implement Playable and define play() differently.

Use interface reference to point to each object and call play(). */

interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing soothing guitar chords");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing melodious piano notes ");
    }
}

class Drum implements Playable {
    public void play() {
        System.out.println("Playing energetic drum beats");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Playable p1 = new Guitar();
        p1.play();

        Playable p2 = new Piano();
        p2.play();

        Playable p3 = new Drum();
        p3.play();
    }
}
