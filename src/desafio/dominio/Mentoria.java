package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    public LocalDate getLocaldate() {
        return Localdate;
    }
    LocalDate Localdate;

    public void setLocaldate(LocalDate localdate) {
        Localdate = localdate;
    }

    @Override
    public double calcularXp() {
        return XP_Padrao + 20d;
    }
    public Mentoria() {
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescrica() + '\'' +
         ", Localdate=" + Localdate +
                '}';
    }
    //    private String Titulo;
//    private String Descricao;

//    public String getTitulo() {
//        return Titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        Titulo = titulo;
//    }
//
//    public String getDescricao() {
//        return Descricao;
//    }
//
//    public void setDescricao(String descricao) {
//        Descricao = descricao;
//    }


}
