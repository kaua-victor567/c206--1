public class Computador {
    MemoriaUsb memoriaUsb = new MemoriaUsb();
    SistemaOperacional sistemaOperacional = new SistemaOperacional();
    HardwareBasico hardwareBasico = new HardwareBasico();
    String[] marca = {"Positivo","Acer","Vaio"};
    float[] preco = {3300f,8800f,4800f};
    void mostraPCConfigs(int i){
        System.out.println("Marca: "+marca[i]);
        System.out.println("Preço: "+preco[i]);
        System.out.println("Processador: "+hardwareBasico.nomeProcessador[i]+"  "+ hardwareBasico.velocidadeProcessador[i]);
        System.out.println("Memoria ram: "+hardwareBasico.QuantidadeMemoria[i]+"  "+hardwareBasico.memoriaRam);
        System.out.println("Armazenamento: "+hardwareBasico.capacidade[i] + "  Gb de HD");
        System.out.println("Sistema operacional: "+sistemaOperacional.nome[i] +"  "+ sistemaOperacional.tipo[i] + " Bits");
        System.out.println("MemoriaUsb: "+memoriaUsb.nome[i] +"  "+ memoriaUsb.capacidade[i]+ " Gb");

    }
    float addMemoriaUSB(){
//nao compreendi qual seria o uso :(
        return 0;
    }
}
