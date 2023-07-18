public class PassarosCerrado  implements Passaros {
    // Classe que implementa o metodo
    //Sobrescrive - Overrides
    public void cantar(){
        System.out.println("Canta muito muito muito alto !!");
    }
    //Sobrescrive - Overrides
    public void comer(){
        System.out.println("Come muito pouco");
    }
     //Sobrescrive - Overrides
    public String tipoPassaro(){
       return "PassaroCerrado";
    }
}
