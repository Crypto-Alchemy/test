package com.fasterxml.jackson.core.p009io;

import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;

/* renamed from: com.fasterxml.jackson.core.io.InputDecorator */
public abstract class InputDecorator implements Serializable {
    private static final long serialVersionUID = 1;

    public DataInput decorate(po2 po2, DataInput dataInput) throws IOException {
        throw new UnsupportedOperationException();
    }

    public abstract InputStream decorate(po2 po2, InputStream inputStream) throws IOException;

    public abstract InputStream decorate(po2 po2, byte[] bArr, int i, int i2) throws IOException;

    public abstract Reader decorate(po2 po2, Reader reader) throws IOException;
}
