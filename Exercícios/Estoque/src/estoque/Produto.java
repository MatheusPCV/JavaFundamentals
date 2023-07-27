package estoque;

// Classe
public class Produto {
	// Atributos 
	private int idProduto;
	private String nome;
	private double preco;
	private int quantidade;
	private boolean estado;



	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + "/n" +
				", nome=" + nome +  "/n" +
				", preco=" + preco + "/n" +
				", quantidade=" + quantidade + "/n" +
				", estado=" + (estado?"Ativo":"Descontinuado");
	}
	
	// Contrutores
	public Produto(int idProduto, String nome, double preco, int quantidade) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto() {
	}
	
	//Getters e Setters
	public int getIdProduto() {
		return idProduto;
	}
	
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}