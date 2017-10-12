package id.web.rizki.resepmakanan;

/**
 * Created by RN on 10/2/2017.
 * POJO (Pland Of Object)
 */

public class PolaItem {
    private int img; //Image item
    private String judul; //Judul item
    private String deskripsi; //Deskripsi item


    /*Constractor
     untuk menginisialisasi variabel
     */
    public PolaItem(int img, String judul, String deskripsi){
        this.img = img;
        this.judul = judul;
        this.deskripsi = deskripsi;
    }

    /*
    Getter, digunakan untuk mengambil mengambil atau mengembalikan nilai dari
    variabel yang bersifat private
     */

    public int getImg(){
        return this.img;
    }

    public String getJudul(){
        return  this.judul;
    }

    public String getDeskripsi(){
        return this.deskripsi;
    }

    /*
    Setter, digunakan untuk mengeset nilai dari
    variabel yang bersifat private
     */

    public void setImg(int img){
        this.img = img;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

}
