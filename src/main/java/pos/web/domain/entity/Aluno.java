package pos.web.domain.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Aluno implements Serializable {
    @EqualsAndHashCode.Include
    private Long id;

    private String nome;

    private String matricula;

    private String curso;
}