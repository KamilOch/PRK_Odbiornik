package model;

public class SpectrumDataProcessor implements ReceiverDataConverterListener{

	double threshold;//pr�g decyzyjny powy�ej kt�rego wszystkie przekroczenia poziomu widma traktujemy jako sygna�y uzyteczne
	//doda� wymagane zmienne na kolekcje danych
	
	public SpectrumDataProcessor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//metoda do przetwarzania widma i znajdowania sygna��w powy�ej progu decyzyjnego a potem znajdowanie pik�w (wykorzysta� r�niczk�) i dla tych warto�ci maksymalnych okre�li�� cz�stotliwo�ci
	public void proceesSpectrum(double[] receivedData) {
		;
	}

	@Override
	public void onError(String error) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDataReceived(double[] receivedData, int dataSize, int seqNumber, double timeStamp, double freqStart,
			double freqStep) {
		// TODO Auto-generated method stub
		//tutaj odbieramy i przetwarzamy dane widma
		proceesSpectrum(receivedData);
		
		
		
		//wynik poprosz�e zwr�ci� w zdarzeniu zwrotnym do klasy kontrolera (podobnie jak w SpectrumWateerfall)
		
		
		//dorobui� zapis wynik�w do bazy danych
		
		
		
		
	}

}
