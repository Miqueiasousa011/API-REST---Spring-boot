package br.com.ms.cursomc.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nome;
}
