package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p000.sa6;

/* renamed from: yi4 */
/* compiled from: OpusReader */
public final class yi4 extends sa6 {

    /* renamed from: o */
    public static final byte[] f20233o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    public static final byte[] f20234p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n */
    public boolean f20235n;

    /* renamed from: o */
    public static boolean m30615o(gm4 gm4, byte[] bArr) {
        if (gm4.mo20676a() < bArr.length) {
            return false;
        }
        int e = gm4.mo20680e();
        byte[] bArr2 = new byte[bArr.length];
        gm4.mo20685j(bArr2, 0, bArr.length);
        gm4.mo20674P(e);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: p */
    public static boolean m30616p(gm4 gm4) {
        return m30615o(gm4, f20233o);
    }

    /* renamed from: f */
    public long mo23944f(gm4 gm4) {
        return mo25702c(mo28089n(gm4.mo20679d()));
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: i */
    public boolean mo23945i(gm4 gm4, long j, sa6.C3258b bVar) throws ParserException {
        if (m30615o(gm4, f20233o)) {
            byte[] copyOf = Arrays.copyOf(gm4.mo20679d(), gm4.mo20681f());
            int c = zi4.m31248c(copyOf);
            List<byte[]> a = zi4.m31246a(copyOf);
            if (bVar.f17552a != null) {
                return true;
            }
            bVar.f17552a = new C0792h.C0794b().mo6670e0("audio/opus").mo6647H(c).mo6671f0(48000).mo6659T(a).mo6644E();
            return true;
        }
        byte[] bArr = f20234p;
        if (m30615o(gm4, bArr)) {
            C2725kr.m20989i(bVar.f17552a);
            if (this.f20235n) {
                return true;
            }
            this.f20235n = true;
            gm4.mo20675Q(bArr.length);
            Metadata c2 = pf7.m24904c(ImmutableList.copyOf((E[]) pf7.m24911j(gm4, false, false).f16445b));
            if (c2 == null) {
                return true;
            }
            bVar.f17552a = bVar.f17552a.mo6636b().mo6663X(c2.mo6543b(bVar.f17552a.f4173A)).mo6644E();
            return true;
        }
        C2725kr.m20989i(bVar.f17552a);
        return false;
    }

    /* renamed from: l */
    public void mo23946l(boolean z) {
        super.mo23946l(z);
        if (z) {
            this.f20235n = false;
        }
    }

    /* renamed from: n */
    public final long mo28089n(byte[] bArr) {
        int i;
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i2 = b >> 3;
        int i3 = i2 & 3;
        if (i2 >= 16) {
            i = 2500 << i3;
        } else if (i2 >= 12) {
            i = 10000 << (i3 & 1);
        } else if (i3 == 3) {
            i = 60000;
        } else {
            i = 10000 << i3;
        }
        return ((long) b3) * ((long) i);
    }
}
