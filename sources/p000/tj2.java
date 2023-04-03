package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u001a"}, mo44877d2 = {"Ltj2;", "", "Lzn0;", "", "hasNext", "a", "Lr37;", "b", "Lq46;", "Lq46;", "getTable", "()Lq46;", "table", "", "d", "I", "getEnd", "()I", "end", "e", "index", "g", "version", "start", "<init>", "(Lq46;II)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: tj2 */
/* compiled from: SlotTable.kt */
public final class tj2 implements Iterator<zn0>, a93 {

    /* renamed from: a */
    public final q46 f18154a;

    /* renamed from: d */
    public final int f18155d;

    /* renamed from: e */
    public int f18156e;

    /* renamed from: g */
    public final int f18157g;

    public tj2(q46 q46, int i, int i2) {
        vx2.m53591g(q46, "table");
        this.f18154a = q46;
        this.f18155d = i2;
        this.f18156e = i;
        this.f18157g = q46.mo24941w();
        if (q46.mo24924A()) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public zn0 next() {
        mo26460b();
        int i = this.f18156e;
        this.f18156e = s46.m26597G(this.f18154a.mo24937r(), i) + i;
        return new r46(this.f18154a, i, this.f18157g);
    }

    /* renamed from: b */
    public final void mo26460b() {
        if (this.f18154a.mo24941w() != this.f18157g) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        if (this.f18156e < this.f18155d) {
            return true;
        }
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
