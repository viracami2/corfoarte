package com.corfoarte.victorcastro.corpoarte.io.CrearGrupos;

/**
 * Created by Victor Castro on 16/07/2017.
 */


public class Grupos {

    private Bagpipe bagpipe;

    /**
     * No args constructor for use in serialization
     */
    public Grupos() {
    }

    /**
     * @param bagpipe
     */
    public Grupos(Bagpipe bagpipe) {
        super();
        this.bagpipe = bagpipe;
    }

    public Bagpipe getBagpipe() {
        return bagpipe;
    }

    public void setBagpipe(Bagpipe bagpipe) {
        this.bagpipe = bagpipe;
    }

}