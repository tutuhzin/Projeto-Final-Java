public class Video implements AcoesVideo{
    private String Titulo;
    private int avaliacao;
    private float views, curtidas;
    private boolean reproduzindo;

    // construtor
    public Video(String titulo) {
        Titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {

        this.curtidas ++;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/ this.views);
        this.avaliacao = nova;
    }

    public float getViews() {
        return views;
    }

    public void setViews(float views) {
        this.views = views;
    }

    public float getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(float curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video: " +
                "Titulo = '" + Titulo + '\'' +
                ", avaliação = " + avaliacao +
                ", views = " + views +
                ", curtidas = " + curtidas +
                ", reproduzindo = " + reproduzindo;
    }
}
