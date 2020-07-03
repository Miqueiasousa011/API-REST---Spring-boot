package br.com.ms.cursomc.domain;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class PagamentoComBoleto extends Pagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    private Date dataVencimento;
    private Date dataPagamento;
}
