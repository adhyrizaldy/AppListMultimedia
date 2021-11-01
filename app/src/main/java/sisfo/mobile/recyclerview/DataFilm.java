package sisfo.mobile.recyclerview;

import android.os.Parcel;
import android.os.Parcelable;

import sisfo.mobile.recyclerview.R;

public class DataFilm implements Parcelable {


        //item-item data objek
        public String judul;
        public int nomorposter;
        public String details;
        public String aktor;

        //Activity pengambil model ambil n set data
        public DataFilm() {
            this.judul = getJudul() ;
            this.nomorposter = getNomorposter();
            this.details = getDetails();
            this.aktor = getAktor();
        }

        public DataFilm(int posisi){
            this.judul = Datavalues.namafilm[posisi];
            this.nomorposter = Datavalues.gambarfilm[posisi];
            this.details = Datavalues.detailfilm[posisi];
            this.aktor = Datavalues.casts[posisi];
        }

        //memasukkan dalam Parcel datanya
        protected DataFilm(Parcel in) {
            judul = in.readString();
            nomorposter = in.readInt();
            details = in.readString();
            aktor = in.readString();
        }

        //Unparccel data ke activity tujuan
        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(judul);
            dest.writeInt(nomorposter);
            dest.writeString(details);
            dest.writeString(aktor);
        }

        @Override
        public int describeContents() {
            return 0;
        }


        public static final Creator<DataFilm> CREATOR = new Creator<DataFilm>() {

            //nulis value data ke objek ke act tujuan
            @Override
            public DataFilm createFromParcel(Parcel in) {
                return new DataFilm(in);
            }

            @Override
            public DataFilm[] newArray(int size) {
                return new DataFilm[size];
            }
        };

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getNomorposter() {
        return nomorposter;
    }

    public void setNomorposter(int nomorposter) {
        this.nomorposter = nomorposter;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setAktor(String aktor){
        this.aktor = aktor;
    }

    public String getAktor(){
        return aktor;
    }
}
