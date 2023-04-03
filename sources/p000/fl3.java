package p000;

/* renamed from: fl3 */
public abstract class fl3 implements tx1, us3 {

    /* renamed from: o */
    public static final long[] f37837o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: a */
    public byte[] f37838a;

    /* renamed from: b */
    public int f37839b;

    /* renamed from: c */
    public long f37840c;

    /* renamed from: d */
    public long f37841d;

    /* renamed from: e */
    public long f37842e;

    /* renamed from: f */
    public long f37843f;

    /* renamed from: g */
    public long f37844g;

    /* renamed from: h */
    public long f37845h;

    /* renamed from: i */
    public long f37846i;

    /* renamed from: j */
    public long f37847j;

    /* renamed from: k */
    public long f37848k;

    /* renamed from: l */
    public long f37849l;

    /* renamed from: m */
    public long[] f37850m;

    /* renamed from: n */
    public int f37851n;

    public fl3() {
        this.f37838a = new byte[8];
        this.f37850m = new long[80];
        this.f37839b = 0;
        reset();
    }

    public fl3(fl3 fl3) {
        this.f37838a = new byte[8];
        this.f37850m = new long[80];
        mo51722o(fl3);
    }

    /* renamed from: b */
    public void mo51713b(byte b) {
        byte[] bArr = this.f37838a;
        int i = this.f37839b;
        int i2 = i + 1;
        this.f37839b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            mo51726s(bArr, 0);
            this.f37839b = 0;
        }
        this.f37840c++;
    }

    /* renamed from: g */
    public int mo51714g() {
        return 128;
    }

    /* renamed from: h */
    public final long mo51715h(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    /* renamed from: i */
    public final long mo51716i(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    /* renamed from: j */
    public final long mo51717j(long j) {
        return (j >>> 7) ^ (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8)));
    }

    /* renamed from: k */
    public final long mo51718k(long j) {
        return (j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)));
    }

    /* renamed from: l */
    public final long mo51719l(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    /* renamed from: m */
    public final long mo51720m(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    /* renamed from: n */
    public final void mo51721n() {
        long j = this.f37840c;
        if (j > 2305843009213693951L) {
            this.f37841d += j >>> 61;
            this.f37840c = j & 2305843009213693951L;
        }
    }

    /* renamed from: o */
    public void mo51722o(fl3 fl3) {
        byte[] bArr = fl3.f37838a;
        System.arraycopy(bArr, 0, this.f37838a, 0, bArr.length);
        this.f37839b = fl3.f37839b;
        this.f37840c = fl3.f37840c;
        this.f37841d = fl3.f37841d;
        this.f37842e = fl3.f37842e;
        this.f37843f = fl3.f37843f;
        this.f37844g = fl3.f37844g;
        this.f37845h = fl3.f37845h;
        this.f37846i = fl3.f37846i;
        this.f37847j = fl3.f37847j;
        this.f37848k = fl3.f37848k;
        this.f37849l = fl3.f37849l;
        long[] jArr = fl3.f37850m;
        System.arraycopy(jArr, 0, this.f37850m, 0, jArr.length);
        this.f37851n = fl3.f37851n;
    }

    /* renamed from: p */
    public void mo51723p() {
        mo51721n();
        long j = this.f37840c << 3;
        long j2 = this.f37841d;
        byte b = Byte.MIN_VALUE;
        while (true) {
            mo51713b(b);
            if (this.f37839b != 0) {
                b = 0;
            } else {
                mo51725r(j, j2);
                mo51724q();
                return;
            }
        }
    }

    /* renamed from: q */
    public void mo51724q() {
        mo51721n();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.f37850m;
            long k = mo51718k(jArr[i - 2]);
            long[] jArr2 = this.f37850m;
            jArr[i] = k + jArr2[i - 7] + mo51717j(jArr2[i - 15]) + this.f37850m[i - 16];
        }
        long j = this.f37842e;
        long j2 = this.f37843f;
        long j3 = this.f37844g;
        long j4 = this.f37845h;
        long j5 = this.f37846i;
        long j6 = this.f37847j;
        long j7 = this.f37848k;
        long j8 = j6;
        long j9 = j4;
        int i2 = 0;
        long j10 = j2;
        long j11 = j3;
        long j12 = j5;
        int i3 = 0;
        long j13 = this.f37849l;
        long j14 = j7;
        long j15 = j;
        long j16 = j14;
        while (i3 < 10) {
            int i4 = i3;
            long j17 = j12;
            long[] jArr3 = f37837o;
            int i5 = i2 + 1;
            long m = j13 + mo51720m(j12) + mo51715h(j12, j8, j16) + jArr3[i2] + this.f37850m[i2];
            long l = m + mo51719l(j15) + mo51716i(j15, j10, j11);
            long j18 = j9 + m;
            long j19 = j18;
            int i6 = i5 + 1;
            long m2 = j16 + mo51720m(j18) + mo51715h(j18, j17, j8) + jArr3[i5] + this.f37850m[i5];
            long j20 = l;
            long j21 = j11 + m2;
            long l2 = m2 + mo51719l(l) + mo51716i(l, j15, j10);
            long m3 = mo51720m(j21);
            long j22 = j21;
            long j23 = l2;
            int i7 = i6 + 1;
            long h = j8 + m3 + mo51715h(j21, j19, j17) + jArr3[i6] + this.f37850m[i6];
            long j24 = j10 + h;
            long l3 = h + mo51719l(j23) + mo51716i(j23, j20, j15);
            long m4 = mo51720m(j24);
            long j25 = j24;
            long j26 = l3;
            int i8 = i7 + 1;
            long h2 = j17 + m4 + mo51715h(j24, j22, j19) + jArr3[i7] + this.f37850m[i7];
            long j27 = j15 + h2;
            long l4 = h2 + mo51719l(j26) + mo51716i(j26, j23, j20);
            long m5 = mo51720m(j27);
            long j28 = j27;
            long j29 = l4;
            int i9 = i8 + 1;
            long h3 = j19 + m5 + mo51715h(j27, j25, j22) + jArr3[i8] + this.f37850m[i8];
            long j30 = j26;
            long j31 = j26;
            long j32 = j20 + h3;
            long l5 = h3 + mo51719l(j29) + mo51716i(j29, j30, j23);
            long m6 = mo51720m(j32);
            long j33 = j32;
            long j34 = l5;
            int i10 = i9 + 1;
            long h4 = j22 + m6 + mo51715h(j32, j28, j25) + jArr3[i9] + this.f37850m[i9];
            long j35 = j23 + h4;
            long l6 = h4 + mo51719l(j34) + mo51716i(j34, j29, j31);
            long m7 = mo51720m(j35);
            j16 = j35;
            long j36 = l6;
            int i11 = i10 + 1;
            long h5 = j25 + m7 + mo51715h(j35, j33, j28) + jArr3[i10] + this.f37850m[i10];
            long j37 = j31 + h5;
            long j38 = j34;
            long j39 = j34;
            long j40 = j37;
            long l7 = h5 + mo51719l(j36) + mo51716i(j36, j38, j29);
            long m8 = mo51720m(j40);
            j8 = j40;
            j10 = l7;
            long h6 = j28 + m8 + mo51715h(j40, j16, j33) + jArr3[i11] + this.f37850m[i11];
            long l8 = h6 + mo51719l(j10) + mo51716i(j10, j36, j39);
            i3 = i4 + 1;
            j12 = j29 + h6;
            j11 = j36;
            j13 = j33;
            j9 = j39;
            i2 = i11 + 1;
            j15 = l8;
        }
        this.f37842e += j15;
        this.f37843f += j10;
        this.f37844g += j11;
        this.f37845h += j9;
        this.f37846i += j12;
        this.f37847j += j8;
        this.f37848k += j16;
        this.f37849l += j13;
        this.f37851n = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            this.f37850m[i12] = 0;
        }
    }

    /* renamed from: r */
    public void mo51725r(long j, long j2) {
        if (this.f37851n > 14) {
            mo51724q();
        }
        long[] jArr = this.f37850m;
        jArr[14] = j2;
        jArr[15] = j;
    }

    public void reset() {
        this.f37840c = 0;
        this.f37841d = 0;
        int i = 0;
        this.f37839b = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f37838a;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.f37851n = 0;
        while (true) {
            long[] jArr = this.f37850m;
            if (i != jArr.length) {
                jArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: s */
    public void mo51726s(byte[] bArr, int i) {
        this.f37850m[this.f37851n] = ek4.m57382b(bArr, i);
        int i2 = this.f37851n + 1;
        this.f37851n = i2;
        if (i2 == 16) {
            mo51724q();
        }
    }

    public void update(byte[] bArr, int i, int i2) {
        while (this.f37839b != 0 && i2 > 0) {
            mo51713b(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.f37838a.length) {
            mo51726s(bArr, i);
            byte[] bArr2 = this.f37838a;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.f37840c += (long) bArr2.length;
        }
        while (i2 > 0) {
            mo51713b(bArr[i]);
            i++;
            i2--;
        }
    }
}
