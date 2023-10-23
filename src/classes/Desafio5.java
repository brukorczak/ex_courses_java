package classes;

public class Desafio5 {
    private String marca;
    private String modelo;
    private int ano;
    private int valor;



    Desafio5(String marca, String modelo, int ano, int valor){
       this.marca = marca;
       this.modelo= modelo;
       this.ano = ano;
       this.valor= valor;
    }

    public double valorVenda(){
        double valorFinal = (valor * 0.1) + valor;
        return valorFinal;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public static void main(String[] args) {
        Desafio5 desafio5 = new Desafio5("BWM", "X6", 2024, 155_05);

        desafio5.setModelo("X5");

        System.out.println(desafio5.getMarca());
        System.out.println(desafio5.getModelo());
        System.out.println(desafio5.getAno());
        System.out.println("O valor da venda é: " + desafio5.valorVenda());
    }
}
