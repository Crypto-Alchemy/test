package p000;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0010J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0015j\b\u0012\u0004\u0012\u00028\u0000`\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lt76;", "T", "", "value", "", "h", "(Ljava/lang/Object;)Z", "g", "()Ljava/lang/Object;", "e", "", "index", "f", "(I)Ljava/lang/Object;", "c", "d", "Lr37;", "a", "", "i", "()[Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "backing", "b", "()I", "size", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: t76 */
/* compiled from: Stack.kt */
public final class t76<T> {

    /* renamed from: a */
    public final ArrayList<T> f17978a = new ArrayList<>();

    /* renamed from: a */
    public final void mo26177a() {
        this.f17978a.clear();
    }

    /* renamed from: b */
    public final int mo26178b() {
        return this.f17978a.size();
    }

    /* renamed from: c */
    public final boolean mo26179c() {
        return this.f17978a.isEmpty();
    }

    /* renamed from: d */
    public final boolean mo26180d() {
        return !mo26179c();
    }

    /* renamed from: e */
    public final T mo26181e() {
        return this.f17978a.get(mo26178b() - 1);
    }

    /* renamed from: f */
    public final T mo26182f(int i) {
        return this.f17978a.get(i);
    }

    /* renamed from: g */
    public final T mo26183g() {
        return this.f17978a.remove(mo26178b() - 1);
    }

    /* renamed from: h */
    public final boolean mo26184h(T t) {
        return this.f17978a.add(t);
    }

    /* renamed from: i */
    public final T[] mo26185i() {
        int size = this.f17978a.size();
        T[] tArr = new Object[size];
        for (int i = 0; i < size; i++) {
            tArr[i] = this.f17978a.get(i);
        }
        return tArr;
    }
}
