package desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String Titulo;
    private String Descricao;
    LocalDate Localdate;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getLocaldate() {
        return Localdate;
    }

    public void setLocaldate(LocalDate localdate) {
        Localdate = localdate;
    }

    public Mentoria() {
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Titulo='" + Titulo + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", Localdate=" + Localdate +
                '}';
    }
}
