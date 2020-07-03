package br.com.ms.cursomc.domain;

import br.com.ms.cursomc.domain.enums.EstadoPagamento;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class Pagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private EstadoPagamento estadoPagamento;
}
