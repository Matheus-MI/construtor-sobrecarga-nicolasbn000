public class Main {
    public static void main(String[] args) {
       
        Motor motor1 = new Motor("gasolina", 150);
        Motor motor2 = new Motor("elétrico", 250);

        
        Condutor condutor1 = new Condutor("jessica yumi", "123456789");
        Condutor condutor2 = new Condutor("gracie abrams", "987654321");
        Condutor condutor3 = new Condutor("oli", "123543210");

        
        Carro carro1 = new Carro("fiat", "uno", "ABC-1234", motor1, condutor1);
        Carro carro2 = new Carro("gol", "nsei", "XYZ-9876", motor2);
        Carro carro3 = new Carro("fusca", "azul", "LMN-4321", motor2, condutor3);

        
        System.out.println("Carro 1:");
        carro1.exibirDados();
        System.out.println("\nCarro 2:");
        carro2.exibirDados();
        System.out.println("\nCarro 3:");
        carro3.exibirDados();

      
        System.out.println("\nTroca de motor e condutor para o Carro 1:");
        carro1.setMotor(motor2);
        carro1.setCondutor(condutor2);
        carro1.exibirDados();
    }
}