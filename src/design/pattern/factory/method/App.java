
package design.pattern.factory.method;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        EmpresaOnibusEstadual empresaOnibusEstadual = new EmpresaOnibusEstadual();
        Passagem passagem = empresaOnibusEstadual.emitePasssagemOnibusInterestadual("Campinas","São Paulo", LocalDateTime.now());
        System.out.println(passagem);
    }
}
