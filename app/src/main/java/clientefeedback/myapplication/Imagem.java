package clientefeedback.myapplication;

/**
 * Created by Alexandre on 10/03/2016.
 */
public class Imagem {

    private int imagemid;
    private int tipoImagem;
    private String caminho;
    private String nomeImagem;
    private String descricao;
    private int itemid;
    private int pessoaid;

    public int getImagemid() {
        return imagemid;
    }

    public void setImagemid(int imagemid) {
        this.imagemid = imagemid;
    }

    public int getTipoImagem() {
        return tipoImagem;
    }

    public void setTipoImagem(int tipoImagem) {
        this.tipoImagem = tipoImagem;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getNome() {
        return nomeImagem;
    }

    public void setNome(String nome) {
        this.nomeImagem = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public int getPessoaid() {
        return pessoaid;
    }

    public void setPessoaid(int pessoaid) {
        this.pessoaid = pessoaid;
    }

}
