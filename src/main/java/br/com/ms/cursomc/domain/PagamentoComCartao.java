package br.com.ms.cursomc.domain;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;

@Data
@Entity
public class PagamentoComCartao extends Pagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer numeroDeParcelas;
}
