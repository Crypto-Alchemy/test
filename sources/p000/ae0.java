package p000;

import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0011\u0010\u0015\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, mo44877d2 = {"Lae0;", "", "Ljava/nio/charset/Charset;", "b", "Ljava/nio/charset/Charset;", "UTF_8", "c", "UTF_16", "d", "UTF_16BE", "e", "UTF_16LE", "f", "US_ASCII", "g", "ISO_8859_1", "h", "utf_32le", "i", "utf_32be", "()Ljava/nio/charset/Charset;", "UTF_32LE", "a", "UTF_32BE", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ae0 */
/* compiled from: Charsets.kt */
public final class ae0 {

    /* renamed from: a */
    public static final ae0 f36434a = new ae0();

    /* renamed from: b */
    public static final Charset f36435b;

    /* renamed from: c */
    public static final Charset f36436c;

    /* renamed from: d */
    public static final Charset f36437d;

    /* renamed from: e */
    public static final Charset f36438e;

    /* renamed from: f */
    public static final Charset f36439f;

    /* renamed from: g */
    public static final Charset f36440g;

    /* renamed from: h */
    public static Charset f36441h;

    /* renamed from: i */
    public static Charset f36442i;

    static {
        Charset forName = Charset.forName("UTF-8");
        vx2.m53590f(forName, "forName(\"UTF-8\")");
        f36435b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        vx2.m53590f(forName2, "forName(\"UTF-16\")");
        f36436c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        vx2.m53590f(forName3, "forName(\"UTF-16BE\")");
        f36437d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        vx2.m53590f(forName4, "forName(\"UTF-16LE\")");
        f36438e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        vx2.m53590f(forName5, "forName(\"US-ASCII\")");
        f36439f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        vx2.m53590f(forName6, "forName(\"ISO-8859-1\")");
        f36440g = forName6;
    }

    /* renamed from: a */
    public final Charset mo50140a() {
        Charset charset = f36442i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        vx2.m53590f(forName, "forName(\"UTF-32BE\")");
        f36442i = forName;
        return forName;
    }

    /* renamed from: b */
    public final Charset mo50141b() {
        Charset charset = f36441h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        vx2.m53590f(forName, "forName(\"UTF-32LE\")");
        f36441h = forName;
        return forName;
    }
}
