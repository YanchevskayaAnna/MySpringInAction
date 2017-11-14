package chapter2.performers;

import chapter2.exceptions.PerformanceException;
import chapter2.instruments.Instrument;

import java.util.Collection;

public class OneManBand implements Performer {
    public OneManBand() {
    }

    public void perform() throws PerformanceException {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }


//    private Properties instruments;
//    public void setInstruments(Properties instruments) {
//        this.instruments = instruments;
//    }

    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments; // Внедрение коллекции инструментов
    }
}

//public class OneManBand implements Performer {
//    public OneManBand() {
//    }
//
//    public void perform() throws PerformanceException {
//        for (String key : instruments.keySet()) {
//            System.out.print(key + " : ");
//            Instrument instrument = instruments.get(key);
//            instrument.play();
//        }
//    }
//
//    private Map<String, Instrument> instruments;
//
//    public void setInstruments(Map<String, Instrument> instruments) {
//        this.instruments = instruments;   // Внедрение инструментов в виде
//    }                                    // отображения (Map)
//}
