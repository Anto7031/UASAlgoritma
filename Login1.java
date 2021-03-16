import java.util.Scanner;
public class Login1{
	public static void main(String[] args){
		Scanner uname=new Scanner(System.in);
		Scanner pw=new Scanner(System.in);

		String nama_pengguna[]={"Hendrianto"}, nama; 
		String passwd[]={"10102000"}, sandi;
		System.out.println("|________________________________________________________|");
		System.out.println("|                 Selamat Datang di                      |");
		System.out.println("|                Aplikasi Sederhana                      |");
		System.out.println("|                       Java                             |");
		System.out.println("|________________________________________________________|");
		System.out.println("Masukkan Nama Pengguna :");
		nama = uname.nextLine();
		System.out.println("Masukkan Sandi");
		sandi=pw.nextLine();

		if (nama.equals(nama_pengguna[0]) && sandi.equals(passwd[0])) {
			menu();
		}
		else if (nama.equals (nama_pengguna[1]) && sandi.equals(passwd[1])) {
			menu();
		}
		else if (nama.equals(nama_pengguna[2]) && sandi.equals(passwd[2])) {
			menu();
		}
		else {
			System.out.println("Maaf Nama Pengguna atau sandi Anda salah");
		}
	}

	static void menu(){
		int menu;
		Scanner h1=new Scanner(System.in);
		System.out.println("==========================================================");
		System.out.println("                  Selamat Datang di                       ");
		System.out.println("                 Aplikassi Sederhana                      ");
		System.out.println("                        Java                              ");
		System.out.println("==========================================================");
		System.out.println("Silahkan pilih Aplikasi :");
		System.out.println("1. Aplikasi Perhitungan Luas");
		System.out.println("2. Aplikasi Perhitungan Volume");
		System.out.println("3. Aplikasi Pengurutan Data");
		System.out.println("4. Menu Keluar");
		System.out.println("==========================================================");
		menu=h1.nextInt();
		if (menu==0) {	
		}
		else if (menu==1){
			PerhitunganLuas();	
		}
		else if (menu==2){
			PerhitunganVolume();	
		}
		else if (menu==3){
			PengurutanData();	
		}
		else if (menu==4){
			System.exit(0);	
		}
		else {
			System.out.println("Maaf tidak ada Menu untuk inputan Anda");
			menu();
		}

	}
	static void PerhitunganLuas(){
		Scanner terima=new Scanner(System.in);
		String perhitungan[]={"Luas Segitiga", "Luas Persegi", "Luas Persegi Panjang", "Luas Layang-layang", "Luas Lingkaran", "Luas Jajar-genjang", "Menu Utama"};
		System.out.println("============================================================================");
		System.out.println("=                    Program Menghitung Luas Bangun Datar                  =");
		System.out.println("============================================================================");
		System.out.println("Silahkan Pilih Program yang ingin digunakan");
		for (int i=0;i<perhitungan.length; i++ ) {
			System.out.println(i+". "+perhitungan[i]);
		}
		System.out.println("9. Keluar");
		System.out.print("Pilih :");
		int pilih;
		pilih=terima.nextInt();

		switch(pilih){
			case 1:
				System.out.println("=========================================");
				System.out.println("=        Perhitungan Luas Segitiga      =");
				System.out.println("=========================================");
				System.out.println(" ");
				int panjang, alas, luas;
				System.out.print("Masukkan Alas : ");
				alas=terima.nextInt();
				System.out.print("Masukkan Tinggi : ");
				panjang=terima.nextInt();
				luas=(panjang * alas)/2;
				System.out.println(" ");
				System.out.println("Luas Segitiga Anda adalah : "+luas+" cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;			
			
			case 2:
				System.out.println("=========================================");
				System.out.println("=        Perhitungan Luas Persegi       =");
				System.out.println("=========================================");
				System.out.println(" ");
				int sisi;
				System.out.print("Masukkan Panjang Sisi : ");
				sisi=terima.nextInt();
				luas=(sisi * 2);
				System.out.println(" ");
				System.out.println("Luas Persegi Anda adalah : "+luas+" cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;				
			
			case 3:
				System.out.println("=========================================");
				System.out.println("=   Perhitungan Luas Persegi Panjang    =");
				System.out.println("=========================================");
				System.out.println(" ");
				int lebar;
				System.out.print("Masukkan Panjang : ");
				panjang=terima.nextInt();
				System.out.print("Masukkan lebar : ");
				lebar=terima.nextInt();
				luas=(panjang * lebar);
				System.out.println(" ");
				System.out.println("Luas Persegi Panjang Anda adalah:"+luas+"cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;			
			
			case 4:
				System.out.println("=========================================");
				System.out.println("=    Perhitungan Luas Layang-layang     =");
				System.out.println("=========================================");
				System.out.println(" ");
				int diagonal_1, diagonal_2;
				System.out.print("Masukkan Panjang Diagonal 1 : ");
				diagonal_1=terima.nextInt();
				System.out.print("Masukkan Panjang Diagonal 2 : ");
				diagonal_2=terima.nextInt();
				luas=(diagonal_2*diagonal_1)/2;
				System.out.println(" ");
				System.out.println("Luas Layang-layang Anda adalah : "+luas+" cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;
			
			case 5:
				System.out.println("=========================================");
				System.out.println("=      Perhitungan Luas Lingkaran       =");
				System.out.println("=========================================");
				System.out.println(" ");
				int r;
				Double pi=3.14, luaslingkaran;
				System.out.println("Masukkan Jari-jari Lingkaran : ");
				r=terima.nextInt();
				luaslingkaran=(pi*r*r);
				System.out.println(" ");
				System.out.println("Luas Lingkaran Anda adalah : "+luaslingkaran+" cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;	
			case 6:
				System.out.println("=========================================");
				System.out.println("=    Perhitungan Luas Jajar Genjang     =");
				System.out.println("=========================================");
				System.out.println(" ");
				System.out.println("Masukkan Panjang Alas : ");
				panjang=terima.nextInt();
				System.out.println("Masukkan Tinggi : ");
				alas=terima.nextInt();
				luas=(panjang*alas);
				System.out.println(" ");
				System.out.println("Luas Jajar Genjang Anda adalah : "+luas+" cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;	
			case 7:
				System.out.println("=========================================");
				System.out.println("=    Perhitungan Luas Belah Ketupat     =");
				System.out.println("=========================================");
				System.out.println(" ");
				System.out.print("Masukkan Panjang Diagonal 1 : ");
				diagonal_1=terima.nextInt();
				System.out.print("Masukkan Panjang Diagonal 2 : ");
				diagonal_2=terima.nextInt();
				luas=(diagonal_2*diagonal_1)/2;
				System.out.println(" ");
				System.out.println("Luas Belah Ketupat Anda adalah : "+luas+" cm^2");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganLuas();
				break;
			case 8:
				menu();
			case 9:
				System.exit(0);
				break;
			default:
				System.out.print("Maaf tidak ada Menu untuk inputan Anda");
				PerhitunganLuas();
			
		}
	}	
	static void PerhitunganVolume(){
		Scanner terima=new Scanner(System.in);
		String perhitungan[]={"Volume Pisma Segitiga","Volume Limas Segi Empat", "Volume Limas Segitiga", "Volume Kubus","Volume Balok","Volume Tabung","Volume Kerucut", "Menu Utama"};
		System.out.println("============================================================================");
		System.out.println("=                    Program Menghitung Luas Bangun Datar                  =");
		System.out.println("============================================================================");
		System.out.println("Silahkan Pilih Program yang ingin digunakan");
		for (int i=0;i<perhitungan.length; i++ ) {
			System.out.println(i+". "+perhitungan[i]);
		}
		System.out.println("8. Keluar");
		System.out.print("Pilih :");
		int pilih;
		pilih=terima.nextInt();

		switch(pilih){
			case 1:
				System.out.println("==************************************====");
				System.out.println("=  Perhitungan Volume Prisma Segitiga    =");
				System.out.println("==************************************====");
				System.out.println(" ");
				int panjang, alas, tinggi, volume;
				System.out.print("Masukkan Tinggi Segitiga : ");
				alas=terima.nextInt();
				System.out.print("Masukkan Alas Segitiga : ");
				panjang=terima.nextInt();
				System.out.print("Masukkan tinggi Prisma Segitiga : ");
				tinggi=terima.nextInt();
				volume=(panjang * alas*tinggi)/2;
				System.out.println(" ");
				System.out.println("Luas Prisma Segitiga Anda adalah : "+volume+" cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;			
			
			case 2:
				System.out.println("==*************************************===");
				System.out.println("=  Perhitungan Volume Limas Segi Empat   =");
				System.out.println("==*************************************===");
				System.out.println(" ");
				int lebar;
				System.out.print("Masukkan Panjang segi empat : ");
				panjang=terima.nextInt();
				System.out.print("Masukkan lebar segi empat : ");
				lebar=terima.nextInt();
				System.out.print("Masukkan tinggi limas  : ");
				tinggi=terima.nextInt();
				volume=(panjang*lebar*tinggi)/3;
				System.out.println(" ");
				System.out.println("Luas Limas Segi empat Anda adalah : "+volume+" cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;				
			
			case 3:
				System.out.println("==***********************************====");
				System.out.println("=  Perhitungan Volume Limas Segitiga    =");
				System.out.println("==***********************************====");
				System.out.println(" ");
				System.out.print("Masukkan Tinggi Segitiga : ");
				alas=terima.nextInt();
				System.out.print("Masukkan Alas Segitiga : ");
				panjang=terima.nextInt();
				System.out.print("Masukkan tinggi limas Segitiga : ");
				tinggi=terima.nextInt();
				volume=tinggi*((alas*panjang)/2)/3;
				System.out.println(" ");
				System.out.println("volume limmas segitiga Anda adalah : "+volume+" cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;			
			
			case 4:
				System.out.println("======***************************========");
				System.out.println("=       Perhitungan Volume Kubus        =");
				System.out.println("======****************************=======");
				System.out.println(" ");
				int sisi;
				System.out.print("Masukkan Panjang Sisi :");
				sisi=terima.nextInt();
				volume=(sisi * 3);
				System.out.println(" ");
				System.out.println("Luas Kubus Anda adalah : "+volume+"cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;
			
			case 5:
				System.out.println("======****************************=======");
				System.out.println("=       Perhitungan Volume Balok        =");
				System.out.println("======****************************=======");
				System.out.println(" ");
				System.out.println("Masukkan Panjang :");
				panjang=terima.nextInt();
				System.out.print("Masukkan Lebar :");
				lebar=terima.nextInt();
				System.out.print("Masukkan Tinggi :");
				tinggi=terima.nextInt();
				volume=(panjang * lebar * tinggi);
				System.out.println(" ");
				System.out.println("Luas Balok Anda adalah : "+volume+" cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;	
			case 6:
				System.out.println("======****************************=======");
				System.out.println("=       Perhitungan Volume Tabung       =");
				System.out.println("======*****************************======");
				System.out.println(" ");
				int r;
				Double pi, volumed;
				pi=3.14;
				System.out.println("Masukkan Jari-jari: ");
				r=terima.nextInt();
				System.out.println("Masukkan Tinggi : ");
				tinggi=terima.nextInt();
				volumed=(pi*r*r*tinggi);
				System.out.println(" ");
				System.out.println("Luas Jajar Genjang Anda adalah : "+ volumed +" cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;	
			case 7:
				System.out.println("=====*******************************=======");
				System.out.println("=       Perhitungan Volume Kerucut     	  =");
				System.out.println("======******************************=======");
				System.out.println(" ");
				pi=3.14;
				System.out.println("Masukkan Jari-jari: ");
				r=terima.nextInt();
				System.out.println("Masukkan Tinggi kerucut: ");
				tinggi=terima.nextInt();
				volumed=(pi*r*r*tinggi)/3;
				System.out.println(" ");
				System.out.println("Luas Belah Ketupat Anda adalah : "+volumed+" cm^3");
				System.out.println("=========================================");
				System.out.println("Perhitungan Selesai");
				PerhitunganVolume();
				break;
			case 8:
				menu();
			case 9: 
				System.exit(0);
				break;
			default:
				System.out.print("Maaf tidak ada Menu untuk inputan Anda");
				PerhitunganVolume();
		}
	}
	static void PengurutanData(){
		Scanner terima=new Scanner(System.in);
		int n;
		System.out.println("===========********************==========");
		System.out.println("=             Pengurutan Data           =");
		System.out.println("===========********************==========");
		System.out.println();
		System.out.println("Masukkan jumlah data yang ingin diurutkan");
		n=terima.nextInt();
		int data[]=new int [n];
		System.out.println("Masukkan isi data yang ingin diurutkan");
		for (int i=0; i<n; i++ ){
			data[i]=terima.nextInt();
		}
		System.out.println("Proses input data selesai");
		System.out.println("=========================================");
		System.out.println();
		System.out.print("Data yang Anda masukkan adalah : ");
		for (int j=0;j<n;j++ ){
			System.out.print(data[j]+" ");
		}
		System.out.println();
		int tmp;
		for (int i=0;i<data.length;i++){
			for (int j=0;j<(data.length-1);j++ ) {
				if (data[j]>data[j+1]){
					 tmp=data[j];
					data[j]=data[j+1];
					data[j+1]=tmp;
				}
			}
		}
		System.out.print("Data sesudah dirutkan : ");
		for (int k=0;k<n ;k++ ) {
			System.out.print(data[k]+" ");
		}
		System.out.println();
		System.out.println("Proses pengurutan data selesai");
		System.out.println();
		System.out.println("=========================================");
		menu();
	}
}