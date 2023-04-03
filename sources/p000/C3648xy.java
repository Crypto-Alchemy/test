package p000;

import androidx.media3.exoplayer.source.C0997p;
import p000.qe0;

/* renamed from: xy */
/* compiled from: BaseMediaChunkOutput */
public final class C3648xy implements qe0.C3139b {

    /* renamed from: a */
    public final int[] f19992a;

    /* renamed from: b */
    public final C0997p[] f19993b;

    public C3648xy(int[] iArr, C0997p[] pVarArr) {
        this.f19992a = iArr;
        this.f19993b = pVarArr;
    }

    /* renamed from: a */
    public int[] mo27891a() {
        int[] iArr = new int[this.f19993b.length];
        int i = 0;
        while (true) {
            C0997p[] pVarArr = this.f19993b;
            if (i >= pVarArr.length) {
                return iArr;
            }
            iArr[i] = pVarArr[i].mo7758G();
            i++;
        }
    }

    /* renamed from: b */
    public void mo27892b(long j) {
        for (C0997p Z : this.f19993b) {
            Z.mo7776Z(j);
        }
    }

    /* renamed from: f */
    public zs6 mo25075f(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f19992a;
            if (i3 >= iArr.length) {
                gk3.m18126c("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new cl1();
            } else if (i2 == iArr[i3]) {
                return this.f19993b[i3];
            } else {
                i3++;
            }
        }
    }
}
