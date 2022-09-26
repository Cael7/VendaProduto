public class FormaDePagamento {
	private int enumFormaDePagamento;
	static final int PIX = 0;
	static final int CREDITO = 1;
	static final int DEBITO = 2;
	static final int BOLETO = 3;

	FormaDePagamento(int enumFormaDePagamento){
		setEnumFormaDePagamento(enumFormaDePagamento);
	}

	public int getEnumFormaDePagamento() {
		return enumFormaDePagamento;
	}

	public void setEnumFormaDePagamento(int enumFormaDePagamento) {
		this.enumFormaDePagamento = enumFormaDePagamento;
	}
}
