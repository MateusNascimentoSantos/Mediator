package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveElogiarBiblioteca() {
        Professor professor = new Professor();
        professor.setNome("Maria");
        professor.setSiape(345678);

        assertEquals("A Ouvidoria agradece seu contato.\nA Biblioteca respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Biblioteca agradece a mensagem: Acervo muito bom",
                professor.elogiarBiblioteca("Acervo muito bom"));
    }

    @Test
    void deveReclamarBiblioteca() {
        Professor professor = new Professor();
        professor.setNome("Maria");
        professor.setSiape(345678);

        assertEquals("A Ouvidoria agradece seu contato.\nA Biblioteca respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Biblioteca vai procurar melhorar o serviço da reclamação: Falta de exemplares",
                professor.reclamarBiblioteca("Falta de exemplares"));
    }

    @Test
    void deveSugerirBiblioteca() {
        Professor professor = new Professor();
        professor.setNome("Maria");
        professor.setSiape(345678);

        assertEquals("A Ouvidoria agradece seu contato.\nA Biblioteca respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Biblioteca vai analisar a sugestão: Ampliar horário aos sábados",
                professor.sugerirBiblioteca("Ampliar horário aos sábados"));
    }

    @Test
    void deveElogiarSecretaria() {
        Professor professor = new Professor();
        professor.setNome("Maria");
        professor.setSiape(345678);

        assertEquals("A Ouvidoria agradece seu contato.\nA Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Secretaria agradece a mensagem: Ótimo atendimento",
                professor.elogiarSecretaria("Ótimo atendimento"));
    }

    @Test
    void deveAlunoReclamarBiblioteca() {
        Aluno aluno = new Aluno();
        aluno.setNome("Ana");
        aluno.setMatricula(2021001);

        assertEquals("A Ouvidoria agradece seu contato.\nA Biblioteca respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Biblioteca vai procurar melhorar o serviço da reclamação: Silêncio na sala de estudos",
                aluno.reclamarBiblioteca("Silêncio na sala de estudos"));
    }

    @Test
    void deveIdentificarAlunoPelaMatricula() {
        Aluno aluno = new Aluno();
        aluno.setNome("Ana");
        aluno.setMatricula(2021001);

        assertEquals("Matricula 2021001", aluno.getIdentificacao());
    }

    @Test
    void deveIdentificarProfessorPeloSiape() {
        Professor professor = new Professor();
        professor.setNome("Maria");
        professor.setSiape(345678);

        assertEquals("SIAPE 345678", professor.getIdentificacao());
    }

    @Test
    void deveRegistrarManifestacaoDoAlunoNaOuvidoria() {
        Aluno aluno = new Aluno();
        aluno.setNome("Ana");
        aluno.setMatricula(2021001);
        aluno.reclamarBiblioteca("Falta de exemplares");

        assertEquals("Ana (Matricula 2021001) registrou Reclamacao na Biblioteca",
                Ouvidoria.getInstancia().getUltimaManifestacao());
    }

    @Test
    void deveRegistrarManifestacaoDoProfessorNaOuvidoria() {
        Professor professor = new Professor();
        professor.setNome("Maria");
        professor.setSiape(345678);
        professor.elogiarSecretaria("Ótimo atendimento");

        assertEquals("Maria (SIAPE 345678) registrou Elogio na Secretaria",
                Ouvidoria.getInstancia().getUltimaManifestacao());
    }

    @Test
    void deveRetornarSempreAMesmaOuvidoria() {
        assertSame(Ouvidoria.getInstancia(), Ouvidoria.getInstancia());
    }

    @Test
    void deveRetornarSempreAMesmaBiblioteca() {
        assertSame(Biblioteca.getInstancia(), Biblioteca.getInstancia());
    }

}
