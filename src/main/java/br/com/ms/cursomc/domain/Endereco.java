package br.com.ms.cursomc.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
}
