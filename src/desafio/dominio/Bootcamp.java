package desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String Descricao;
    private LocalDate DataInicial = LocalDate.now();
    private final LocalDate DtatFInal = DataInicial.plusDays(45);
    private Set<Dev> devsInscrito = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return DataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        DataInicial = dataInicial;
    }

    public LocalDate getDtatFInal() {
        return DtatFInal;
    }

    public Set<Dev> getDevsInscrito() {
        return devsInscrito;
    }

    public void setDevsInscrito(Set<Dev> devsInscrito) {
        this.devsInscrito = devsInscrito;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getDataInicial(), bootcamp.getDataInicial()) && Objects.equals(getDtatFInal(), bootcamp.getDtatFInal()) && Objects.equals(getDevsInscrito(), bootcamp.getDevsInscrito()) && Objects.equals(getConteudos(), bootcamp.getConteudos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDataInicial(), getDtatFInal(), getDevsInscrito(), getConteudos());
    }
}
