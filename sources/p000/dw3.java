package p000;

import android.util.Pair;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import com.github.mikephil.charting.utils.Utils;
import p000.xs5;

/* renamed from: dw3 */
/* compiled from: MlltSeeker */
public final class dw3 implements at5 {

    /* renamed from: a */
    public final long[] f10903a;

    /* renamed from: b */
    public final long[] f10904b;

    /* renamed from: c */
    public final long f10905c;

    public dw3(long[] jArr, long[] jArr2, long j) {
        this.f10903a = jArr;
        this.f10904b = jArr2;
        this.f10905c = j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED ? w67.m29391y0(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: a */
    public static dw3 m15419a(long j, MlltFrame mlltFrame, long j2) {
        int length = mlltFrame.f5616k.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (mlltFrame.f5614e + mlltFrame.f5616k[i3]);
            j3 += (long) (mlltFrame.f5615g + mlltFrame.f5617r[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new dw3(jArr, jArr2, j2);
    }

    /* renamed from: b */
    public static Pair<Long, Long> m15420b(long j, long[] jArr, long[] jArr2) {
        double d;
        int i = w67.m29358i(jArr, j, true, true);
        long j2 = jArr[i];
        long j3 = jArr2[i];
        int i2 = i + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i2];
        long j5 = jArr2[i2];
        if (j4 == j2) {
            d = Utils.DOUBLE_EPSILON;
        } else {
            d = (((double) j) - ((double) j2)) / ((double) (j4 - j2));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * ((double) (j5 - j3)))) + j3));
    }

    /* renamed from: c */
    public long mo11141c(long j) {
        return w67.m29391y0(((Long) m15420b(j, this.f10903a, this.f10904b).second).longValue());
    }

    /* renamed from: f */
    public xs5.C3641a mo11155f(long j) {
        Pair<Long, Long> b = m15420b(w67.m29335U0(w67.m29376r(j, 0, this.f10905c)), this.f10904b, this.f10903a);
        return new xs5.C3641a(new zs5(w67.m29391y0(((Long) b.first).longValue()), ((Long) b.second).longValue()));
    }

    /* renamed from: g */
    public long mo11142g() {
        return -1;
    }

    /* renamed from: h */
    public boolean mo11156h() {
        return true;
    }

    /* renamed from: i */
    public long mo11157i() {
        return this.f10905c;
    }
}
