package com.example.cristofer.linearyscrollbar5.BD;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class VinculoBD {

    private ObtenerBD bd;
    protected SQLiteDatabase bdInventario;

    public VinculoBD() {
    }

    public VinculoBD(Context context) {
        this.bd = ObtenerBD.getInstance(context);
    }

    protected void open() {
        bd.open();
        this.bdInventario = bd.obtenermiBD();
    }

    protected void close() {
        bd.close();
    }


}
