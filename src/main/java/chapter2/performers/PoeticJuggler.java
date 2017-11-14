package chapter2.performers;

import chapter2.exceptions.PerformanceException;
import chapter2.poems.Poem;

public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem) { // Внедрение поэмы
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        // Внедрение количества
        // мячиков и поэмы
        this.poem = poem;
    }

    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
