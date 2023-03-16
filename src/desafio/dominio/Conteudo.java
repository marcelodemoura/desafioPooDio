package desafio.dominio;

public abstract class Conteudo {
    protected static final double XP_Padrao = 10d;

    private String Titulo;
    private String Descrica;

    public abstract double calcularXp();

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescrica() {
        return Descrica;
    }

    public void setDescricao(String descrica) {
        Descrica = descrica;
    }


}
