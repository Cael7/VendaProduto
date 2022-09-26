
public class Produto {
	private String nome;
	private Double quantidade;
	private Double preco;
	
	Produto(String nome, Double quantidade, Double preco){
		this.setNome(nome);
		this.setPreco(preco);
		this.setQuantidade(quantidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public double saldoTotal() {
		return getQuantidade() * getPreco();
	}
}