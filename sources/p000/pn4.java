package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 \u0012\u001e\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00110\u0010¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0005\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002R2\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00110\u00108\u0004X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\n8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f¨\u0006$"}, mo44877d2 = {"Lpn4;", "K", "V", "T", "", "b", "()Ljava/lang/Object;", "", "hasNext", "next", "", "pathIndex", "f", "Lr37;", "c", "a", "", "Lvx6;", "[Lvx6;", "d", "()[Lvx6;", "path", "I", "getPathLastIndex", "()I", "g", "(I)V", "pathLastIndex", "e", "Z", "getHasNext$annotations", "()V", "Lux6;", "node", "<init>", "(Lux6;[Lvx6;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: pn4 */
/* compiled from: PersistentHashMapContentIterators.kt */
public abstract class pn4<K, V, T> implements Iterator<T>, a93 {

    /* renamed from: a */
    public final vx6<K, V, T>[] f16584a;

    /* renamed from: d */
    public int f16585d;

    /* renamed from: e */
    public boolean f16586e = true;

    public pn4(ux6<K, V> ux6, vx6<K, V, T>[] vx6Arr) {
        vx2.m53591g(ux6, "node");
        vx2.m53591g(vx6Arr, "path");
        this.f16584a = vx6Arr;
        vx6Arr[0].mo27370j(ux6.mo26923p(), ux6.mo26920m() * 2);
        this.f16585d = 0;
        mo24724c();
    }

    /* renamed from: a */
    public final void mo24722a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: b */
    public final K mo24723b() {
        mo24722a();
        return this.f16584a[this.f16585d].mo27361a();
    }

    /* renamed from: c */
    public final void mo24724c() {
        if (!this.f16584a[this.f16585d].mo27365f()) {
            for (int i = this.f16585d; -1 < i; i--) {
                int f = mo24726f(i);
                if (f == -1 && this.f16584a[i].mo27366g()) {
                    this.f16584a[i].mo27369i();
                    f = mo24726f(i);
                }
                if (f != -1) {
                    this.f16585d = f;
                    return;
                }
                if (i > 0) {
                    this.f16584a[i - 1].mo27369i();
                }
                this.f16584a[i].mo27370j(ux6.f18594e.mo26934a().mo26923p(), 0);
            }
            this.f16586e = false;
        }
    }

    /* renamed from: d */
    public final vx6<K, V, T>[] mo24725d() {
        return this.f16584a;
    }

    /* renamed from: f */
    public final int mo24726f(int i) {
        if (this.f16584a[i].mo27365f()) {
            return i;
        }
        if (!this.f16584a[i].mo27366g()) {
            return -1;
        }
        ux6<? extends K, ? extends V> b = this.f16584a[i].mo27362b();
        if (i == 6) {
            this.f16584a[i + 1].mo27370j(b.mo26923p(), b.mo26923p().length);
        } else {
            this.f16584a[i + 1].mo27370j(b.mo26923p(), b.mo26920m() * 2);
        }
        return mo24726f(i + 1);
    }

    /* renamed from: g */
    public final void mo24727g(int i) {
        this.f16585d = i;
    }

    public boolean hasNext() {
        return this.f16586e;
    }

    public T next() {
        mo24722a();
        T next = this.f16584a[this.f16585d].next();
        mo24724c();
        return next;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
