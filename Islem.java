import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Islem {
	
	public static void main(String [] args) 
	{
		Scanner kisi = new Scanner(System.in);
		System.out.println("Ogrencinin ismini girin:");
		String ogrenci = kisi.nextLine();
		
		Scanner sinav = new Scanner(System.in);
		System.out.println("Sinav Notunu Gir:");
		int puan = sinav.nextInt();
		
		Scanner odev = new Scanner(System.in);
		System.out.println("Odev Notunu Gir:");
		int puan2 = odev.nextInt();
		
		double hesap = puan * 0.6 + puan2 * 0.4;
	
		if (hesap >= 5) {
			
		   final JPanel panel = new JPanel();
		   JOptionPane.showMessageDialog(panel,"Dersi gectiniz, Notunuz:"+ " " + hesap, "Tebrikler"+"-"+ogrenci,JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if ( hesap < 5) {
			
			final JPanel panel = new JPanel();
			JOptionPane.showMessageDialog(panel,"Dersi Gecemediniz, Notunuz:"+ " " + hesap, "Basarisiz"+"-"+ ogrenci, JOptionPane.ERROR_MESSAGE);
		}			
	}
}