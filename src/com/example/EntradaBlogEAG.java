package com.example;

/**
 * Clase para manejar las entradas de un blog.
 *
 * @version 1.0
 * @since 20/2/2023
 * @author Elisabet Agulló
 */
public class EntradaBlogEAG {

    /**
     * Carácter que separa "ENTRADA DE" del nombre del autor.
     */
    public static char separador = ':';

    private int id;
    private String texto;
    private String autor;

    /**
     * Crea una nueva entrada del blog.
     *
     * @param id el número de entrada
     * @param autor el nombre del autor de la entrada
     * @param texto el contenido de la entrada
     * @throws IllegalArgumentException si el número de entrada es negativo
     */
    public EntradaBlogEAG(int id, String autor, String texto) throws IllegalArgumentException {
        if (id <= 0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id = id;
        this.autor = autor;
        this.texto = texto;
    }

    /**
     * Devuelve una representación en formato de cadena de la entrada del blog.
     *
     * @return una cadena que representa la entrada del blog
     */
    @Override
    public String toString() {
        String cad = "";
        cad += "\nENTRADA DE" + separador + autor;
        cad += "\n " + texto;
        return cad;
    }

    /**
     * Devuelve el número de la entrada.
     *
     * @return el número de la entrada
     */
    public int getId() {
        return this.id;
    }

    /**
     * Devuelve el contenido completo de la entrada.
     *
     * @return el contenido de la entrada
     */
    public String getTexto() {
        return this.texto;
    }

    /**
     * Devuelve el nombre del autor de la entrada en mayúsculas.
     *
     * @return el nombre del autor en mayúsculas
     */
    public String getAutor() {
        return this.autor.toUpperCase();
    }

    /**
     * Devuelve el nombre del autor de la entrada.
     *
     * @return el nombre del autor
     * @deprecated utilizar {@link #getAutor()} en su lugar
     */
    @Deprecated
    public String devuelveAutor() {
        return this.autor;
    }

    /**
     * Método principal de la clase.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        EntradaBlogEAG e1 = new EntradaBlogEAG(-3, "ana", "Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}
