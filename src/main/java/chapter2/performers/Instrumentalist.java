package chapter2.performers;

import chapter2.instruments.Instrument;
import chapter2.exceptions.PerformanceException;

public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    private String song;

    public void setSong(String song) {
        this.song = song;
        // Внедрение мелодии         Внедрение в свойства компонентов

    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
// Внедрение
// инструмента
    }
}
