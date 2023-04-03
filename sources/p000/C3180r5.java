package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\u0004H$R\u0017\u0010\u000e\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R*\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00008\u0016@TX\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0006¨\u0006\u0019"}, mo44877d2 = {"Lr5;", "T", "Ltp;", "node", "Lr37;", "f", "(Ljava/lang/Object;)V", "h", "clear", "k", "a", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "root", "", "b", "Ljava/util/List;", "stack", "<set-?>", "c", "i", "l", "current", "<init>", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: r5 */
/* compiled from: Applier.kt */
public abstract class C3180r5<T> implements C3379tp<T> {

    /* renamed from: a */
    public final T f17126a;

    /* renamed from: b */
    public final List<T> f17127b = new ArrayList();

    /* renamed from: c */
    public T f17128c;

    public C3180r5(T t) {
        this.f17126a = t;
        this.f17128c = t;
    }

    public final void clear() {
        this.f17127b.clear();
        mo25334l(this.f17126a);
        mo20937k();
    }

    /* renamed from: d */
    public /* synthetic */ void mo20935d() {
        C3295sp.m27063b(this);
    }

    /* renamed from: f */
    public void mo25329f(T t) {
        this.f17127b.add(mo25332i());
        mo25334l(t);
    }

    /* renamed from: g */
    public /* synthetic */ void mo25330g() {
        C3295sp.m27062a(this);
    }

    /* renamed from: h */
    public void mo25331h() {
        if (!this.f17127b.isEmpty()) {
            List<T> list = this.f17127b;
            mo25334l(list.remove(list.size() - 1));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: i */
    public T mo25332i() {
        return this.f17128c;
    }

    /* renamed from: j */
    public final T mo25333j() {
        return this.f17126a;
    }

    /* renamed from: k */
    public abstract void mo20937k();

    /* renamed from: l */
    public void mo25334l(T t) {
        this.f17128c = t;
    }
}
