package br.com.ms.cursomc.domain.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum TipoCliente {
    PESSOAFISICA(1, "Pessoa Fisica"),
    PESSOAJURIDICA(2, "Pessoa Juridica");

    private Integer codigo;
    private String descricao;

    public static TipoCliente toEnum(Integer codigo) {
        if (codigo == null)
            return null;

        for (var tipoCliente : TipoCliente.values()) {
            if (codigo.equals(tipoCliente.getCodigo()))
                return tipoCliente;
        }
        throw new IllegalArgumentException("Código de cliente inválido " + codigo);
    }

}
