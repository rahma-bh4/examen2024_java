package ds2023;

public class Blog {
	private String titre;
	private Publiable[] LBillets;
	private int nb;
	public Blog(String titre,int capacite) {
		this.titre = titre;
		LBillets=new Publiable[capacite];
	}
	

public void post(Publiable billet) throws  InvalidURLException{
		if(billet instanceof Video && !((Video)billet).getUrl().startsWith("HTTPS")) {
			throw new InvalidURLException();
		}
		else {
			LBillets[nb]=billet;
			nb++;
		}
		
	}
public int getNombreBilletsTaggables() {
	int s=0;
	for(int i=0;i<nb;i++)
	{
		if(LBillets[i] instanceof BilletsTaggables )
		{
			s++;
		}
	}
	return s;
	
}

public Publiable[] RechercheBilletsTaggablesParAuteur(String auteur) {
	int n=0;
	Publiable[] T=new Publiable[nb];
	for(int i=0;i<nb;i++)
	{
		if(LBillets[i] instanceof BilletsTaggables && LBillets[i].getAuteur().equals(auteur))
		{
			T[n]=LBillets[i];
			n++;
		}
	}
	return T;

}

public Publiable getPlusRécentBillet() {
	
	Publiable P=LBillets[0];
	for(int i=1;i<nb;i++)
	{
		if(LBillets[i].getDatePublication().isAfter(P.getDatePublication()))
		{
			P=LBillets[i];
		}
	}
	return P;
	
}

public Publiable[] RechercheBilletsParContenu(String[] mots) {
	Publiable[] P=new Publiable[nb];
	int n=0;
	for(int i=1;i<nb;i++)
	{
		if(LBillets[i] instanceof Message )	
		{
			int j=0;
			while(((Message)LBillets[i]).getCont().indexOf(mots[j])!=-1 && j<mots.length){
				j++;
			}
			if(j==nb)
			{
				P[n]=LBillets[i];
				n++;
			}
			
		}
	}
	return P;
	
	
	
}



}
