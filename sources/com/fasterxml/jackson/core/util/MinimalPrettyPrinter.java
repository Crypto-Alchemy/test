package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.io.Serializable;

public class MinimalPrettyPrinter implements su4, Serializable {
    private static final long serialVersionUID = 1;
    public String _rootValueSeparator;
    public Separators _separators;

    public MinimalPrettyPrinter() {
        this(su4.f17809t.toString());
    }

    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
    }

    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
    }

    public void setRootValueSeparator(String str) {
        this._rootValueSeparator = str;
    }

    public MinimalPrettyPrinter setSeparators(Separators separators) {
        this._separators = separators;
        return this;
    }

    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo13902y0(this._separators.getArrayValueSeparator());
    }

    public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.mo13902y0(']');
    }

    public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.mo13902y0('}');
    }

    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo13902y0(this._separators.getObjectEntrySeparator());
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo13902y0(this._separators.getObjectFieldValueSeparator());
    }

    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        String str = this._rootValueSeparator;
        if (str != null) {
            jsonGenerator.mo13834B0(str);
        }
    }

    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo13902y0('[');
    }

    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo13902y0('{');
    }

    public MinimalPrettyPrinter(String str) {
        this._rootValueSeparator = str;
        this._separators = su4.f17808q;
    }
}
