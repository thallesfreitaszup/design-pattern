package design.pattern.factory.method;

import java.time.LocalDateTime;

public class EmpresaOnibusEstadual extends Empresa {
    @Override
    public Passagem emitePasssagemOnibusInterestadual(String origem, String destino, LocalDateTime horario) {
        return new PassagemOnibusEstadual(destino,origem,horario);
    }

}
