package R10.Repository;

import java.util.ArrayList;

import R10.Domain.Categoria;

public class CategoriaRepository {
    private ArrayList<Categoria> categorias;

    public CategoriaRepository(){
        this.categorias = new ArrayList<Categoria>();
    }

    //CRUD
    // create - salvar
    public void create(Categoria categoria){
        this.categorias.add(categoria);
    }

    // read - ler
    public ArrayList<Categoria> read(){
        return this.categorias;
    }
    // update - alterar
    public void update(Categoria categoria){
        int tamanho = this.categorias.size();

        for (int i=0; i < tamanho; i++) {
            Categoria c = this.categorias.get(i);
            if(c.getId() == categoria.getId()){
                this.delete(c);
                this.create(categoria);
            }
        }
    }
     // update - alterar
    public void update2(Categoria categoria){
        
        if(this.categorias.contains(categoria))
        {
            this.delete(categoria);
            this.create(categoria);
        }
    }

    // delete - excluir
    public void delete(Categoria categoria){
        this.categorias.remove(categoria);
    }
}
