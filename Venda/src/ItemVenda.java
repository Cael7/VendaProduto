public class ItemVenda {
	Produto produto;
	Double quantidade;
	
	ItemVenda(Produto produto, Double quantidade){
		setProduto(produto);
		setQuantidade(quantidade);
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double valorTotal() {		
		return getQuantidade() * getProduto().getPreco();
	}
}
