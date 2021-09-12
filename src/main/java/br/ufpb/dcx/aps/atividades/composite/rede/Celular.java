package br.ufpb.dcx.aps.atividades.composite.rede;

public class Celular implements ElementoRede{

    private String nome;
    private String IP;

    public Celular(String nome, String IP){
        this.nome  = nome;
        this.IP = IP;
    }
    public Celular(String nome){
        this.nome  = nome;
        
    }
    public String getNome(){
        return this.nome;
    }
    public String getIP(){
        return this.IP;
    }
    public void setIp(String IP){
        this.IP = IP;
    
    }

}
