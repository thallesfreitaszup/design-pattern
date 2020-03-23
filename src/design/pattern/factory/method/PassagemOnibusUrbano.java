package design.pattern.factory.method;

import java.time.LocalDateTime;

public class PassagemOnibusUrbano extends Passagem {
    public PassagemOnibusUrbano(String destino, String origem, LocalDateTime horario) {
        super(destino, origem, horario);
    }

    @Override
    public String toString() {
        return "PassagemOnibusUrbano{} " + super.toString();
    }
}
