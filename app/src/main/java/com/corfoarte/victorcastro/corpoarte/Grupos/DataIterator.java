package com.corfoarte.victorcastro.corpoarte.Grupos;

import com.corfoarte.victorcastro.corpoarte.io.Response.GruposResponse;

import java.util.Iterator;


/**
 * Created by Victor Castro on 15/07/2017.
 */

public class DataIterator<T> implements Iterable<GruposResponse> {
    private GruposResponse data;
    private int location = 0;

    public DataIterator(GruposResponse d) {
        data = d;
    }

    @Override
    public Iterator<GruposResponse> iterator() {
        Iterator it = new MiIteratorDate();
        return it;
    }


    protected class MiIteratorDate implements Iterator<GruposResponse> {
        @Override
        public boolean hasNext() {

            if (data.getData().getAttributes() != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public GruposResponse next() {
            return data;
        }
    }
}
