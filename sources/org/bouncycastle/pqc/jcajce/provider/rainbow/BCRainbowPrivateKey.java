package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.security.PrivateKey;
import java.util.Arrays;

public class BCRainbowPrivateKey implements PrivateKey {
    private static final long serialVersionUID = 1;
    private short[][] A1inv;
    private short[][] A2inv;

    /* renamed from: b1 */
    private short[] f43862b1;

    /* renamed from: b2 */
    private short[] f43863b2;
    private he3[] layers;

    /* renamed from: vi */
    private int[] f43864vi;

    public BCRainbowPrivateKey(s65 s65) {
        throw null;
    }

    public BCRainbowPrivateKey(t65 t65) {
        this(t65.mo65969c(), t65.mo65967a(), t65.mo65970d(), t65.mo65968b(), t65.mo65972f(), t65.mo65971e());
    }

    public BCRainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, he3[] he3Arr) {
        this.A1inv = sArr;
        this.f43862b1 = sArr2;
        this.A2inv = sArr3;
        this.f43863b2 = sArr4;
        this.f43864vi = iArr;
        this.layers = he3Arr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPrivateKey)) {
            return false;
        }
        BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) obj;
        boolean z = ((((x65.m73884j(this.A1inv, bCRainbowPrivateKey.getInvA1())) && x65.m73884j(this.A2inv, bCRainbowPrivateKey.getInvA2())) && x65.m73883i(this.f43862b1, bCRainbowPrivateKey.getB1())) && x65.m73883i(this.f43863b2, bCRainbowPrivateKey.getB2())) && Arrays.equals(this.f43864vi, bCRainbowPrivateKey.getVi());
        if (this.layers.length != bCRainbowPrivateKey.getLayers().length) {
            return false;
        }
        for (int length = this.layers.length - 1; length >= 0; length--) {
            z &= this.layers[length].equals(bCRainbowPrivateKey.getLayers()[length]);
        }
        return z;
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    public short[] getB1() {
        return this.f43862b1;
    }

    public short[] getB2() {
        return this.f43863b2;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r8 = this;
            r65 r7 = new r65
            short[][] r1 = r8.A1inv
            short[] r2 = r8.f43862b1
            short[][] r3 = r8.A2inv
            short[] r4 = r8.f43863b2
            int[] r5 = r8.f43864vi
            he3[] r6 = r8.layers
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 0
            af r1 = new af     // Catch:{ IOException -> 0x0025 }
            p4 r2 = p000.bk4.f36868a     // Catch:{ IOException -> 0x0025 }
            wz0 r3 = p000.wz0.f45797d     // Catch:{ IOException -> 0x0025 }
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0025 }
            lv4 r2 = new lv4     // Catch:{ IOException -> 0x0025 }
            r2.<init>(r1, r7)     // Catch:{ IOException -> 0x0025 }
            byte[] r0 = r2.getEncoded()     // Catch:{  }
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public short[][] getInvA1() {
        return this.A1inv;
    }

    public short[][] getInvA2() {
        return this.A2inv;
    }

    public he3[] getLayers() {
        return this.layers;
    }

    public int[] getVi() {
        return this.f43864vi;
    }

    public int hashCode() {
        int length = (((((((((this.layers.length * 37) + C9367tq.m72413B(this.A1inv)) * 37) + C9367tq.m72412A(this.f43862b1)) * 37) + C9367tq.m72413B(this.A2inv)) * 37) + C9367tq.m72412A(this.f43863b2)) * 37) + C9367tq.m72440x(this.f43864vi);
        for (int length2 = this.layers.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.layers[length2].hashCode();
        }
        return length;
    }
}
