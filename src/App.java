public class App {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();


        reprodutor.tocar("Música 1");
        telefone.ligar();
        navegador.exibirPagina("https://github.com/AzevedoRenan13/Java-Iphone-project");
    }
}
