package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p009io.SerializedString;
import java.io.IOException;
import java.io.Serializable;

public class DefaultPrettyPrinter implements su4, ew2<DefaultPrettyPrinter>, Serializable {
    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
    private static final long serialVersionUID = 1;
    public C1981a _arrayIndenter;
    public transient int _nesting;
    public String _objectFieldValueSeparatorWithSpaces;
    public C1981a _objectIndenter;
    public final qw5 _rootSeparator;
    public Separators _separators;
    public boolean _spacesInObjectEntries;

    public static class FixedSpaceIndenter extends NopIndenter {
        public static final FixedSpaceIndenter instance = new FixedSpaceIndenter();

        public boolean isInline() {
            return true;
        }

        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
            jsonGenerator.mo13902y0(' ');
        }
    }

    public static class NopIndenter implements C1981a, Serializable {
        public static final NopIndenter instance = new NopIndenter();

        public boolean isInline() {
            return true;
        }

        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
        }
    }

    /* renamed from: com.fasterxml.jackson.core.util.DefaultPrettyPrinter$a */
    public interface C1981a {
        boolean isInline();

        void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException;
    }

    public DefaultPrettyPrinter() {
        this((qw5) DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    public DefaultPrettyPrinter _withSpaces(boolean z) {
        if (this._spacesInObjectEntries == z) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._spacesInObjectEntries = z;
        return defaultPrettyPrinter;
    }

    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void indentArraysWith(C1981a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        this._arrayIndenter = aVar;
    }

    public void indentObjectsWith(C1981a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        this._objectIndenter = aVar;
    }

    public DefaultPrettyPrinter withArrayIndenter(C1981a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        if (this._arrayIndenter == aVar) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._arrayIndenter = aVar;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withObjectIndenter(C1981a aVar) {
        if (aVar == null) {
            aVar = NopIndenter.instance;
        }
        if (this._objectIndenter == aVar) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._objectIndenter = aVar;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withRootSeparator(qw5 qw5) {
        qw5 qw52 = this._rootSeparator;
        return (qw52 == qw5 || (qw5 != null && qw5.equals(qw52))) ? this : new DefaultPrettyPrinter(this, qw5);
    }

    public DefaultPrettyPrinter withSeparators(Separators separators) {
        this._separators = separators;
        this._objectFieldValueSeparatorWithSpaces = " " + separators.getObjectFieldValueSeparator() + " ";
        return this;
    }

    public DefaultPrettyPrinter withSpacesInObjectEntries() {
        return _withSpaces(true);
    }

    public DefaultPrettyPrinter withoutSpacesInObjectEntries() {
        return _withSpaces(false);
    }

    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo13902y0(this._separators.getArrayValueSeparator());
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.mo13902y0(' ');
        }
        jsonGenerator.mo13902y0(']');
    }

    public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this._objectIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.mo13902y0(' ');
        }
        jsonGenerator.mo13902y0('}');
    }

    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo13902y0(this._separators.getObjectEntrySeparator());
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        if (this._spacesInObjectEntries) {
            jsonGenerator.mo13834B0(this._objectFieldValueSeparatorWithSpaces);
        } else {
            jsonGenerator.mo13902y0(this._separators.getObjectFieldValueSeparator());
        }
    }

    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        qw5 qw5 = this._rootSeparator;
        if (qw5 != null) {
            jsonGenerator.mo13833A0(qw5);
        }
    }

    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting++;
        }
        jsonGenerator.mo13902y0('[');
    }

    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo13902y0('{');
        if (!this._objectIndenter.isInline()) {
            this._nesting++;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultPrettyPrinter(String str) {
        this((qw5) str == null ? null : new SerializedString(str));
    }

    public DefaultPrettyPrinter createInstance() {
        if (getClass() == DefaultPrettyPrinter.class) {
            return new DefaultPrettyPrinter(this);
        }
        throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
    }

    public DefaultPrettyPrinter(qw5 qw5) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._rootSeparator = qw5;
        withSeparators(su4.f17808q);
    }

    public DefaultPrettyPrinter withRootSeparator(String str) {
        return withRootSeparator((qw5) str == null ? null : new SerializedString(str));
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        this(defaultPrettyPrinter, defaultPrettyPrinter._rootSeparator);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter, qw5 qw5) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        this._objectIndenter = defaultPrettyPrinter._objectIndenter;
        this._spacesInObjectEntries = defaultPrettyPrinter._spacesInObjectEntries;
        this._nesting = defaultPrettyPrinter._nesting;
        this._separators = defaultPrettyPrinter._separators;
        this._objectFieldValueSeparatorWithSpaces = defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces;
        this._rootSeparator = qw5;
    }
}
