package p000;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p009io.SerializedString;
import com.fasterxml.jackson.core.util.Separators;
import java.io.IOException;

/* renamed from: su4 */
/* compiled from: PrettyPrinter */
public interface su4 {

    /* renamed from: q */
    public static final Separators f17808q = Separators.createDefaultInstance();

    /* renamed from: t */
    public static final SerializedString f17809t = new SerializedString(" ");

    void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException;

    void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException;

    void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException;

    void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException;

    void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException;

    void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException;

    void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException;

    void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException;

    void writeStartArray(JsonGenerator jsonGenerator) throws IOException;

    void writeStartObject(JsonGenerator jsonGenerator) throws IOException;
}
