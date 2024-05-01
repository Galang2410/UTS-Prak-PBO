import java.util.*;

abstract class Person {
    protected String nama;
    protected String note;

    public Person(String nama, String note) {
        this.nama = nama;
        this.note = note;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    // Abstract method
    public abstract String getDetails();
}


class Kontak extends Person implements Comparable<Kontak> {
    private String noHp;
    private boolean favorit;

    public Kontak(String nama, String noHp, String note) {
        super(nama, note);
        this.noHp = noHp;
        this.favorit = false;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public boolean isFavorit() {
        return favorit;
    }

    public void setFavorit(boolean favorit) {
        this.favorit = favorit;
    }

    @Override
    public String getDetails() {
        return "Nama: " + nama + ", No HP: " + noHp + (note.isEmpty() ? "" : ", Note: " + note);
    }

    @Override
    public int compareTo(Kontak other) {
        return this.nama.compareTo(other.nama);
    }
}


// .... Program Utama ....
public class AplikasiDaftarKontak2 {
    private static Scanner scanner = new Scanner(System.in);
    private static TreeSet<Kontak> daftarKontak = new TreeSet<>(new NamaComparator());

    public static void main(String[] args) {
        tambahDataContoh(); // .... Database Kontak ....

        while (true) {
            tampilkanMenuUtama();
        }
    }
    private static void tambahDataContoh() {
        daftarKontak.add(new Kontak("Fitran Alfian Nizar", "085603582095",""));    
        daftarKontak.add(new Kontak("Galang Dwiwana Thabrani", "081320172631", "galang selebgram"));        
        daftarKontak.add(new Kontak("Gallung Marwan Haqiqi Hafidz", "085695236307",""));   
        daftarKontak.add(new Kontak("Gevira Zahra Shofa", "089604671850",""));     
        daftarKontak.add(new Kontak("Gladys Lady Natasha", "08112118066",""));     
        daftarKontak.add(new Kontak("Herdin Kristiani Zebua", "085691178685","")); 
        daftarKontak.add(new Kontak("Ichlasul 'Amal Santosa", "089662080475","")); 
        daftarKontak.add(new Kontak("Ilham Marwan Sidik", "082118659462","")); 
        daftarKontak.add(new Kontak("Imany Fauzi Rahman", "085724017021","")); 
        daftarKontak.add(new Kontak("Imelia Destriani", "085767465057",""));       
        daftarKontak.add(new Kontak("Inayah Ayu Deswita", "085161931663","")); 
        daftarKontak.add(new Kontak("Irma Dwiyanti", "082128212441",""));      
        daftarKontak.add(new Kontak("Irma Rohmatillah", "081324196679",""));       
        daftarKontak.add(new Kontak("Irsyad Nur Hidayatulloh", "088218319934",""));    
        daftarKontak.add(new Kontak("Ismail Muhammad Ahmadi", "087737974230",""));     
        daftarKontak.add(new Kontak("Jamein Al-baar Putri Rusan", "085171088250",""));     
        daftarKontak.add(new Kontak("Kania Sailanul Anjani", "087848594073",""));      
        daftarKontak.add(new Kontak("Luthfi Afiyah", "085817156135",""));      
        daftarKontak.add(new Kontak("M Galang Pangestu", "082121496743",""));      
        daftarKontak.add(new Kontak("Mahesa Adlan Falah", "089512580013","")); 
        daftarKontak.add(new Kontak("Marisah Lofiana", "082288939069",""));        
        daftarKontak.add(new Kontak("Michael", "089524030190",""));            
        daftarKontak.add(new Kontak("Moch Rifky Aulia Adikusuma", "0895411254226",""));    
        daftarKontak.add(new Kontak("Mochamad Khaerul Ilman", "081313473034",""));     
        daftarKontak.add(new Kontak("Mohamed", "0895405074298",""));   
        daftarKontak.add(new Kontak("Mohammad Putra Fauzan Fatah", "081398404230",""));    
        daftarKontak.add(new Kontak("Mohammad Rafli Sumaryono", "085973842846",""));   
        daftarKontak.add(new Kontak("Muhammad Fazar Rizky Ardianto", "082116645786",""));  
        daftarKontak.add(new Kontak("Muhamad Fikri Zaelani", "0859144618393","")); 
        daftarKontak.add(new Kontak("Muhamad Zidan", "08996146095",""));   
        daftarKontak.add(new Kontak("Muhammad Addiin Alhaq Putra Wahyudi", "",""));        
        daftarKontak.add(new Kontak("Muhammad Aditya Hafizh Zahran", "081313269320",""));  
        daftarKontak.add(new Kontak("Muhammad Arkan Raihan", "0881023758568",""));     
        daftarKontak.add(new Kontak("Muhammad Azfa Haqqoni", "085722879414",""));      
        daftarKontak.add(new Kontak("Muhammad Ahsani Taqwim", "082219512788","")); 
        daftarKontak.add(new Kontak("Muhammad Alfiyan Nurwahibulloh Rohayana", "081338374587","")); 
        daftarKontak.add(new Kontak("Muhammad Agits Fathul Ma'asyi", "083102124505",""));  
        daftarKontak.add(new Kontak("Muhammad Fadhiil Hidayatullah", "081312855865",""));  
        daftarKontak.add(new Kontak("Muhammad Fakhruddin Al Farrosy", "081564825707","")); 
        daftarKontak.add(new Kontak("Muhammad Farhan Tarigan", "081312701190",""));    
        daftarKontak.add(new Kontak("Muhamamd Nopid Ardiansyah", "085337725141",""));  
        daftarKontak.add(new Kontak("Muhammad Rafli Haikal", "089508690504",""));
     
    }


