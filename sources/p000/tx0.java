package p000;

import p000.nm1;

/* renamed from: tx0 */
public class tx0 extends nm1.C8994c {
    public tx0(ul1 ul1, zl1 zl1, zl1 zl12) {
        super(ul1, zl1, zl12);
    }

    public tx0(ul1 ul1, zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        super(ul1, zl1, zl12, zl1Arr);
    }

    /* renamed from: H */
    public nm1 mo50273H() {
        return (!mo62751u() && !this.f43512c.mo50983i()) ? mo66141N(false).mo50276a(this) : this;
    }

    /* renamed from: J */
    public nm1 mo50274J() {
        if (mo62751u()) {
            return this;
        }
        return this.f43512c.mo50983i() ? mo62740i().mo50668u() : mo66141N(true);
    }

    /* renamed from: K */
    public nm1 mo50275K(nm1 nm1) {
        return this == nm1 ? mo50273H() : mo62751u() ? nm1 : nm1.mo62751u() ? mo50274J() : this.f43512c.mo50983i() ? nm1 : mo66141N(false).mo50276a(nm1);
    }

    /* renamed from: L */
    public sx0 mo66139L(sx0 sx0, int[] iArr) {
        sx0 sx02 = (sx0) mo62740i().mo66316n();
        if (sx0.mo50981h()) {
            return sx02;
        }
        sx0 sx03 = new sx0();
        if (iArr == null) {
            iArr = sx03.f44619g;
            rx0.m71708n(sx0.f44619g, iArr);
        }
        rx0.m71708n(iArr, sx03.f44619g);
        int[] iArr2 = sx03.f44619g;
        rx0.m71701g(iArr2, sx02.f44619g, iArr2);
        return sx03;
    }

    /* renamed from: M */
    public sx0 mo66140M() {
        zl1[] zl1Arr = this.f43513d;
        sx0 sx0 = (sx0) zl1Arr[1];
        if (sx0 != null) {
            return sx0;
        }
        sx0 L = mo66139L((sx0) zl1Arr[0], (int[]) null);
        zl1Arr[1] = L;
        return L;
    }

    /* renamed from: N */
    public tx0 mo66141N(boolean z) {
        sx0 sx0 = (sx0) this.f43511b;
        sx0 sx02 = (sx0) this.f43512c;
        sx0 sx03 = (sx0) this.f43513d[0];
        sx0 M = mo66140M();
        int[] i = j34.m59224i();
        rx0.m71708n(sx0.f44619g, i);
        rx0.m71707m(j34.m59217b(i, i, i) + j34.m59219d(M.f44619g, i), i);
        int[] i2 = j34.m59224i();
        rx0.m71713s(sx02.f44619g, i2);
        int[] i3 = j34.m59224i();
        rx0.m71701g(i2, sx02.f44619g, i3);
        int[] i4 = j34.m59224i();
        rx0.m71701g(i3, sx0.f44619g, i4);
        rx0.m71713s(i4, i4);
        int[] i5 = j34.m59224i();
        rx0.m71708n(i3, i5);
        rx0.m71713s(i5, i5);
        sx0 sx04 = new sx0(i3);
        rx0.m71708n(i, sx04.f44619g);
        int[] iArr = sx04.f44619g;
        rx0.m71712r(iArr, i4, iArr);
        int[] iArr2 = sx04.f44619g;
        rx0.m71712r(iArr2, i4, iArr2);
        sx0 sx05 = new sx0(i4);
        rx0.m71712r(i4, sx04.f44619g, sx05.f44619g);
        int[] iArr3 = sx05.f44619g;
        rx0.m71701g(iArr3, i, iArr3);
        int[] iArr4 = sx05.f44619g;
        rx0.m71712r(iArr4, i5, iArr4);
        sx0 sx06 = new sx0(i2);
        if (!j34.m59235t(sx03.f44619g)) {
            int[] iArr5 = sx06.f44619g;
            rx0.m71701g(iArr5, sx03.f44619g, iArr5);
        }
        sx0 sx07 = null;
        if (z) {
            sx07 = new sx0(i5);
            int[] iArr6 = sx07.f44619g;
            rx0.m71701g(iArr6, M.f44619g, iArr6);
            int[] iArr7 = sx07.f44619g;
            rx0.m71713s(iArr7, iArr7);
        }
        return new tx0(mo62740i(), sx04, sx05, new zl1[]{sx06, sx07});
    }

