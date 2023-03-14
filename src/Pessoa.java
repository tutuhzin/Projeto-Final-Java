public abstract class Pessoa{
    protected String Nome;
    protected int Idade;
    protected String Sexo;
    protected float Experiencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.Nome = nome;
        this.Idade = idade;
        this.Sexo = sexo;
        this.Experiencia = 0;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public float getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(float experiencia) {
        Experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa: " +
                "Nome = '" + Nome + '\'' +
                ", Idade = " + Idade +
                ", Sexo = '" + Sexo + '\'' +
                ", Experiencia = " + Experiencia;
    }
}
