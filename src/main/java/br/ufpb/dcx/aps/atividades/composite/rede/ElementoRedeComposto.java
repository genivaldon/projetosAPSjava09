package br.ufpb.dcx.aps.atividades.composite.rede;

import java.util.LinkedList;
import java.util.List;

public class ElementoRedeComposto implements ElementoRede{

    private String ip;
    private String nome;
    private List<ElementoRede> componentes = new LinkedList<ElementoRede>();
    
    public ElementoRedeComposto(String nome){
        this.nome = nome;

    }
  

public void addElementoRede(ElementoRede componente){

    componentes.add(componente);
}
public List<ElementoRede> getElementos(){
    return componentes;
}
public String getNome(){
    return this.nome;
}
public String getIP(){
    return this.ip;
}
public void setIp(String ip){
    this.ip = ip;
}
}