    /* renamed from: a */
    public nm1 mo50276a(nm1 nm1) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (mo62751u()) {
            return nm1;
        }
        if (nm1.mo62751u()) {
            return this;
        }
        if (this == nm1) {
            return mo50274J();
        }
        ul1 i = mo62740i();
        sx0 sx0 = (sx0) this.f43511b;
        sx0 sx02 = (sx0) this.f43512c;
        sx0 sx03 = (sx0) this.f43513d[0];
        sx0 sx04 = (sx0) nm1.mo62747q();
        sx0 sx05 = (sx0) nm1.mo50310r();
        sx0 sx06 = (sx0) nm1.mo62748s(0);
        int[] k = j34.m59226k();
        int[] i2 = j34.m59224i();
        int[] i3 = j34.m59224i();
        int[] i4 = j34.m59224i();
        boolean h = sx03.mo50981h();
        if (h) {
            iArr2 = sx04.f44619g;
            iArr = sx05.f44619g;
        } else {
            rx0.m71708n(sx03.f44619g, i3);
            rx0.m71701g(i3, sx04.f44619g, i2);
            rx0.m71701g(i3, sx03.f44619g, i3);
            rx0.m71701g(i3, sx05.f44619g, i3);
            iArr2 = i2;
            iArr = i3;
        }
        boolean h2 = sx06.mo50981h();
        if (h2) {
            iArr4 = sx0.f44619g;
            iArr3 = sx02.f44619g;
        } else {
            rx0.m71708n(sx06.f44619g, i4);
            rx0.m71701g(i4, sx0.f44619g, k);
            rx0.m71701g(i4, sx06.f44619g, i4);
            rx0.m71701g(i4, sx02.f44619g, i4);
            iArr4 = k;
            iArr3 = i4;
        }
        int[] i5 = j34.m59224i();
        rx0.m71712r(iArr4, iArr2, i5);
        rx0.m71712r(iArr3, iArr, i2);
        if (j34.m59237v(i5)) {
            return j34.m59237v(i2) ? mo50274J() : i.mo50668u();
        }
        int[] i6 = j34.m59224i();
        rx0.m71708n(i5, i6);
        int[] i7 = j34.m59224i();
        rx0.m71701g(i6, i5, i7);
        rx0.m71701g(i6, iArr4, i3);
        rx0.m71703i(i7, i7);
        j34.m59240y(iArr3, i7, k);
        rx0.m71707m(j34.m59217b(i3, i3, i7), i7);
        sx0 sx07 = new sx0(i4);
        rx0.m71708n(i2, sx07.f44619g);
        int[] iArr5 = sx07.f44619g;
        rx0.m71712r(iArr5, i7, iArr5);
        sx0 sx08 = new sx0(i7);
        rx0.m71712r(i3, sx07.f44619g, sx08.f44619g);
        rx0.m71702h(sx08.f44619g, i2, k);
        rx0.m71706l(k, sx08.f44619g);
        sx0 sx09 = new sx0(i5);
        if (!h) {
            int[] iArr6 = sx09.f44619g;
            rx0.m71701g(iArr6, sx03.f44619g, iArr6);
        }
        if (!h2) {
            int[] iArr7 = sx09.f44619g;
            rx0.m71701g(iArr7, sx06.f44619g, iArr7);
        }
        if (!h || !h2) {
            i6 = null;
        }
        return new tx0(i, sx07, sx08, new zl1[]{sx09, mo66139L(sx09, i6)});
    }

    /* renamed from: d */
    public nm1 mo50277d() {
        return new tx0((ul1) null, mo62737f(), mo62738g());
    }

    /* renamed from: s */
    public zl1 mo62748s(int i) {
        return i == 1 ? mo66140M() : super.mo62748s(i);
    }

    /* renamed from: z */
    public nm1 mo50278z() {
        return mo62751u() ? this : new tx0(mo62740i(), this.f43511b, this.f43512c.mo50987m(), this.f43513d);
    }
}
