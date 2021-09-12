package br.ufpb.dcx.aps.atividades.composite.rede;

public class Notebook implements ElementoRede {

    private String nome;
    private String IP;

    public Notebook(String nome){
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
        
    }
    
    
}
