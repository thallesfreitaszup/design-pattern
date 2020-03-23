package design.pattern.factory.method;

import java.time.LocalDateTime;

public class PassagemOnibusEstadual extends Passagem {
    public PassagemOnibusEstadual(String destino, String origem, LocalDateTime horario) {
        super(destino, origem, horario);
    }

    @Override
    public String toString() {
        return "PassagemOnibusEstadual =  " + super.toString();
    }
}
