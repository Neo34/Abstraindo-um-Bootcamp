package desafio.dominio;


/**
 * Representa um curso com título, descrição e carga horária.
 */
public class Curso extends Conteudo {

    private int cargaHoraria;

    /**
     * Calcula o XP com base na carga horária.
     *
     * @return o XP calculado.
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao); // Chama o construtor da classe base Conteudo.
        this.cargaHoraria = cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria <= 0) {
            throw new IllegalArgumentException("A carga Horária deve ser maior que zero.");
        }
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return String.format("Curso{titulo='%s', descricao='%s', cargaHoraria=%d}",
                getTitulo(), getDescricao(), cargaHoraria);
    }

}