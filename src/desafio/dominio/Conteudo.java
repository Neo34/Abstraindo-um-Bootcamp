package desafio.dominio;

/**
 * Classe abstrata que representa um conteúdo genérico.
 * É a base para diferentes tipos de conteúdos, como cursos e mentorias.
 */
public abstract class Conteudo {
    /**
     * Valor padrão de XP para todos os conteúdos.
     */
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Conteudo() {

    }

    /**
     * Método abstrato que será implementado pelas subclasses para calcular o XP específico.
     *
     * @return o valor do XP calculado
     */
    public abstract double calcularXp();

    /**
     * Obtém o título do conteúdo.
     *
     * @return o título do conteúdo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do conteúdo.
     *
     * @param titulo o título a ser definido
     */
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("O título não pode ser vazio ou nulo");
        }
        this.titulo = titulo;
    }

    /**
     * Obtém a descrição do conteúdo.
     *
     * @return a descrição do conteúdo
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do conteúdo.
     *
     * @param descricao a descrição a ser definida
     */
    public void setDescricao(String descricao) {
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("A descrição não pode ser vazia ou nula");
        }
        this.descricao = descricao;
    }

}
