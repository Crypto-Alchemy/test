package com.fasterxml.jackson.core.p009io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

/* renamed from: com.fasterxml.jackson.core.io.OutputDecorator */
public abstract class OutputDecorator implements Serializable {
    public abstract OutputStream decorate(po2 po2, OutputStream outputStream) throws IOException;

    public abstract Writer decorate(po2 po2, Writer writer) throws IOException;
}
