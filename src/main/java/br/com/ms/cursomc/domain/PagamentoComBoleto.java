package br.com.ms.cursomc.domain;

import java.io.Serializable;
import java.util.Date;

public class PagamentoComBoleto extends Pagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    private Date dataVencimento;
    private Date dataPagamento;
}
