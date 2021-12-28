import java.util.Scanner;
// import java.util.Random;

public class AlunoGrad extends Aluno {
    private float[] ides = new float[5];
    int qtdDisciplinas;
    boolean candidato = true;
    Scanner dados, cidade;

    public AlunoGrad(String nome, int matricula, String cpf, String municipio, float rendaFamiliar, String curso,
            float ide, float cargaHoraria,
            boolean status, int escolha) {

        super(nome, curso, cpf, municipio,
                matricula, escolha, ide,
                rendaFamiliar, cargaHoraria, status);
    }

    public AlunoGrad(String nome, String curso, String cpf, String municipio,
            int matricula, int qtdDisciplinas, int escolha,
            float ide, float rendaFamiliar, float cargaHoraria,
            boolean status,
            float[] ides, boolean candidato, Scanner dados, Scanner cidade) {

        super(nome, curso, cpf, municipio,
                matricula, escolha, ide,
                rendaFamiliar, cargaHoraria, status);

        this.ides = ides;
        this.qtdDisciplinas = qtdDisciplinas;
        this.candidato = candidato;
        this.dados = dados;
        this.cidade = cidade;
    }

    public int getQtdDisciplinas() {
        return this.qtdDisciplinas;
    }

    public void setQtdDisciplinas(int qtdDisciplinas) {
        this.qtdDisciplinas = qtdDisciplinas;
    }

    // public void concorrentes() {
    // if (candidato) {
    // Random dados = new Random();
    // EstudanteGraduacao estudante1 = new EstudanteGraduacao();

    // estudante1.ide = dados.next3);
    // estudante1.ide += 7;
    // estudante1.ide += dados.nextFloat();
    // ides[0] = estudante1.ide;

    // EstudanteGraduacao estudante2 = new EstudanteGraduacao();

    // estudante2.ide = dados.nextInt(3);
    // estudante2.ide += 7;
    // estudante2.ide += dados.nextFloat();
    // ides[1] = estudante2.ide;

    // EstudanteGraduacao estudante3 = new EstudanteGraduacao();

    // estudante3.ide = dados.nextInt(3);
    // estudante3.ide += 7;
    // estudante3.ide += dados.nextFloat();
    // ides[2] = estudante3.ide;

    // EstudanteGraduacao estudante4 = new EstudanteGraduacao();

    // estudante4.ide = dados.nextInt(3);
    // estudante4.ide += 6.5;
    // estudante4.ide += dados.nextFloat();
    // ides[3] = estudante4.ide;

    // EstudanteGraduacao estudante5 = new EstudanteGraduacao();

    // estudante5.ide = dados.nextInt(3);
    // estudante5.ide += 6;
    // estudante5.ide += dados.nextFloat();
    // ides[4] = estudante5.ide;
    // }
    // }

    @Override
    public void SelecaoIDE() {
        if (getStatus() == true) {
            for (int i = 0; i < 5; i++) {
                if (getIde() < ides[i]) {
                    System.out.println("Nao foi selecionado(a)");
                    break;
                } else {
                    System.out.println("Você foi selecionado(a)");
                    break;
                }
            }
        } else {
            System.out
                    .println(
                            "Você não foi selecionado, por não está matriculado em todas as disciplinas do semestre.");
        }
    }

    @Override
    public void AuxilioAlimentacao() {
        if (getRendaFamiliar() < 1192.40) {
            System.out.println("Você faz está matriculado em quantas disciplinas?");
            dados = new Scanner(System.in);
            setQtdDisciplinas(dados.nextInt());
            if (getQtdDisciplinas() >= 4) {
                System.out.println(
                        "Você foi selecionado para receber o Auxilio Alimentação, e seu nome irá ser mostrado na catraca!");
            } else {
                System.out.println(
                        "Para dar continuidade ao recebimento do Auxilio Alimentação, é necessário que o discente esteja matriculado no minimo em 4 cadeiras no semestre atual!");
            }
        } else {
            System.out.println("Sua renda é maior que a desejada para o recebimento do Auxilio Alimentação");
        }
    }

    @Override
    public void AuxilioTransporte() {
        System.out.println("Você é de Redenção/Acarape?");
        cidade = new Scanner(System.in);
        setMunicipio(cidade.next());

        if (getMunicipio().equalsIgnoreCase("não")) {
            System.out.println("Você não faz parte de");
            if (getRendaFamiliar() <= 1497.00) {
                System.out.println("Quantas disciplinas está cursando?");
                dados = new Scanner(System.in);
                setQtdDisciplinas(dados.nextInt());
                if (getRendaFamiliar() >= 4) {
                    System.out.println("Parabéns, você foi selecionado para o Auxilio Transporte!");
                } else {
                    System.out.println("Você precisa está matriculado em pelo menos 4 cadeiras!");
                }
            } else {
                System.out.println("Sua renda é maior que 1,5(um salario e meio)");
            }
        } else {
            System.out.println(
                    "Só poderá participar o Auxilio Transporte, alunos que residem fora do campus da UNILAB (Acarape e Redenção)");
        }
    }
}