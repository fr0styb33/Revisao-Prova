package ifsc;

import java.util.ArrayList;

public class ObraMain {

	public static void main(String[] args) {
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		Livro l3 = new Livro();
		
		l1.setTitulo("Laranja Mecânica");
		l1.setEditora("Aleph");
		l1.setIsbn("3323");
		l1.setnPaginas(300);
		
		l2.setTitulo("Orgulho e Preconceito");
		l2.setEditora("Marton Claret");
		l2.setIsbn("3333");
		l2.setnPaginas(404);
		
		l3.setTitulo("Rita Lee: Uma autobiografia");
		l3.setEditora("GloboLivros");
		l3.setIsbn("3343");
		l3.setnPaginas(500);
		
		ArrayList<Livro> listaLivro = new ArrayList<>();
			listaLivro.add(l1);
			listaLivro.add(l2);
			listaLivro.add(l3);
			
		for(Livro livro : listaLivro) {
			System.out.println("\n----- LIVRO -----\n");
			System.out.println("Título: "+livro.getTitulo());
			System.out.println("Editora: "+livro.getEditora());
			System.out.println("Isbn: "+livro.getIsbn());
			System.out.println("Número de Páginas: "+livro.getnPaginas());
		}
		
		Manga m1 = new Manga();
		Manga m2 = new Manga();
		Manga m3 = new Manga();
		
		m1.setTitulo("Kimetsu no Yaiba");
		m1.setEditora("Panini");
		m1.setVolume(1);
		m1.setnPaginas(230);
		
		m2.setTitulo("Jujutsu Kaisen");
		m2.setEditora("Panini");
		m2.setVolume(5);
		m2.setnPaginas(200);
		
		m3.setTitulo("Blue look");
		m3.setEditora("Panini");
		m3.setVolume(1);
		m3.setnPaginas(190);	

		ArrayList<Manga> listaManga = new ArrayList<>();
		listaManga.add(m1);
		listaManga.add(m2);
		listaManga.add(m3);
		
		for(Manga manga : listaManga) {
			System.out.println("\n------ MANGÁ ------");
			System.out.println("Título: "+manga.getTitulo());
			System.out.println("Editora: "+manga.getEditora());
			System.out.println("Volume: "+manga.getVolume());
			System.out.println("Número de Páginas: "+manga.getnPaginas());
		}
	}
}
