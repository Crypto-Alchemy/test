package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000*\n\u0010\u0005\"\u00020\u00042\u00020\u0004*\n\u0010\u0007\"\u00020\u00062\u00020\u0006*\n\u0010\t\"\u00020\b2\u00020\b*\n\u0010\u000b\"\u00020\n2\u00020\n*\n\u0010\r\"\u00020\f2\u00020\f¨\u0006\u000e"}, mo44877d2 = {"", "", "b", "a", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Ljava/io/Closeable;", "Closeable", "Ljava/io/EOFException;", "EOFException", "Ljava/io/FileNotFoundException;", "FileNotFoundException", "Ljava/io/IOException;", "IOException", "okio"}, mo44878k = 2, mo44879mv = {1, 5, 1})
/* renamed from: wp7 */
/* compiled from: -JvmPlatform.kt */
public final class wp7 {
    /* renamed from: a */
    public static final byte[] m73729a(String str) {
        vx2.m53591g(str, "<this>");
        byte[] bytes = str.getBytes(ae0.f36435b);
        vx2.m53590f(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: b */
    public static final String m73730b(byte[] bArr) {
        vx2.m53591g(bArr, "<this>");
        return new String(bArr, ae0.f36435b);
    }
}
