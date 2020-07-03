package br.com.ms.cursomc.domain;

import java.io.Serializable;

public class PagamentoComCartao extends Pagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer numeroDeParcelas;
}
