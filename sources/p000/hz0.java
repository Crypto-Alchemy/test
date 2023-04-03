package p000;

/* renamed from: hz0 */
/* compiled from: DBIG */
public class hz0 {

    /* renamed from: a */
    public long[] f38290a;

    public hz0(int i) {
        long[] jArr = new long[10];
        this.f38290a = jArr;
        jArr[0] = (long) i;
        for (int i2 = 1; i2 < 10; i2++) {
            this.f38290a[i2] = 0;
        }
    }

    /* renamed from: a */
    public int mo52327a() {
        hz0 hz0 = new hz0(this);
        hz0.mo52328b();
        int i = 9;
        while (i >= 0 && hz0.f38290a[i] == 0) {
            i--;
        }
        if (i < 0) {
            return 0;
        }
        int i2 = i * 56;
        long j = hz0.f38290a[i];
        while (j != 0) {
            j /= 2;
            i2++;
        }
        return i2;
    }

    /* renamed from: b */
    public void mo52328b() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            long[] jArr = this.f38290a;
            long j2 = jArr[i] + j;
            j = j2 >> 56;
            jArr[i] = j2 & 72057594037927935L;
        }
        long[] jArr2 = this.f38290a;
        jArr2[9] = jArr2[9] + j;
    }

    /* renamed from: c */
    public void mo52329c(int i) {
        int i2;
        int i3;
        int i4 = i % 56;
        int i5 = i / 56;
        int i6 = 0;
        while (true) {
            i2 = 10 - i5;
            i3 = i2 - 1;
            if (i6 >= i3) {
                break;
            }
            long[] jArr = this.f38290a;
            int i7 = i5 + i6;
            jArr[i6] = (jArr[i7] >> i4) | ((jArr[i7 + 1] << (56 - i4)) & 72057594037927935L);
            i6++;
        }
        long[] jArr2 = this.f38290a;
        jArr2[i3] = jArr2[9] >> i4;
        while (i2 < 10) {
            this.f38290a[i2] = 0;
            i2++;
        }
    }

    public String toString() {
        int i;
        int a = mo52327a();
        if (a % 4 == 0) {
            i = a >> 2;
        } else {
            i = (a >> 2) + 1;
        }
        String str = "";
        for (int i2 = i - 1; i2 >= 0; i2--) {
            hz0 hz0 = new hz0(this);
            hz0.mo52329c(i2 * 4);
            str = String.valueOf(str) + Integer.toHexString((int) (15 & hz0.f38290a[0]));
        }
        return str;
    }

    public hz0(hz0 hz0) {
        this.f38290a = new long[10];
        for (int i = 0; i < 10; i++) {
            this.f38290a[i] = hz0.f38290a[i];
        }
    }

    public hz0(C9316sw swVar) {
        this.f38290a = new long[10];
        for (int i = 0; i < 4; i++) {
            this.f38290a[i] = swVar.f44615a[i];
        }
        long[] jArr = this.f38290a;
        long[] jArr2 = swVar.f44615a;
        jArr[4] = jArr2[4] & 72057594037927935L;
        jArr[5] = jArr2[4] >> 56;
        for (int i2 = 6; i2 < 10; i2++) {
            this.f38290a[i2] = 0;
        }
    }
}
