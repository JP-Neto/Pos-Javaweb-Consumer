package pos.web.matricula;

import pos.web.domain.entity.Aluno;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class AlunoConsumer implements Serializable {

    @JmsListener(destination = "Fila_aluno_queue")
    public void receiveMessage(Aluno aluno) {
        System.out.println("Mensagem da fila:" + aluno.getMatricula());
    }
}
