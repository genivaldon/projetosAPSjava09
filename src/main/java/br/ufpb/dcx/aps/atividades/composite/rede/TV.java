package br.ufpb.dcx.aps.atividades.composite.rede;

public class TV implements ElementoRede{

    private String nome;
    private String IP;

    public TV(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public String getIP(){
        return this.IP;
    }
    @Override
    public void setIp(String IP) {
        this.IP = IP;
         //TODO Auto-generated method stub
        
    }
    
}
