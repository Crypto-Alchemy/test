package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Lr46;", "Lzn0;", "", "", "iterator", "Lr37;", "e", "Lq46;", "a", "Lq46;", "getTable", "()Lq46;", "table", "", "d", "I", "getGroup", "()I", "group", "getVersion", "version", "<init>", "(Lq46;II)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: r46 */
/* compiled from: SlotTable.kt */
public final class r46 implements zn0, Iterable<zn0>, a93 {

    /* renamed from: a */
    public final q46 f17123a;

    /* renamed from: d */
    public final int f17124d;

    /* renamed from: e */
    public final int f17125e;

    public r46(q46 q46, int i, int i2) {
        vx2.m53591g(q46, "table");
        this.f17123a = q46;
        this.f17124d = i;
        this.f17125e = i2;
    }

    /* renamed from: e */
    public final void mo25326e() {
        if (this.f17123a.mo24941w() != this.f17125e) {
            throw new ConcurrentModificationException();
        }
    }

    public Iterator<zn0> iterator() {
        mo25326e();
        q46 q46 = this.f17123a;
        int i = this.f17124d;
        return new tj2(q46, i + 1, i + s46.m26597G(q46.mo24937r(), this.f17124d));
    }
}
