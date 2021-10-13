package R10.Domain;

public class Categoria {
    private int id;
    private String nome;
    private String descricao;

    public Categoria(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {        
        return this.getId() + "," + this.getNome() + "," + this.getDescricao();
    }

    @Override
    public boolean equals(Object obj) {
        Categoria cateComparada = (Categoria)obj;

        if(this.id == cateComparada.getId()){
            return true;
        }
        else{
            return false;
        }
    }

}
