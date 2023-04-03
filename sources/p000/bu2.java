package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001fJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0002R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, mo44877d2 = {"Lbu2;", "Lz56;", "Lm40;", "sink", "", "byteCount", "read", "a", "", "b", "Lqq6;", "timeout", "Lr37;", "close", "c", "Lw40;", "Lw40;", "source", "Ljava/util/zip/Inflater;", "d", "Ljava/util/zip/Inflater;", "inflater", "", "e", "I", "bufferBytesHeldByInflater", "g", "Z", "closed", "<init>", "(Lw40;Ljava/util/zip/Inflater;)V", "(Lz56;Ljava/util/zip/Inflater;)V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: bu2 */
/* compiled from: InflaterSource.kt */
public final class bu2 implements z56 {

    /* renamed from: a */
    public final w40 f36956a;

    /* renamed from: d */
    public final Inflater f36957d;

    /* renamed from: e */
    public int f36958e;

    /* renamed from: g */
    public boolean f36959g;

    public bu2(w40 w40, Inflater inflater) {
        vx2.m53591g(w40, "source");
        vx2.m53591g(inflater, "inflater");
        this.f36956a = w40;
        this.f36957d = inflater;
    }

    /* renamed from: a */
    public final long mo50729a(m40 m40, long j) throws IOException {
        boolean z;
        vx2.m53591g(m40, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(vx2.m53598n("byteCount < 0: ", Long.valueOf(j)).toString());
        } else if (!(!this.f36959g)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0;
        } else {
            try {
                ct5 O = m40.mo56033O(1);
                mo50730b();
                int inflate = this.f36957d.inflate(O.f37200a, O.f37202c, (int) Math.min(j, (long) (8192 - O.f37202c)));
                mo50731c();
                if (inflate > 0) {
                    O.f37202c += inflate;
                    long j2 = (long) inflate;
                    m40.mo56027K(m40.size() + j2);
                    return j2;
                }
                if (O.f37201b == O.f37202c) {
                    m40.f40752a = O.mo51003b();
                    et5.m57488b(O);
                }
                return 0;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo50730b() throws IOException {
        if (!this.f36957d.needsInput()) {
            return false;
        }
        if (this.f36956a.mo56024I0()) {
            return true;
        }
        ct5 ct5 = this.f36956a.mo56081r().f40752a;
        vx2.m53588d(ct5);
        int i = ct5.f37202c;
        int i2 = ct5.f37201b;
        int i3 = i - i2;
        this.f36958e = i3;
        this.f36957d.setInput(ct5.f37200a, i2, i3);
        return false;
    }

    /* renamed from: c */
    public final void mo50731c() {
        int i = this.f36958e;
        if (i != 0) {
            int remaining = i - this.f36957d.getRemaining();
            this.f36958e -= remaining;
            this.f36956a.skip((long) remaining);
        }
    }

    public void close() throws IOException {
        if (!this.f36959g) {
            this.f36957d.end();
            this.f36959g = true;
            this.f36956a.close();
        }
    }

    public long read(m40 m40, long j) throws IOException {
        vx2.m53591g(m40, "sink");
        do {
            long a = mo50729a(m40, j);
            if (a > 0) {
                return a;
            }
            if (this.f36957d.finished() || this.f36957d.needsDictionary()) {
                return -1;
            }
        } while (!this.f36956a.mo56024I0());
        throw new EOFException("source exhausted prematurely");
    }

    public qq6 timeout() {
        return this.f36956a.timeout();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public bu2(z56 z56, Inflater inflater) {
        this(sg4.m71929d(z56), inflater);
        vx2.m53591g(z56, "source");
        vx2.m53591g(inflater, "inflater");
    }
}
