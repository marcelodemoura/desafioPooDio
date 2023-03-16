package desafio.dominio;

public class Curso extends Conteudo{

//    private String Titulo;
//    private String Descricao;
    int CargaHoraria;

    public Curso() {
    }

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

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo='" + getTitulo()  + '\'' +
                ", Descricao='" + getDescrica() + '\'' +
                ", CargaHoraria=" + CargaHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_Padrao * CargaHoraria;
    }
}
