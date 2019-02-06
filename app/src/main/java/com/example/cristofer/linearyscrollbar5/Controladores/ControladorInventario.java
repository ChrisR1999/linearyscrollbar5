package com.example.cristofer.linearyscrollbar5.Controladores;

import android.content.Context;
import android.database.Cursor;

import com.example.cristofer.linearyscrollbar5.BD.VinculoBD;
import com.example.cristofer.linearyscrollbar5.Modelos.ModeloInventario;

import java.util.ArrayList;

public class ControladorInventario extends VinculoBD {

    private String tableToUse;

    public ControladorInventario() {
        super();
    }

    public ControladorInventario(Context context, String language) {
        super(context);
        this.tableToUse = language;
    }

    public ArrayList<ModeloInventario> obtenerItems() {
        open();
        Cursor cursor;
        ArrayList<ModeloInventario> inventary = new ArrayList<>();
        if (tableToUse.equals("es"))
            cursor = bdInventario.rawQuery("" +
                    "SELECT id, joya, habilidad " +
                    "FROM joyasEs " +
                    "ORDER BY id", null);
        else
            cursor = bdInventario.rawQuery("" +
                    "SELECT id, joya, habilidad " +
                    "FROM joyasEn " +
                    "ORDER BY id", null);
        if (cursor.moveToFirst()) {
            while (!cursor.isAfterLast()) {
                final ModeloInventario model = new ModeloInventario();
                model.setId(cursor.getInt(0));
                model.setNombre(cursor.getString(1));
                model.setHabilidad(cursor.getString(2));
                inventary.add(model);
                cursor.moveToNext();
            }
            cursor.close();
            close();
            return inventary;
        } else {
            return null;
        }

    }

    public ArrayList<ModeloInventario> obtenerPropiedadesItems() {
        open();
        Cursor cursor;
        ArrayList<ModeloInventario> itemData = new ArrayList<>();
        if (tableToUse.equals("es"))
            cursor = bdInventario.rawQuery("" +
                            "SELECT nivelmax, slot, rarity " +
                            "FROM joyasEs " +
                            "ORDER BY id "
                    , null);
        else
            cursor = bdInventario.rawQuery("" +
                            "SELECT nivelmax, slot, rarity " +
                            "FROM joyasEn " +
                            "ORDER BY id "
                    , null);
        if (cursor.moveToFirst()) {
            while (!cursor.isAfterLast()) {
                final ModeloInventario model = new ModeloInventario();
                model.setId(cursor.getInt(0));
                model.setNombre(cursor.getString(1));
                model.setHabilidad(cursor.getString(2));
                itemData.add(model);
                cursor.moveToNext();
            }
            cursor.close();
            close();
            return itemData;
        } else {
            return null;
        }

    }
}