package pos.web.matricula;

import pos.web.domain.entity.Disciplina;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class DisciplinaConsumer implements Serializable {

    @JmsListener(destination = "disciplina_queue")
    public void receiveMessage(Disciplina disciplina) {
        System.out.println("Mensagem da fila:" + disciplina.getNome());
    }

}
