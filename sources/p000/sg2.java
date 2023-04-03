package p000;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: sg2 */
/* compiled from: GifHeaderParser */
public class sg2 {

    /* renamed from: a */
    public final byte[] f17663a = new byte[256];

    /* renamed from: b */
    public ByteBuffer f17664b;

    /* renamed from: c */
    public rg2 f17665c;

    /* renamed from: d */
    public int f17666d = 0;

    /* renamed from: a */
    public void mo25766a() {
        this.f17664b = null;
        this.f17665c = null;
    }

    /* renamed from: b */
    public final boolean mo25767b() {
        if (this.f17665c.f17232b != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public rg2 mo25768c() {
        if (this.f17664b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (mo25767b()) {
            return this.f17665c;
        } else {
            mo25776k();
            if (!mo25767b()) {
                mo25773h();
                rg2 rg2 = this.f17665c;
                if (rg2.f17233c < 0) {
                    rg2.f17232b = 1;
                }
            }
            return this.f17665c;
        }
    }

    /* renamed from: d */
    public final int mo25769d() {
        try {
            return this.f17664b.get() & 255;
        } catch (Exception unused) {
            this.f17665c.f17232b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    public final void mo25770e() {
        boolean z;
        this.f17665c.f17234d.f15876a = mo25779n();
        this.f17665c.f17234d.f15877b = mo25779n();
        this.f17665c.f17234d.f15878c = mo25779n();
        this.f17665c.f17234d.f15879d = mo25779n();
        int d = mo25769d();
        boolean z2 = false;
        if ((d & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        og2 og2 = this.f17665c.f17234d;
        if ((d & 64) != 0) {
            z2 = true;
        }
        og2.f15880e = z2;
        if (z) {
            og2.f15886k = mo25772g(pow);
        } else {
            og2.f15886k = null;
        }
        this.f17665c.f17234d.f15885j = this.f17664b.position();
        mo25783r();
        if (!mo25767b()) {
            rg2 rg2 = this.f17665c;
            rg2.f17233c++;
            rg2.f17235e.add(rg2.f17234d);
        }
    }

    /* renamed from: f */
    public final void mo25771f() {
        int d = mo25769d();
        this.f17666d = d;
        if (d > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f17666d;
                    if (i < i3) {
                        i2 = i3 - i;
                        this.f17664b.get(this.f17663a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error Reading Block n: ");
                        sb.append(i);
                        sb.append(" count: ");
                        sb.append(i2);
                        sb.append(" blockSize: ");
                        sb.append(this.f17666d);
                    }
                    this.f17665c.f17232b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final int[] mo25772g(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f17664b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            this.f17665c.f17232b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    public final void mo25773h() {
        mo25774i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    public final void mo25774i(int i) {
        boolean z = false;
        while (!z && !mo25767b() && this.f17665c.f17233c <= i) {
            int d = mo25769d();
            if (d == 33) {
                int d2 = mo25769d();
                if (d2 == 1) {
                    mo25782q();
                } else if (d2 == 249) {
                    this.f17665c.f17234d = new og2();
                    mo25775j();
                } else if (d2 == 254) {
                    mo25782q();
                } else if (d2 != 255) {
                    mo25782q();
                } else {
                    mo25771f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f17663a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        mo25778m();
                    } else {
                        mo25782q();
                    }
                }
            } else if (d == 44) {
                rg2 rg2 = this.f17665c;
                if (rg2.f17234d == null) {
                    rg2.f17234d = new og2();
                }
                mo25770e();
            } else if (d != 59) {
                this.f17665c.f17232b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: j */
    public final void mo25775j() {
        mo25769d();
        int d = mo25769d();
        og2 og2 = this.f17665c.f17234d;
        int i = (d & 28) >> 2;
        og2.f15882g = i;
        boolean z = true;
        if (i == 0) {
            og2.f15882g = 1;
        }
        if ((d & 1) == 0) {
            z = false;
        }
        og2.f15881f = z;
        int n = mo25779n();
        if (n < 2) {
            n = 10;
        }
        og2 og22 = this.f17665c.f17234d;
        og22.f15884i = n * 10;
        og22.f15883h = mo25769d();
        mo25769d();
    }

    /* renamed from: k */
    public final void mo25776k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) mo25769d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f17665c.f17232b = 1;
            return;
        }
        mo25777l();
        if (this.f17665c.f17238h && !mo25767b()) {
            rg2 rg2 = this.f17665c;
            rg2.f17231a = mo25772g(rg2.f17239i);
            rg2 rg22 = this.f17665c;
            rg22.f17242l = rg22.f17231a[rg22.f17240j];
        }
    }

    /* renamed from: l */
    public final void mo25777l() {
        boolean z;
        this.f17665c.f17236f = mo25779n();
        this.f17665c.f17237g = mo25779n();
        int d = mo25769d();
        rg2 rg2 = this.f17665c;
        if ((d & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        rg2.f17238h = z;
        rg2.f17239i = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        this.f17665c.f17240j = mo25769d();
        this.f17665c.f17241k = mo25769d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25778m() {
        /*
            r3 = this;
        L_0x0000:
            r3.mo25771f()
            byte[] r0 = r3.f17663a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            rg2 r2 = r3.f17665c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f17243m = r0
        L_0x001b:
            int r0 = r3.f17666d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.mo25767b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sg2.mo25778m():void");
    }

    /* renamed from: n */
    public final int mo25779n() {
        return this.f17664b.getShort();
    }

    /* renamed from: o */
    public final void mo25780o() {
        this.f17664b = null;
        Arrays.fill(this.f17663a, (byte) 0);
        this.f17665c = new rg2();
        this.f17666d = 0;
    }

    /* renamed from: p */
    public sg2 mo25781p(ByteBuffer byteBuffer) {
        mo25780o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f17664b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f17664b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: q */
    public final void mo25782q() {
        int d;
        do {
            d = mo25769d();
            this.f17664b.position(Math.min(this.f17664b.position() + d, this.f17664b.limit()));
        } while (d > 0);
    }

    /* renamed from: r */
    public final void mo25783r() {
        mo25769d();
        mo25782q();
    }
}
