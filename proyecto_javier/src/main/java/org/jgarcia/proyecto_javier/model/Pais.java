package org.jgarcia.proyecto_javier.model;

public class Pais {

    private String pais;
    private String idioma;
    private String prefijoTelefonicoPais;
    private boolean muestraIdioma;
    private String nombreArchivoBandera;

    public Pais(String pais, String idioma, String prefijoTelefonicoPais, boolean muestraIdioma, String nombreArchivoBandera) {
        this.pais = pais;
        this.idioma = idioma;
        this.prefijoTelefonicoPais = prefijoTelefonicoPais;
        this.muestraIdioma = muestraIdioma;
        this.nombreArchivoBandera = nombreArchivoBandera;
    }

    // Getters y Setters
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPrefijoTelefonicoPais() {
        return prefijoTelefonicoPais;
    }

    public void setPrefijoTelefonicoPais(String prefijoTelefonicoPais) {
        this.prefijoTelefonicoPais = prefijoTelefonicoPais;
    }

    public boolean isMuestraIdioma() {
        return muestraIdioma;
    }

    public void setMuestraIdioma(boolean muestraIdioma) {
        this.muestraIdioma = muestraIdioma;
    }

    public String getNombreArchivoBandera() {
        return nombreArchivoBandera;
    }

    public void setNombreArchivoBandera(String nombreArchivoBandera) {
        this.nombreArchivoBandera = nombreArchivoBandera;
    }
}
