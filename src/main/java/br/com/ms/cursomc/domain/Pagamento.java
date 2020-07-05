package br.com.ms.cursomc.domain;

import br.com.ms.cursomc.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Integer id;
    private Integer estadoPagamento;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = ("pedido_id"))
    @MapsId
    private Pedido pedido;

    public EstadoPagamento getEstadoPagamento() {
        return EstadoPagamento.toEnum(estadoPagamento);
    }

    public void setEstadoPagamento(EstadoPagamento estadoPagamento) {
        this.estadoPagamento = estadoPagamento.getCodigo();
    }
}
