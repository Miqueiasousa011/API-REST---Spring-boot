package br.com.ms.cursomc.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Date instante;
}
