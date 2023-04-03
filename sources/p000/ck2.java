package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J \u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, mo44877d2 = {"Lck2;", "Lz56;", "Lm40;", "sink", "", "byteCount", "read", "Lqq6;", "timeout", "Lr37;", "close", "b", "c", "buffer", "offset", "d", "", "name", "", "expected", "actual", "a", "", "B", "section", "Lv75;", "Lv75;", "source", "Ljava/util/zip/Inflater;", "e", "Ljava/util/zip/Inflater;", "inflater", "Lbu2;", "g", "Lbu2;", "inflaterSource", "Ljava/util/zip/CRC32;", "k", "Ljava/util/zip/CRC32;", "crc", "<init>", "(Lz56;)V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: ck2 */
/* compiled from: GzipSource.kt */
public final class ck2 implements z56 {

    /* renamed from: a */
    public byte f37157a;

    /* renamed from: d */
    public final v75 f37158d;

    /* renamed from: e */
    public final Inflater f37159e;

    /* renamed from: g */
    public final bu2 f37160g;

    /* renamed from: k */
    public final CRC32 f37161k = new CRC32();

    public ck2(z56 z56) {
        vx2.m53591g(z56, "source");
        v75 v75 = new v75(z56);
        this.f37158d = v75;
        Inflater inflater = new Inflater(true);
        this.f37159e = inflater;
        this.f37160g = new bu2((w40) v75, inflater);
    }

    /* renamed from: a */
    public final void mo50910a(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            vx2.m53590f(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: b */
    public final void mo50911b() throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        this.f37158d.mo56094u0(10);
        byte j = this.f37158d.f45233d.mo56066j(3);
        boolean z4 = true;
        if (((j >> 1) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo50913d(this.f37158d.f45233d, 0, 10);
        }
        mo50910a("ID1ID2", 8075, this.f37158d.readShort());
        this.f37158d.skip(8);
        if (((j >> 2) & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f37158d.mo56094u0(2);
            if (z) {
                mo50913d(this.f37158d.f45233d, 0, 2);
            }
            long C = (long) this.f37158d.f45233d.mo56018C();
            this.f37158d.mo56094u0(C);
            if (z) {
                mo50913d(this.f37158d.f45233d, 0, C);
            }
            this.f37158d.skip(C);
        }
        if (((j >> 3) & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            long a = this.f37158d.mo66426a((byte) 0);
            if (a != -1) {
                if (z) {
                    mo50913d(this.f37158d.f45233d, 0, a + 1);
                }
                this.f37158d.skip(a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((j >> 4) & 1) != 1) {
            z4 = false;
        }
        if (z4) {
            long a2 = this.f37158d.mo66426a((byte) 0);
            if (a2 != -1) {
                if (z) {
                    mo50913d(this.f37158d.f45233d, 0, a2 + 1);
                }
                this.f37158d.skip(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            mo50910a("FHCRC", this.f37158d.mo66432g(), (short) ((int) this.f37161k.getValue()));
            this.f37161k.reset();
        }
    }

    /* renamed from: c */
    public final void mo50912c() throws IOException {
        mo50910a("CRC", this.f37158d.mo66431f(), (int) this.f37161k.getValue());
        mo50910a("ISIZE", this.f37158d.mo66431f(), (int) this.f37159e.getBytesWritten());
    }

    public void close() throws IOException {
        this.f37160g.close();
    }

    /* renamed from: d */
    public final void mo50913d(m40 m40, long j, long j2) {
        ct5 ct5 = m40.f40752a;
        vx2.m53588d(ct5);
        while (true) {
            int i = ct5.f37202c;
            int i2 = ct5.f37201b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            ct5 = ct5.f37205f;
            vx2.m53588d(ct5);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) ct5.f37201b) + j);
            int min = (int) Math.min((long) (ct5.f37202c - i3), j2);
            this.f37161k.update(ct5.f37200a, i3, min);
            j2 -= (long) min;
            ct5 = ct5.f37205f;
            vx2.m53588d(ct5);
            j = 0;
        }
    }

    public long read(m40 m40, long j) throws IOException {
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
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f37157a == 0) {
                mo50911b();
                this.f37157a = 1;
            }
            if (this.f37157a == 1) {
                long size = m40.size();
                long read = this.f37160g.read(m40, j);
                if (read != -1) {
                    mo50913d(m40, size, read);
                    return read;
                }
                this.f37157a = 2;
            }
            if (this.f37157a == 2) {
                mo50912c();
                this.f37157a = 3;
                if (!this.f37158d.mo56024I0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public qq6 timeout() {
        return this.f37158d.timeout();
    }
}
