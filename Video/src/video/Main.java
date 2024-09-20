package video;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Video {
    private String titulo;
    private String autor;
    private String url;
    private boolean activo;

    
    public Video(String titulo, String autor, String url, boolean activo) {
        this.titulo = titulo;
        this.autor = autor;
        this.url = url;
        this.activo = activo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getUrl() {
        return url;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", URL: " + url + ", Activo: " + (activo ? "Sí" : "No");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Video> listaVideos = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese el titulo del video:");
            String titulo = scanner.nextLine();
            System.out.println("Ingrese el autor del video:");
            String autor = scanner.nextLine();
            System.out.println("Ingrese la URL del video:");
            String url = scanner.nextLine();
            System.out.println("¿El video esta activo?:");
            boolean activo = Boolean.parseBoolean(scanner.nextLine());

            Video video = new Video(titulo, autor, url, activo);
            listaVideos.add(video);

            System.out.println("Desea agregar otro video (si/no):");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }

        System.out.println("\nLista de videos:");
        for (Video video : listaVideos) {
            System.out.println(video);
        }

        scanner.close();
    }
}
