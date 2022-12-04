package websearch;

public class Snooper {
	private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;
        //Aqui foi criado o primeiro observer para que a consulta tenha Son long maais retornara seempre que tiver mais de 60 caracteres
        model.addQueryObserver( new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
            	System.out.println("Son long... " + query);
            }
        },
		new WebSearchModel.WebSearchFilterStrategy() {
			@Override
			public boolean filter(String query) {
				return query.length() > 60;
			}
		});
        //ja no segundo observer sempre que contem friend e não diferencia letras minusculas das maiusculaas
        
        model.addQueryObserver( new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
            	System.out.println("Oh Yes! " + query);
            }
        },
		new WebSearchModel.WebSearchFilterStrategy() {	
			@Override
			public boolean filter(String query) {
				return query.toLowerCase().contains("friend");
			}
		});
    }
}
