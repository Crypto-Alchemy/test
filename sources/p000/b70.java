package p000;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, mo44877d2 = {"Ljava/io/InputStream;", "Ljava/io/OutputStream;", "out", "", "bufferSize", "", "a", "kotlin-stdlib"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: b70 */
/* compiled from: IOStreams.kt */
public final class b70 {
    /* renamed from: a */
    public static final long m32368a(InputStream inputStream, OutputStream outputStream, int i) {
        vx2.m53591g(inputStream, "<this>");
        vx2.m53591g(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }
}
