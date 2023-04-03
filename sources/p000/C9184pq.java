package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0002R\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lpq;", "", "T", "element", "Lr37;", "a", "(Ljava/lang/Object;)V", "d", "()Ljava/lang/Object;", "b", "", "[Ljava/lang/Object;", "elements", "", "I", "head", "c", "tail", "", "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: pq */
/* compiled from: ArrayQueue.kt */
public class C9184pq<T> {

    /* renamed from: a */
    public Object[] f44088a = new Object[16];

    /* renamed from: b */
    public int f44089b;

    /* renamed from: c */
    public int f44090c;

    /* renamed from: a */
    public final void mo65333a(T t) {
        Object[] objArr = this.f44088a;
        int i = this.f44090c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f44090c = length;
        if (length == this.f44089b) {
            mo65334b();
        }
    }

    /* renamed from: b */
    public final void mo65334b() {
        Object[] objArr = this.f44088a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        C6706xq.m54499m(objArr, objArr3, 0, this.f44089b, 0, 10, (Object) null);
        Object[] objArr4 = this.f44088a;
        int length2 = objArr4.length;
        int i = this.f44089b;
        C6706xq.m54499m(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f44088a = objArr3;
        this.f44089b = 0;
        this.f44090c = length;
    }

    /* renamed from: c */
    public final boolean mo65335c() {
        if (this.f44089b == this.f44090c) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final T mo65336d() {
        int i = this.f44089b;
        if (i == this.f44090c) {
            return null;
        }
        T[] tArr = this.f44088a;
        T t = tArr[i];
        tArr[i] = null;
        this.f44089b = (i + 1) & (tArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
