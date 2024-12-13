package desafio.dominio;

import java.time.LocalDate;

/**
 * A classe Mentoria representa uma atividade de mentoria que herda os atributos e comportamentos
 * da classe abstrata Conteudo. Inclui uma data para agendamento da mentoria e o cálculo de XP
 * específico para este tipo de conteúdo.
 */

public class Mentoria extends Conteudo {
    /**
     * A data em que a mentoria será realizada.
     */
    private LocalDate data;

    public Mentoria() {

    }

    /**
     * Sobrescreve o método calcularXp da classe Conteudo.
     * Adiciona um valor fixo ao XP padrão definido na classe pai.
     *
     * @return o valor de XP calculado para uma mentoria.
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
    }

    /**
     * Obtém a data da mentoria.
     *
     * @return a data da mentoria.
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data da mentoria.
     * Valida se a data fornecida não está no passado. Caso esteja, lança uma exceção.
     *
     * @param data a data da mentoria.
     * @throws IllegalArgumentException se a data estiver no passado.
     */
    public void setData(LocalDate data) {
        if (data.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("A data da mentoria não pode ser no passado");
        }
        this.data = data;
    }

    /**
     * Sobrescreve o método toString para fornecer uma representação textual
     * personalizada de uma mentoria, incluindo título, descrição e data.
     *
     * @return uma string representando o objeto Mentoria.
     */
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}