import java.util.Random;
import java.util.Scanner;

public class TestesEstudantes {
    float[] ides = new float[5];
    boolean candidato = true;
    Scanner dados;

    void concorrentes() {
        if (candidato) {
            Random dados = new Random();
            EstudanteGraduacao estudante1 = new EstudanteGraduacao();

            estudante1.ide = dados.nextInt(3);
            estudante1.ide += 7;
            estudante1.ide += dados.nextFloat();
            ides[0] = estudante1.ide;

            EstudanteGraduacao estudante2 = new EstudanteGraduacao();

            estudante2.ide = dados.nextInt(3);
            estudante2.ide += 7;
            estudante2.ide += dados.nextFloat();
            ides[0] = estudante2.ide;

            EstudanteGraduacao estudante3 = new EstudanteGraduacao();

            estudante3.ide = dados.nextInt(3);
            estudante3.ide += 7;
            estudante3.ide += dados.nextFloat();
            ides[1] = estudante3.ide;

            EstudanteGraduacao estudante4 = new EstudanteGraduacao();

            estudante4.ide = dados.nextInt(3);
            estudante4.ide += 6.5;
            estudante4.ide += dados.nextFloat();
            ides[2] = estudante4.ide;

            EstudanteGraduacao estudante5 = new EstudanteGraduacao();

            estudante5.ide = dados.nextInt(3);
            estudante5.ide += 6;
            estudante5.ide += dados.nextFloat();
            ides[3] = estudante5.ide;
        }
    }

    public void selecaoIDE(EstudanteGraduacao estudante) {
        if (estudante.status == true) {
            for (int i = 0; i < 5; i++) {
                if (estudante.ide < ides[i]) {
                    System.out.println("Nao foi selecionado(a)");
                    break;
                } else {
                    System.out.println("Você foi selecionado(a)");
                    break;
                }
            }
        } else {
            System.out
                    .println("Você não foi selecionado, por não está matriculado em todas as disciplinas do semestre.");
            candidato = false;
        }
    }

    public void AuxilioAlimentacao(EstudanteGraduacao estudante) {
        if (estudante.renda_familiar < 1192.40) {
            System.out.println("Você faz está matriculado em quantas disciplinas?");
            dados = new Scanner(System.in);
            estudante.qtd_disciplinas = dados.nextInt();
            if (estudante.qtd_disciplinas >= 4) {
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

    public void AuxilioTransporte(EstudanteGraduacao estudante) {
        if (estudante.endereco != "Redenção" && estudante.endereco != "Acarape") {
            if (estudante.renda_familiar < 1497.00) {
                System.out.println("Quantas disciplinas está cursando?");
                dados = new Scanner(System.in);
                estudante.qtd_disciplinas = dados.nextInt();
                if (estudante.qtd_disciplinas >= 4) {
                    System.out.println("Parabéns, você foi selecionado para o Auxilio Transporte");
                }
            }
        } else if (estudante.endereco == "Redenção" || estudante.endereco == "Acarape") {
            System.out.println(
                    "Só poderá participar o Auxilio Transporte, alunos que residem fora do campus da UNILAB (Acarape e Redenção)");
        }
    }
}