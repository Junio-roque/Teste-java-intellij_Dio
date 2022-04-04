package br.com.jc;

import br.com.jc.model.Gato;

public class ProgramaTeste {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println("Gato");
        System.out.println("oi");

        Livro livro = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro);



       /* int a = 5;
        int b = 7;
        System.out.println("Hello world!" +(a+b));*/
    }

}

class Livro{
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}