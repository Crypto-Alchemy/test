package p000;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\t"}, mo44877d2 = {"Ljava/io/Reader;", "", "c", "Ljava/io/Writer;", "out", "", "bufferSize", "", "a", "kotlin-stdlib"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: eo6 */
/* compiled from: ReadWrite.kt */
public final class eo6 {
    /* renamed from: a */
    public static final long m43999a(Reader reader, Writer writer, int i) {
        vx2.m53591g(reader, "<this>");
        vx2.m53591g(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m44000b(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m43999a(reader, writer, i);
    }

    /* renamed from: c */
    public static final String m44001c(Reader reader) {
        vx2.m53591g(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m44000b(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        vx2.m53590f(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
