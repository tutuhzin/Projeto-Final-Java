public class Main {
    public static void main(String[] args) {

        Video v[] = new Video[10];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de PHP");
        v[2] = new Video("Aula 3 de HTML");
        v[3] = new Video("Aula 4 de CSS");
        v[4] = new Video("Aula 5 de JAVA");
        v[5] = new Video("Aula 6 de JAVASCRIPT");
        v[6] = new Video("Aula 7 de REACT");
        v[7] = new Video("Aula 8 de CALCULO");
        v[8] = new Video("Aula 9 de VIDEO");
        v[9] = new Video("Aula 10 de PROGRAMAÇÃO");

        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Arthur", 19, "M", "Juba");
        g[1] = new Gafanhoto("Maria", 20, "F", "Forte");
        g[2] = new Gafanhoto("Ricardo", 35, "M", "LEAO");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]); // Arthur assiste aula de POO
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[1], v[1]); // maria assiste aula de php
        vis[1].avaliar(35.0f);
        vis[2] = new Visualizacao(g[2], v[2]); // Ricardo vê Aula DE CSS
        vis[2].avaliar(85.5f);


        System.out.println("VÍDEO\n --------------------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        System.out.println("\nGAFANHOTOS\n----------------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println(g[2].toString());

        System.out.println("\n AVALIAÇÃO DO VÍDEO --------------------------------------");
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        System.out.println(vis[2].toString());

    }
}