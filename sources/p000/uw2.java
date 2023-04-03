package p000;

import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u0007J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J \u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c¨\u0006!"}, mo44877d2 = {"Luw2;", "", "", "oldStart", "oldEnd", "newStart", "newEnd", "Lr37;", "f", "x", "y", "size", "e", "d", "", "b", "h", "start", "end", "elSize", "g", "c", "i", "j", "a", "", "[I", "stack", "I", "lastIndex", "initialCapacity", "<init>", "(I)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: uw2 */
/* compiled from: MyersDiff.kt */
public final class uw2 {

    /* renamed from: a */
    public int[] f18588a;

    /* renamed from: b */
    public int f18589b;

    public uw2(int i) {
        this.f18588a = new int[i];
    }

    /* renamed from: a */
    public final boolean mo26875a(int i, int i2) {
        int[] iArr = this.f18588a;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        if (i3 < i4) {
            return true;
        }
        if (i3 != i4 || iArr[i + 1] > iArr[i2 + 1]) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo26876b() {
        if (this.f18589b != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int mo26877c(int i, int i2, int i3) {
        int i4 = i - i3;
        while (i < i2) {
            if (mo26875a(i, i2)) {
                i4 += i3;
                mo26883i(i4, i);
            }
            i += i3;
        }
        int i5 = i4 + i3;
        mo26883i(i5, i2);
        return i5;
    }

    /* renamed from: d */
    public final int mo26878d() {
        int[] iArr = this.f18588a;
        int i = this.f18589b - 1;
        this.f18589b = i;
        return iArr[i];
    }

    /* renamed from: e */
    public final void mo26879e(int i, int i2, int i3) {
        int i4 = this.f18589b;
        int i5 = i4 + 3;
        int[] iArr = this.f18588a;
        if (i5 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            vx2.m53590f(copyOf, "copyOf(this, newSize)");
            this.f18588a = copyOf;
        }
        int[] iArr2 = this.f18588a;
        iArr2[i4 + 0] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.f18589b = i5;
    }

    /* renamed from: f */
    public final void mo26880f(int i, int i2, int i3, int i4) {
        int i5 = this.f18589b;
        int i6 = i5 + 4;
        int[] iArr = this.f18588a;
        if (i6 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            vx2.m53590f(copyOf, "copyOf(this, newSize)");
            this.f18588a = copyOf;
        }
        int[] iArr2 = this.f18588a;
        iArr2[i5 + 0] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.f18589b = i6;
    }

    /* renamed from: g */
    public final void mo26881g(int i, int i2, int i3) {
        if (i < i2) {
            int c = mo26877c(i, i2, i3);
            mo26881g(i, c - i3, i3);
            mo26881g(c + i3, i2, i3);
        }
    }

    /* renamed from: h */
    public final void mo26882h() {
        boolean z;
        int i = this.f18589b;
        if (i % 3 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (i > 3) {
            mo26881g(0, i - 3, 3);
        }
    }

    /* renamed from: i */
    public final void mo26883i(int i, int i2) {
        int[] iArr = this.f18588a;
        f24.m16476i(iArr, i, i2);
        f24.m16476i(iArr, i + 1, i2 + 1);
        f24.m16476i(iArr, i + 2, i2 + 2);
    }
}
