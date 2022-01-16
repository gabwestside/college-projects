public class RafaelMartins_Subclasse1 extends RafaelMartins_Superclasse {

    public RafaelMartins_Subclasse1() {
    }

    public RafaelMartins_Subclasse1(String nome, String destino,
            String cpf, String partida, String sobrenome,
            int escolha) {

        super(nome, destino, cpf, partida,
                sobrenome, escolha);
    }

    @Override
    public void ClasseEconomica() {
        if (getEscolha() == 1) {
            System.out.println("Seu destino é" + getDestino() + "E sua compra foi da classe economica");
        }
    }

    @Override
    public void ClasseExecutiva() {
        if (getEscolha() == 2) {
            System.out.println("Seu destino é" + getDestino() + "E sua compra foi da classe executiva");
        }
    }
}