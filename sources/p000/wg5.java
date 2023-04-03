package p000;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0006J \u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lwg5;", "T", "Lp6;", "", "index", "get", "(I)Ljava/lang/Object;", "Lr37;", "clear", "removeAt", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "add", "(ILjava/lang/Object;)V", "", "a", "Ljava/util/List;", "delegate", "getSize", "()I", "size", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: wg5 */
/* compiled from: ReversedViews.kt */
public final class wg5<T> extends C6341p6<T> {

    /* renamed from: a */
    public final List<T> f35323a;

    public wg5(List<T> list) {
        vx2.m53591g(list, "delegate");
        this.f35323a = list;
    }

    public void add(int i, T t) {
        this.f35323a.add(ik0.m45744N(this, i), t);
    }

    public void clear() {
        this.f35323a.clear();
    }

    public T get(int i) {
        return this.f35323a.get(ik0.m45743M(this, i));
    }

    public int getSize() {
        return this.f35323a.size();
    }

    public T removeAt(int i) {
        return this.f35323a.remove(ik0.m45743M(this, i));
    }

    public T set(int i, T t) {
        return this.f35323a.set(ik0.m45743M(this, i), t);
    }
}
