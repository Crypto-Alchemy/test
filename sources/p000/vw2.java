package p000;

import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lvw2;", "", "", "value", "Lr37;", "i", "h", "default", "g", "e", "index", "f", "", "d", "a", "c", "", "[I", "slots", "b", "I", "tos", "()I", "size", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vw2 */
/* compiled from: Stack.kt */
public final class vw2 {

    /* renamed from: a */
    public int[] f18909a = new int[10];

    /* renamed from: b */
    public int f18910b;

    /* renamed from: a */
    public final void mo27339a() {
        this.f18910b = 0;
    }

    /* renamed from: b */
    public final int mo27340b() {
        return this.f18910b;
    }

    /* renamed from: c */
    public final int mo27341c(int i) {
        int i2 = this.f18910b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f18909a[i3] == i) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final boolean mo27342d() {
        if (this.f18910b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo27343e() {
        return this.f18909a[this.f18910b - 1];
    }

    /* renamed from: f */
    public final int mo27344f(int i) {
        return this.f18909a[i];
    }

    /* renamed from: g */
    public final int mo27345g(int i) {
        if (this.f18910b > 0) {
            return mo27343e();
        }
        return i;
    }

    /* renamed from: h */
    public final int mo27346h() {
        int[] iArr = this.f18909a;
        int i = this.f18910b - 1;
        this.f18910b = i;
        return iArr[i];
    }

    /* renamed from: i */
    public final void mo27347i(int i) {
        int i2 = this.f18910b;
        int[] iArr = this.f18909a;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            vx2.m53590f(copyOf, "copyOf(this, newSize)");
            this.f18909a = copyOf;
        }
        int[] iArr2 = this.f18909a;
        int i3 = this.f18910b;
        this.f18910b = i3 + 1;
        iArr2[i3] = i;
    }
}
