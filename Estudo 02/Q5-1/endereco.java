
public class endereco
{
    private String logradouro;
    private String cidade;
    private String estado;
    
    public endereco(String logradouro, 
    String cidade, String estado){
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    //SET
    
    public void setlLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    //GET
    
    public String getLogradouro(){
        return logradouro;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public String getEstado(){
        return estado;
    }
    
    //Metodo
    public String consultaLogradouro(){
        return "";
    }
    
}