        private static void tampilkanMenuUtama() {
            
            System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌");
            System.out.println("▐               APLIKASI DAFTAR KONTAK             ▌");
            System.out.println("▐                                                  ▌");
            System.out.println("▐ [1] Menampilkan Informasi                        ▌");
            System.out.println("▐ [2] Tambah Kontak                                ▌");
            System.out.println("▐ [3] Edit Kontak                                  ▌");
            System.out.println("▐ [4] Favorit Kontak                               ▌");
            System.out.println("▐ [5] Nomor darurat                                ▌");
            System.out.println("▐ [6] Cari Kontak                                  ▌");
            System.out.println("▐ [7] Keluar Aplikasi                              ▌");
            System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌\n");
            System.out.print  ("Pilih Menu : ");
            
            if (scanner.hasNextInt()) {
                int pilihan = scanner.nextInt();
                scanner.nextLine(); // .... Konsumsi newline ....
        
                switch (pilihan) {
                    case 1:
                        pembersih();
                        tampilkanInformasiKontak();
                        break;
                    case 2: 
                        pembersih();
                        tambahKontak();
                        break;
                    case 3:
                        pembersih();
                        editNomorKontak();
                        break;
                    case 4:
                        pembersih();
                        kelolaFavoritNomor();
                        break;
                    case 5:
                        pembersih();
                        nomordarurat();
                        break;
                    case 6:
                        pembersih();
                        cariKontakBerdasarkanNama();
                        break;
                    case 7:
                        pembersih();
                        keluarAplikasi();
                        break;
                    default:
                        pembersih();
                        System.out.println("Menu tidak valid. Silakan pilih menu yang sesuai.");
                }
            } else {
                pembersih();
                System.out.println("Input tidak valid. Masukkan angka (1-5).");
                scanner.nextLine(); // .... Membersihkan input yang tidak valid ....
            }
        }
        

