package br.com.ms.cursomc.domain;

import br.com.ms.cursomc.domain.enums.TipoCliente;
import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nome;
    private String email;
    private String cpfOuCnpj;
    private TipoCliente tipoCliente;
    private Set<String> telefone = new HashSet<>();
}
