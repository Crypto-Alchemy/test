package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\b@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0001\u000e\u0001\u00020\rø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"Lmc0;", "", "", "index", "b", "([II)I", "value", "Lr37;", "d", "([III)V", "c", "([I)I", "mid", "", "data", "a", "([I)[I", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: mc0 */
/* compiled from: MyersDiff.kt */
public final class mc0 {
    /* renamed from: a */
    public static int[] m22152a(int[] iArr) {
        vx2.m53591g(iArr, "data");
        return iArr;
    }

    /* renamed from: b */
    public static final int m22153b(int[] iArr, int i) {
        return iArr[i + m22154c(iArr)];
    }

    /* renamed from: c */
    public static final int m22154c(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: d */
    public static final void m22155d(int[] iArr, int i, int i2) {
        iArr[i + m22154c(iArr)] = i2;
    }
}
