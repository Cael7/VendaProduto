import java.util.Scanner;

public class ControladorRealizarVenda {
	Scanner scan = new Scanner(System.in);
	
	public Produto criaProduto() {
		String nomeDoProduto = scan.nextLine();
		Double quantidadeDoProduto = scan.nextDouble();
		Double precoDoProduto = scan.nextDouble();
		
		return new Produto(nomeDoProduto, quantidadeDoProduto, precoDoProduto);
	}

	public void realizaVenda(){
		int totalDeItens = scan.nextInt();
		ItemVenda[] itensDaVenda = new ItemVenda[totalDeItens];
		
		for(int i = 0; i < totalDeItens; i++) {
			Produto produto = criaProduto();
			
			Double quantidade = scan.nextDouble();
			itensDaVenda[i] = new ItemVenda(produto, quantidade);
		}
		new Venda(itensDaVenda);
	}
}
