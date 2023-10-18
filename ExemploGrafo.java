package ExemploGrafo;

public class ExemploGrafo {
	
	public static void main(String[] args) {
		Grafo<String> grafo = new Grafo<String>();
		grafo.adicionarVertice("Franciele Oliveira");
		grafo.adicionarVertice("Tais Prates");
		grafo.adicionarVertice("Daiane Rosa");
		grafo.adicionarVertice("Kayky Yan");
		grafo.adicionarVertice("Larissa Rosa");
		
		grafo.adicionarAresta(2.0, "Franciele Oliveira", "Tais Prates");
		grafo.adicionarAresta(3.0, "Tais Prates", "Kayky Yan");
		grafo.adicionarAresta(1.0, "Kayky Yan", "Daiane Rosa");
		grafo.adicionarAresta(1.0, "Franciele Oliveira", "Daiane Rosa");
		grafo.adicionarAresta(2.0, "Larissa Rosa", "Tais Prates");
		grafo.adicionarAresta(3.0, "Larissa Rosa", "Franciele Oliveira");

        grafo.BuscaEmLargura();
	}
}