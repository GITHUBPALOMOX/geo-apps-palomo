package com.enriquepalomo.android.model;

/**
 * Created by jonathan on 05/06/16.
 */

public class Pregunta {
    private Integer mIdResTexto;
    private boolean mRespuestaVerdadera;

    public Pregunta(Integer mIdRes, boolean mRespuestaVerdadera) {
        this.mIdResTexto = mIdRes;
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }

    public Integer getIdResTexto() {
        return mIdResTexto;
    }

    public boolean isVerdadera() {
        return mRespuestaVerdadera;
    }

    public void setIdResTexto(Integer idResTexto) {
        this.mIdResTexto = idResTexto;
    }

    public void setRespuestaVerdadera(Boolean respuestaVerdadera) {
        this.mRespuestaVerdadera = respuestaVerdadera;
    }
}
