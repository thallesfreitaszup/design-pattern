package design.pattern.factory.method;

import java.time.LocalDateTime;

public class Passagem {
    private  String destino;

    private  String origem;
    private LocalDateTime horario;
    public Passagem() {
    }

    public Passagem(String destino, String origem, LocalDateTime horario) {
        this.destino = destino;
        this.origem = origem;
        this.horario = horario;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Passagem{" +
                "destino='" + destino + '\'' +
                ", origem='" + origem + '\'' +
                ", horario=" + horario +
                '}';
    }
}
