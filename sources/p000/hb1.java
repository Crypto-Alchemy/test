package p000;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, mo44877d2 = {"Lhb1;", "Ls36;", "Lm40;", "source", "", "byteCount", "Lr37;", "write", "flush", "b", "()V", "close", "Lqq6;", "timeout", "", "toString", "", "syncFlush", "a", "Lv40;", "Lv40;", "sink", "Ljava/util/zip/Deflater;", "d", "Ljava/util/zip/Deflater;", "deflater", "e", "Z", "closed", "<init>", "(Lv40;Ljava/util/zip/Deflater;)V", "(Ls36;Ljava/util/zip/Deflater;)V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: hb1 */
/* compiled from: DeflaterSink.kt */
public final class hb1 implements s36 {

    /* renamed from: a */
    public final v40 f38187a;

    /* renamed from: d */
    public final Deflater f38188d;

    /* renamed from: e */
    public boolean f38189e;

    public hb1(v40 v40, Deflater deflater) {
        vx2.m53591g(v40, "sink");
        vx2.m53591g(deflater, "deflater");
        this.f38187a = v40;
        this.f38188d = deflater;
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    public final void mo52170a(boolean z) {
        ct5 O;
        int i;
        m40 r = this.f38187a.mo56081r();
        while (true) {
            O = r.mo56033O(1);
            if (z) {
                Deflater deflater = this.f38188d;
                byte[] bArr = O.f37200a;
                int i2 = O.f37202c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f38188d;
                byte[] bArr2 = O.f37200a;
                int i3 = O.f37202c;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                O.f37202c += i;
                r.mo56027K(r.size() + ((long) i));
                this.f38187a.mo56039U();
            } else if (this.f38188d.needsInput()) {
                break;
            }
        }
        if (O.f37201b == O.f37202c) {
            r.f40752a = O.mo51003b();
            et5.m57488b(O);
        }
    }

    /* renamed from: b */
    public final void mo52171b() {
        this.f38188d.finish();
        mo52170a(false);
    }

    public void close() throws IOException {
        if (!this.f38189e) {
            Throwable th = null;
            try {
                mo52171b();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f38188d.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f38187a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f38189e = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() throws IOException {
        mo52170a(true);
        this.f38187a.flush();
    }

    public qq6 timeout() {
        return this.f38187a.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f38187a + ')';
    }

    public void write(m40 m40, long j) throws IOException {
        vx2.m53591g(m40, "source");
        zp7.m75204b(m40.size(), 0, j);
        while (j > 0) {
            ct5 ct5 = m40.f40752a;
            vx2.m53588d(ct5);
            int min = (int) Math.min(j, (long) (ct5.f37202c - ct5.f37201b));
            this.f38188d.setInput(ct5.f37200a, ct5.f37201b, min);
            mo52170a(false);
            long j2 = (long) min;
            m40.mo56027K(m40.size() - j2);
            int i = ct5.f37201b + min;
            ct5.f37201b = i;
            if (i == ct5.f37202c) {
                m40.f40752a = ct5.mo51003b();
                et5.m57488b(ct5);
            }
            j -= j2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public hb1(s36 s36, Deflater deflater) {
        this(sg4.m71928c(s36), deflater);
        vx2.m53591g(s36, "sink");
        vx2.m53591g(deflater, "deflater");
    }
}
