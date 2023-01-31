package pos.web.domain.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Curso {


    private Long id;

    private String nome;

    private String duracao;

    private Long quantidadePeriodo;

}
