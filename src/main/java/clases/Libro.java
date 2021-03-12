package clases;

import java.util.Comparator;

public class Libro implements Comparable<Libro>, Comparator<Libro> {

	/**
	 * variables de la clase libro
	 */
	private String titulo;
	private String isbn;
	private Genero genero;
	private String autor;
	private Integer paginas;

	/**
	 * constructor de la clase libro
	 * @param titulo
	 * @param isbn
	 * @param genero
	 * @param autor
	 * @param paginas
	 */
	public Libro(String titulo, String isbn, Genero genero, String autor, Integer paginas) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.genero = genero;
		this.autor = autor;
		this.paginas = paginas;
	}

	public Libro() {

	}
	
	/**
	 * Devuelve titulo de la clase
	 * @return titulo
	 */

	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Crea titulo
	 * @param titulo
	 */

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * Devuelve isbn de la clase
	 * @return isbn
	 */

	public String getIsbn() {
		return isbn;
	}
	
	/**
	 * Crea isbn
	 * @param isbn
	 */

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * Devuelve genero de la clase
	 * @return genero
	 */

	public Genero getGenero() {
		return genero;
	}
	
	/**
	 * Crea generp
	 * @param genero
	 */

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	/**
	 * Devuelve autor de la clase
	 * @return autor
	 */

	public String getAutor() {
		return autor;
	}
	
	/**
	 * Crea autor
	 * @param autor
	 */

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * Devuelve paginas de la clase
	 * @return paginas
	 */

	public Integer getPaginas() {
		return paginas;
	}
	
	/**
	 * Crea paginas
	 * @param paginas
	 */

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	
	

	@Override
	public String toString() {
		return "Titulo: " + titulo + "\nISBN: " + isbn + "\nGenero: " + genero + "\nAutor: " + autor + "\nPaginas: "
				+ paginas + "\n";

		/**
		 * Uno nuevo de toString para la carga de archivos
		 */
	}

	public String toStringFile() {
		return titulo + "," + isbn + "," + genero + "," + autor + "," + paginas + "\n";
	}

	/**
	 * Uso del metodo equals par la busqueda del libro por ISBN
	 */
	public boolean equals(Object o) {

		Libro l = (Libro) o;
		boolean b = false;
		if (this == o) {

			b = true;

		} else {

			if (this.isbn.equalsIgnoreCase(l.isbn)) {
				b = true;
			}

		}

		return b;

	}

	/**
	 * Uso de compartTo para el ordenamiento de libros por titulo
	 */
	@Override
	public int compareTo(Libro o) {
		return this.titulo.compareTo(o.titulo);
	}
	
	/**
	 * Uso de compare para el ordanemiento de libros por paginas
	 */

	public int compare(Libro o1, Libro o2) {
		return o1.getPaginas() - o2.getPaginas();
	}

}
