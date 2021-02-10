package clases;

public class Libro {

	private String titulo;
	private String isbn;
	private Genero genero;
	private String autor;
	private Integer paginas;

	public Libro(String titulo, String isbn, Genero genero, String autor, Integer paginas) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.genero = genero;
		this.autor = autor;
		this.paginas = paginas;
	}

	public Libro() {

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Titulo " + titulo + "\nISBN " + isbn + "\nGenero " + genero + "\nAutor " + autor + "\nPaginas " + paginas;
	}

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

}
