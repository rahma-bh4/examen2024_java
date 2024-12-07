package ds2023;

import java.time.LocalDate;
import java.util.Arrays;

public class BilletsTaggables extends Billet implements Taggable{
	private String [] LTags;
	private int nbTags;
	public BilletsTaggables(LocalDate datePub, String aut, int cap) {
		super(datePub, aut);
		LTags =new String[cap];
		
	}
	@Override
	public String toString() {
		return super.toString()+"BilletsTaggables [LTags=" + Arrays.toString(LTags) + ", nbTags=" + nbTags + "]";
	}
	
	public void ajoutTag(String tag)
	{
		int i=0;
		while(i<nbTags && !LTags[i].equals(tag))
		{
			i++;
		}
		if(i<nbTags)
		{
			LTags[nbTags]=tag;
			nbTags++;
		}
		else {
			System.out.println("le tag existe déjà");
		}
		
	}
	
	public void supprimeTag(String tag)
	{
		int i=0;
		while(i<nbTags && !LTags[i].equals(tag))
		{
			i++;
		}
		if(i<nbTags)
		{
			for(int j=i;j<nbTags-1;j++)
			{
				LTags[j]=LTags[j+1];
			}
		}else {
			System.out.println("le tag n'existe pas");
		}
	}
	
	public int nombreTags()
	{
		return nbTags;
		
	}
	public int rechercheTag(String tag)
	{
		int i=0;
		while(i<nbTags && !LTags[i].equals(tag))
		{
			i++;
		}
		if(i<nbTags)
		{
			return i;
		}
		else {
			return -1;
		}
		
	}
	

	
	
	
	
}
