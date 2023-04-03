package p000;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
import p000.mp6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0010\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR$\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e8F@BX\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\u001b\u0010\u0016R\u0011\u0010%\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, mo44877d2 = {"Llp6;", "Lmp6;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "e", "()Lmp6;", "i", "node", "", "g", "(Lmp6;)Z", "b", "", "index", "h", "(I)Lmp6;", "Lr37;", "a", "(Lmp6;)V", "l", "(I)V", "k", "", "f", "()[Lmp6;", "j", "m", "(II)V", "[Lmp6;", "value", "c", "()I", "size", "d", "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: lp6 */
/* compiled from: ThreadSafeHeap.kt */
public class lp6<T extends mp6 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    public T[] f40677a;

    /* renamed from: a */
    public final void mo55952a(T t) {
        t.mo55609e(this);
        mp6[] f = mo55957f();
        int c = mo55954c();
        mo55961j(c + 1);
        f[c] = t;
        t.setIndex(c);
        mo55963l(c);
    }

    /* renamed from: b */
    public final T mo55953b() {
        T[] tArr = this.f40677a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int mo55954c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean mo55955d() {
        if (mo55954c() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final T mo55956e() {
        T b;
        synchronized (this) {
            b = mo55953b();
        }
        return b;
    }

    /* renamed from: f */
    public final T[] mo55957f() {
        T[] tArr = this.f40677a;
        if (tArr == null) {
            T[] tArr2 = new mp6[4];
            this.f40677a = tArr2;
            return tArr2;
        } else if (mo55954c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo55954c() * 2);
            vx2.m53590f(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (mp6[]) copyOf;
            this.f40677a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: g */
    public final boolean mo55958g(T t) {
        boolean z;
        synchronized (this) {
            if (t.mo55607a() == null) {
                z = false;
            } else {
                mo55959h(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public final T mo55959h(int i) {
        T[] tArr = this.f40677a;
        vx2.m53588d(tArr);
        mo55961j(mo55954c() - 1);
        if (i < mo55954c()) {
            mo55964m(i, mo55954c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                vx2.m53588d(t);
                T t2 = tArr[i2];
                vx2.m53588d(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    mo55964m(i, i2);
                    mo55963l(i2);
                }
            }
            mo55962k(i);
        }
        T t3 = tArr[mo55954c()];
        vx2.m53588d(t3);
        t3.mo55609e((lp6<?>) null);
        t3.setIndex(-1);
        tArr[mo55954c()] = null;
        return t3;
    }

    /* renamed from: i */
    public final T mo55960i() {
        T t;
        synchronized (this) {
            if (mo55954c() > 0) {
                t = mo55959h(0);
            } else {
                t = null;
            }
        }
        return t;
    }

    /* renamed from: j */
    public final void mo55961j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    public final void mo55962k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo55954c()) {
                T[] tArr = this.f40677a;
                vx2.m53588d(tArr);
                int i3 = i2 + 1;
                if (i3 < mo55954c()) {
                    T t = tArr[i3];
                    vx2.m53588d(t);
                    T t2 = tArr[i2];
                    vx2.m53588d(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                vx2.m53588d(t3);
                T t4 = tArr[i2];
                vx2.m53588d(t4);
                if (((Comparable) t3).compareTo(t4) > 0) {
                    mo55964m(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    public final void mo55963l(int i) {
        while (i > 0) {
            T[] tArr = this.f40677a;
            vx2.m53588d(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            vx2.m53588d(t);
            T t2 = tArr[i];
            vx2.m53588d(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                mo55964m(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    public final void mo55964m(int i, int i2) {
        T[] tArr = this.f40677a;
        vx2.m53588d(tArr);
        T t = tArr[i2];
        vx2.m53588d(t);
        T t2 = tArr[i];
        vx2.m53588d(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
