public class Venda {
	ItemVenda[] itensDaVenda;
	FormaDePagamento formaDePagamento;
	
	Venda(ItemVenda[] itensDaVenda){
		setItensDaVenda(itensDaVenda);
	}

	public ItemVenda[] getItensDaVenda() {
		return itensDaVenda;
	}

	public void setItensDaVenda(ItemVenda[] itensDaVenda) {
		this.itensDaVenda = itensDaVenda;
	}
	
	public Double saldoTotal() {
		Double saldoTotal = (double) 0;
		
		for(int i = 0; i < getItensDaVenda().length; i++) {
			saldoTotal += getItensDaVenda()[i].valorTotal();
		}

		return saldoTotal;
	}
}
