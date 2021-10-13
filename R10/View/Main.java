package R10.View;

import R10.Domain.Categoria;
import R10.Repository.CategoriaRepository;

public class Main {
    public static void main(String[] args) {

        CategoriaRepository repo = new CategoriaRepository();
        Categoria cat1 =  new Categoria(1);
        cat1.setNome("Smartphones");
        cat1.setDescricao("Telefones nutelinhas");

        Categoria cat2 =  new Categoria(2);
        cat2.setNome("SmartTvs");
        cat2.setDescricao("Televisores espertos");

        repo.create(cat1);
        repo.create(cat2);
        listar(repo);        

        cat1.setDescricao("Telefones espertoes");
        repo.update(cat1);
        listar(repo);   

        repo.delete(cat2);
        listar(repo);  

    }
    private static void listar(CategoriaRepository repo){
        for (Categoria c : repo.read()) {
            System.out.println(c);
        }
    }
}
