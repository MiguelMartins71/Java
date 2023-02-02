package Teste;

public class Tenis
{
    String cor;
    int tamanho;
    String nome;
    String marca;
    String tipo;
    int velocidade=0;

    public Tenis(String cor, String tipo, int velocidade)
    {
        this.cor = cor;
        this.tipo = tipo;
        this.velocidade = velocidade;

        //aumentaVelocidade();

    }

    public String getCor()
    {
        return this.cor;
    }

    public int getVelocidade()
    {
        return this.velocidade;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public void aumentaVelocidade(){

        if (this.tipo.equalsIgnoreCase("Corrida"))
        {
            this.velocidade = this.velocidade + 50;
        }
        
    }


    
}