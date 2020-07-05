package br.com.ms.cursomc.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class PagamentoComBoleto extends Pagamento implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataVencimento;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataPagamento;
}
