package br.com.alura.agenda;

import android.app.Application;

import br.com.alura.agenda.dao.AlunoDAO;
import br.com.alura.agenda.model.Aluno;

public class AgendaApplication extends Application {
    private final AlunoDAO dao = new AlunoDAO();

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        dao.salva(new Aluno("Allan", "8199484496", "allan@gmail.com"));
        dao.salva(new Aluno("Stephanie", "81986037660", "stephanie@gmail.com"));
    }
}
