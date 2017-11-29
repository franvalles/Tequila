package mx.udg.cuvalles.adapter;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by francisco raul on 10/11/2017.
 */

public class Tequila implements Parcelable{
    String nombre, foto, descripcion;

    public Tequila(String nombre, String foto, String descripcion) {
        this.nombre = nombre;
        this.foto = foto;
        this.descripcion = descripcion;
    }

    protected Tequila(Parcel in) {
        nombre = in.readString();
        foto = in.readString();
        descripcion = in.readString();
    }

    public static final Creator<Tequila> CREATOR = new Creator<Tequila>() {
        @Override
        public Tequila createFromParcel(Parcel in) {
            return new Tequila(in);
        }
        @Override
        public Tequila[] newArray(int size) {
            return new Tequila[size];
        }
    };


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(foto);
        parcel.writeString(descripcion);
    }
}
