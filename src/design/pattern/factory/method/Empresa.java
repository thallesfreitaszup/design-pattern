package design.pattern.factory.method;

import java.time.LocalDateTime;

public abstract class Empresa {
    public abstract Passagem emitePasssagemOnibusInterestadual(String origem, String destino, LocalDateTime horario);

}
