public class App {
    public static void main(String[] args) throws Exception {
        Passaros p1 = new BemTeVi(); //instanciamos um novo Bem Te Vi
        p1.comer();
        System.out.println(p1.tipoPassaro());

        //Criamos o segundo passaro. 
        Passaros joao_barro = new JoaoBarro(); // Instanciamos um novo Joao de Barro
        joao_barro.cantar();
        joao_barro.comer();
        System.out.println(joao_barro.tipoPassaro());
    }
}