    private static void tampilkanInformasiKontak() {
        pembersih();

        while (true) {
            
            System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌");
            System.out.println("▐               Menu Informasi Kontak              ▌");
            System.out.println("▐                                                  ▌");
            System.out.println("▐ [1] Daftar Kontak Seluruhnya                     ▌");
            System.out.println("▐ [2] Daftar Kontak Favorit                        ▌");
            System.out.println("▐ [3] Daftar Kontak Kartu Perdana                  ▌");
            System.out.println("▐ [4] Menu Utama                                   ▌");
            System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌\n");
            System.out.print  ("Pilih Menu : ");
            
            if (!scanner.hasNextInt()) {
                pembersih();
                System.out.println("Input tidak valid. Masukkan nomor menu yang sesuai.");
                scanner.nextLine(); // .... Membersihkan input yang tidak valid ....
                continue;
            }

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // .... Konsumsi newline ....
    
            switch (pilihan) {
                case 1:
                    pembersih();
                    System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌");
                    System.out.println("▐             Daftar Kontak Seluruhnya             ▌");
                    System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌");
                    for (Kontak kontak : daftarKontak) {
                        System.out.println("▐ Nama  █  " + kontak.getNama()                     );
                        System.out.println("▐ No Hp █  " + kontak.getNoHp()                     );
                        System.out.println("▐       █");
                    }
                    System.out.println("▐▄▄▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n");
                    break;
                    case 2:
                    pembersih();
                    System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌");
                    System.out.println("▐              Daftar Kontak Favorit               ▌");
                    System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌\n");
                    for (Kontak kontak : daftarKontak) {
                        if (kontak.isFavorit()) {
                            System.out.println("▐▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                            System.out.println("▐ Nama  █ " + kontak.getNama());
                            System.out.println("▐ No Hp █ " + kontak.getNoHp());
                            System.out.println("▐▄▄▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n");
                        }
                    }
                    break;
                    case 3 :
                    pembersih();
                    tampilkanInformasiKontakGroupByKartu();
                    break;
                case 4:
                    pembersih();
                    return; // .... Kembali ke menu utama ....
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }
    

    private static void tambahKontak() {
        while (true) {
            System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌");
            System.out.println("▐                Menu Tambah Kontak                ▌");
            System.out.println("▐                                                  ▌");
            System.out.println("▐ [1] Tambah Kontak                                ▌");
            System.out.println("▐ [2] Menu Utama                                   ▌");
            System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌\n");
            System.out.print  ("Pilih menu : ");

            if (!scanner.hasNextInt()) {
                pembersih();
                System.out.println("Input tidak valid. Masukkan nomor menu yang sesuai.");
                scanner.nextLine(); // .... Membersihkan input yang tidak valid ....
                continue;
            }
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // .... Konsumsi newline ....

            switch (pilihan) {
                case 1:
                    pembersih();
                    System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌");
                    System.out.print("▐ Nama: ");
                    String nama = scanner.nextLine();
                    if (nama.equalsIgnoreCase("K")) {
                        return; // .... Kembali ke menu sebelumnya ....
                    }
                    System.out.print("▐ No Hp (dengan awalan 08...): ");
                    String noHp = scanner.nextLine();

                    System.out.print("▐ Note: ");
                    String note = scanner.nextLine();

                    daftarKontak.add(new Kontak(nama, noHp, note));

                    System.out.println("▐                                                  ▌");
                    System.out.println("▐             Kontak telah ditambahkan             ▌");
                    System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌\n");
                    break;
                    case 2:
                    pembersih();
                    return; // .... Kembali ke menu utama1 ....
                    default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang sesuai.");
                }
            }
        }
        
        private static void editNomorKontak() {
            while (true) {
                System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌");
                System.out.println("▐                  Menu Edit Kontak                ▌");
                System.out.println("▐                                                  ▌");
                System.out.println("▐ [1] Edit Nama dan Nomor                          ▌");
                System.out.println("▐ [2] Edit Note                                    ▌");
                System.out.println("▐ [3] Hapus Kontak                                 ▌");
                System.out.println("▐ [4] Menu Utama                                   ▌");
                System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌\n");
            System.out.print      ("Pilih Sub-menu : ");

            if (!scanner.hasNextInt()) {
                pembersih();
                System.out.println("Input tidak valid. Masukkan nomor menu yang sesuai.");
                scanner.nextLine(); // Membersihkan input yang tidak valid
                continue;
            }

            int subMenuChoice = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (subMenuChoice) {
                case 1:
                    pembersih();
                    editNamaDanNomor();
                    break;
                case 2 :
                    pembersih();
                    editnote();
                    break;
                case 3:
                    pembersih();
                    hapusKontak();
                    break;
                case 4:
                    pembersih();
                    return; // Kembali ke Menu Utama
                default:
                    pembersih();
                    System.out.println("Sub-menu tidak valid. Silakan pilih sub-menu yang sesuai.");
            }
        }
    }

    private static void editNamaDanNomor() {
        boolean state = false;
        System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
        System.out.print("▐ Nama kontak yang akan diedit (K untuk kembali): ");
        String namaEdit = scanner.nextLine();
        System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n");
        if (namaEdit.equalsIgnoreCase("K") || namaEdit.equalsIgnoreCase("k")) {
            return; // Kembali ke Menu Edit Nomor
        }
        for (Kontak kontak : daftarKontak) {
            if (kontak.getNama().equals(namaEdit)) {
                state = true;
                System.out.print("Kontak ditemukan!\n\n");
                System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌");
                System.out.print("▐ Masukkan Nama baru : ");
                String newNama = scanner.nextLine();
                System.out.print("▐ Masukkan Nomor baru: ");
                String newNumber = scanner.nextLine();
                System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌\n");
                kontak.setNama(newNama);
                kontak.setNoHp(newNumber);
                System.out.println("Kontak berhasil di edit...\n");
                break;
            }
        }
        if (!state) {
            System.out.println("Kontak tidak ditemukan...\n");
        }
    }

     private static void editnote() {
        boolean state = false;
        System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
        System.out.print("▐ Nama kontak yang akan diedit (K untuk kembali): ");
        String namaEdit = scanner.nextLine();
        System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n");
        if (namaEdit.equalsIgnoreCase("K") || namaEdit.equalsIgnoreCase("k")) {
            return; // Kembali ke Menu Edit Nomor
        }
        for (Kontak kontak : daftarKontak) {
            if (kontak.getNama().equals(namaEdit)) {
                state = true;
                System.out.print("Kontak ditemukan!\n\n");
                System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌");
                System.out.print("▐ Masukkan Note baru : ");
                String newNote = scanner.nextLine();
                System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌\n");
                kontak.setNote(newNote);
                System.out.println("note berhasil di edit berhasil di edit...\n");
                break;
            }
        }
        if (!state) {
            System.out.println("Kontak tidak ditemukan...\n");
        }
    }

    private static void hapusKontak() {
        System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
        System.out.print("▐ Nama kontak yang akan dihapus (K untuk kembali): ");
        String namaHapus = scanner.nextLine();
        System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n");
        if (namaHapus.equalsIgnoreCase("K") || namaHapus.equalsIgnoreCase("k")) {
            return; // Kembali ke Menu Edit Nomor
        }
    
        Kontak kontakHapus = null;
        for (Kontak kontak : daftarKontak) {
            if (kontak.getNama().equals(namaHapus)) {
                kontakHapus = kontak;
                break;
            }
        }
    
        if (kontakHapus != null) {
            daftarKontak.remove(kontakHapus);
            System.out.println("Kontak berhasil dihapus.\n");
        } else {
            System.out.println("Kontak tidak ditemukan...\n");
        }
    }
    

    private static void kelolaFavoritNomor() {
        while (true) {
            System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌");
            System.out.println("▐                Menu Favorit Kontak               ▌");
            System.out.println("▐                                                  ▌");
            System.out.println("▐ 1. Input Favorit Kontak                          ▌");
            System.out.println("▐ 2. Hapus Favorit Kontak                          ▌");
            System.out.println("▐ 3. Menu Utama                                    ▌");
            System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌\n");
            System.out.print("Pilih sub-menu : ");

            if (!scanner.hasNextInt()) {
                pembersih();
                System.out.println("Input tidak valid. Masukkan nomor menu yang sesuai.");
                scanner.nextLine(); // Membersihkan input yang tidak valid
                continue;
            }

            int subMenu = scanner.nextInt();
            scanner.nextLine(); 
    
            switch (subMenu) {
                case 1:
                    pembersih();
                    System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                    System.out.print("▐ Nama kontak yang akan dijadikan favorit: ");
                    String namaFavorit = scanner.nextLine();
                    System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n");
    
                    Kontak kontakFavorit = daftarKontak.stream()
                            .filter(k -> k.getNama().equals(namaFavorit))
                            .findFirst()
                            .orElse(null);
    
                    if (kontakFavorit == null) {
                        System.out.println("Kontak dengan nama tersebut tidak ditemukan.\n");
                    } else {
                        kontakFavorit.setFavorit(true);
                        System.out.println("Kontak telah ditambahkan ke favorit\n");
                    }
                    break;
                case 2:
                    pembersih();
                    System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                    System.out.print("▐ Nama kontak yang akan dihapus dari favorit: ");
                    String namaHapus = scanner.nextLine();
                    System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n");
    
                    Kontak kontakHapusFavorit = daftarKontak.stream()
                            .filter(k -> k.getNama().equals(namaHapus))
                            .findFirst()
                            .orElse(null);
    
                    if (kontakHapusFavorit == null) {
                        System.out.println("Kontak dengan nama tersebut tidak ditemukan.\n");
                    } else {
                        kontakHapusFavorit.setFavorit(false);
                        System.out.println("Kontak telah dihapus dari favorit.\n");
                    }
                    break;

                case 3:
                 pembersih();
                    return; // Kembali ke Menu Utama
                    default:
                   
                    System.out.println("Sub-menu tidak valid. Silakan pilih sub-menu yang sesuai.");
                    break;
            }
        }
    }

    private static String cekKartuPerdana(String noHp) {
        if (noHp.startsWith("0852") || noHp.startsWith("0853")) {
            return "      Kartu AS       █";
        } else if (noHp.startsWith("0811")) {
            return "     Kartu Halo      █";
        } else if (noHp.startsWith("0812") || noHp.startsWith("0813") || noHp.startsWith("0821")) {
            return "   Kartu Simpati     █";
        } else if (noHp.startsWith("0822")) {
            return "     Kartu Loop      █";
        } else if (noHp.startsWith("0851")) {
            return "  Kartu AS - By U    █";
        }else if (noHp.startsWith("0857")|| noHp.startsWith("0856")|| noHp.startsWith("0815")|| noHp.startsWith("0814")|| noHp.startsWith("0816")|| noHp.startsWith("0855")|| noHp.startsWith("0856")|| noHp.startsWith("0857")|| noHp.startsWith("0858")){ 
            return "   Kartu Indosat     █";
        } else if (noHp.startsWith("0896") || noHp.startsWith("0895") || noHp.startsWith("0897") || noHp.startsWith("0897")|| noHp.startsWith("0898")|| noHp.startsWith("0899")) {
            return "     Kartu Tri       █";
        }else if (noHp.startsWith("0817") || noHp.startsWith("0818") || noHp.startsWith("0819") || noHp.startsWith("0859")|| noHp.startsWith("0859")|| noHp.startsWith("0877") || noHp.startsWith("0878")) {
            return "     Kartu XL        █";
        }else if (noHp.startsWith("0831") || noHp.startsWith("0832") || noHp.startsWith("0833") || noHp.startsWith("0838")) {
            return "    Kartu AXIS       █";
        }else if (noHp.startsWith("0881") || noHp.startsWith("0882") || noHp.startsWith("0883") || noHp.startsWith("0884")|| noHp.startsWith("0885")|| noHp.startsWith("0886") || noHp.startsWith("0887")|| noHp.startsWith("0888") || noHp.startsWith("0889")) {
            return "  Kartu Smartfren    █";
        }else {
            return "Kartu tidak dikenal  █";
        }
    }

    private static void tampilkanInformasiKontakGroupByKartu() {
        Map<String, List<Kontak>> kontakGroupByKartu = new HashMap<>();
        System.out.println();
        System.out.println();
        pembersih();
        System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌");
        System.out.println("▐                  Jenis Kartu Perdana              ▌");
        System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌\n");
        // Inisialisasi kelompok kontak untuk setiap kartu perdana
        kontakGroupByKartu.put("      Kartu AS       █", new ArrayList<>());
        kontakGroupByKartu.put("     Kartu Halo      █", new ArrayList<>());
        kontakGroupByKartu.put("   Kartu Simpati     █", new ArrayList<>());
        kontakGroupByKartu.put("     Kartu Loop      █", new ArrayList<>());
        kontakGroupByKartu.put("  Kartu AS - By U    █", new ArrayList<>());
        kontakGroupByKartu.put("   Kartu Indosat     █", new ArrayList<>());
        kontakGroupByKartu.put("     Kartu Tri       █", new ArrayList<>());
        kontakGroupByKartu.put("     Kartu XL        █", new ArrayList<>());
        kontakGroupByKartu.put("    Kartu AXIS       █", new ArrayList<>());
        kontakGroupByKartu.put("  Kartu Smartfren    █", new ArrayList<>());
        kontakGroupByKartu.put("Kartu tidak dikenal  █", new ArrayList<>());
    
        // .... Memasukkan kontak ke dalam kelompok yang sesuai dengan kartu perdana ....
        for (Kontak kontak : daftarKontak) {
            String kartu = cekKartuPerdana(kontak.getNoHp());
            if (kontakGroupByKartu.containsKey(kartu)) {
                kontakGroupByKartu.get(kartu).add(kontak);
            }
        }
    
        // .... Menampilkan kontak berdasarkan kelompok kartu perdana ....
        for (Map.Entry<String, List<Kontak>> entry : kontakGroupByKartu.entrySet()) {
            String kartu = entry.getKey();
            List<Kontak> kontakList = entry.getValue();
    
            if (!kontakList.isEmpty()) {
                System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█");
                System.out.println("▐ " + kartu          );
                System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
                for (Kontak kontak : kontakList) {
                    System.out.println("▐ Nama  █ " + kontak.getNama());
                    System.out.println("▐ No Hp █ " + kontak.getNoHp());
                }
                System.out.println("▐▄▄▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n");
            }
        }
    }

    // ... Linear search ...
    private static void cariKontakBerdasarkanNama() {
        System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
        System.out.print("▐ Masukkan nama yang ingin dicari: ");
        String namaCari = scanner.nextLine();
        System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n");
  
    
        boolean ketemu = false;
        for (Kontak kontak : daftarKontak) {
            if (kontak.getNama().toLowerCase().contains(namaCari.toLowerCase())) {
                System.out.println("▐▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                System.out.println("▐ Nama  █ " + kontak.getNama());
                System.out.println("▐ No Hp █ " + kontak.getNoHp());
                System.out.println("▐ Note  █ " + kontak.getNote());
                System.out.println("▐▄▄▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n");
                ketemu = true;
            }

        }

      
        if (!ketemu) {
            System.out.println("Kontak dengan nama tersebut tidak ditemukan.");
        }
        
    }

    private static void nomordarurat(){
        System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
        System.out.print("▐ '112' untuk segala hal ( K untuk kembali ): ");
        String dar = scanner.nextLine();
        System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n");
         
         if (dar.equalsIgnoreCase("K") || dar.equalsIgnoreCase("k")) {
            return; // Kembali ke Menu Edit Nomor
     }
    }

    private static void keluarAplikasi() {
        System.out.println("▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌");
        System.out.println("▐         Terima kasih! Aplikasi selesai            ▌");
        System.out.println("▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌\n");
        scanner.close();
        System.exit(0);
    }

    private static void pembersih() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
