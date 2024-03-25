public class Main
{
	public static void main(String[] args) {
        ListaLigada l01 = new ListaLigada();
        l01.adicionaInicio(5);
        l01.imprimir();
        l01.adicionaInicio(7);
        l01.imprimir();
        l01.adicionaFim(100);
        l01.imprimir();

        l01.removeFim();
        l01.imprimir();
        
        l01.removeFim();
        l01.imprimir();
        
        l01.removeFim();
        l01.imprimir();
	}
}
