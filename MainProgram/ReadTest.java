import java.util.Scanner;

public class ReadTest {
	public static void main(String[] args) {
		int inputuser = 0;
		Scanner scanner = new Scanner(System.in);
		while (inputuser != 999) {
		System.out.println("Masukkan nomor pilihan kategori anda, input 999 untuk keluar dari program");
		System.out.println("1. Olahraga");
		System.out.println("2. Internasional");
		System.out.println("3. Ekonomi");
		System.out.println("4. Teknologi");
		inputuser = scanner.nextInt();
		if (inputuser != 999) {
		switch (inputuser) {
			case 1:
				while (inputuser != 99) {
				RSSFeedParser olahraga = new RSSFeedParser("http://sindikasi.okezone.com/index.php/sports/RSS2.0");
				Feed feedolahraga = olahraga.readFeed();
				int a = 0;
				System.out.println("Masukkan nomor pilihan berita anda, input 99 untuk kembali ke menu utama");
				for (FeedMessage message1 : feedolahraga.getMessages()) {	
					System.out.println(a + ". " + feedolahraga.entries.get(a).title);
					a++;
				}
				inputuser = scanner.nextInt();
				if (inputuser != 99) {
					System.out.println(feedolahraga.entries.get(inputuser).link);
				}
				}
				break;
			case 2:
				while (inputuser != 99) {
				RSSFeedParser internasional = new RSSFeedParser("http://sindikasi.okezone.com/index.php/international/RSS2.0");
				Feed feedinternasional = internasional.readFeed();
				int b = 0;
				System.out.println("Masukkan nomor pilihan berita anda, input 99 untuk kembali ke menu utama");
				for (FeedMessage message2 : feedinternasional.getMessages()) {
					
					System.out.println(b + ". " + feedinternasional.entries.get(b).title);
					b++;
				}
				inputuser = scanner.nextInt();
				if (inputuser != 99) {
					System.out.println(feedinternasional.entries.get(inputuser).link);
				}
				}
				break;
			case 3:
				while (inputuser != 99) {
				RSSFeedParser ekonomi = new RSSFeedParser("http://sindikasi.okezone.com/index.php/economy/RSS2.0");
				Feed feedekonomi = ekonomi.readFeed();
				int c = 0;
				System.out.println("Masukkan nomor pilihan berita anda, input 99 untuk kembali ke menu utama");
				for (FeedMessage message3 : feedekonomi.getMessages()) {
					
					System.out.println(c + ". " + feedekonomi.entries.get(c).title);
					c++;
				}
				inputuser = scanner.nextInt();
				if (inputuser != 99) {
					System.out.println(feedekonomi.entries.get(inputuser).link);
				}
				}
				break;
			case 4:
				while (inputuser != 99) {
				RSSFeedParser teknologi = new RSSFeedParser("http://sindikasi.okezone.com/index.php/techno/RSS2.0");
				Feed feedteknologi = teknologi.readFeed();
				int d = 0;
				System.out.println("Masukkan nomor pilihan berita anda, input 99 untuk kembali ke menu utama");
				for (FeedMessage message4 : feedteknologi.getMessages()) {
					
					System.out.println(d + ". " + feedteknologi.entries.get(d).title);
					d++;
				}
				inputuser = scanner.nextInt();
				if (inputuser != 99) {
					System.out.println(feedteknologi.entries.get(inputuser).link);
				}
				}
				break;
			case 999:
				break;
			default :
				System.out.println("Invalid input");	
		}
		}
		}
	}
}
