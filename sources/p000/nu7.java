package p000;

/* renamed from: nu7 */
public final class nu7 {

    /* renamed from: a */
    public final int f32197a;

    /* renamed from: b */
    public final String f32198b;

    /* renamed from: c */
    public final long f32199c;

    /* renamed from: d */
    public final long f32200d;

    /* renamed from: e */
    public final int f32201e;

    public nu7() {
    }

    public nu7(int i, String str, long j, long j2, int i2) {
        this();
        this.f32197a = i;
        this.f32198b = str;
        this.f32199c = j;
        this.f32200d = j2;
        this.f32201e = i2;
    }

    /* renamed from: a */
    public int mo46225a() {
        return this.f32197a;
    }

    /* renamed from: b */
    public String mo46226b() {
        return this.f32198b;
    }

    /* renamed from: c */
    public long mo46227c() {
        return this.f32199c;
    }

    /* renamed from: d */
    public long mo46228d() {
        return this.f32200d;
    }

    /* renamed from: e */
    public int mo46229e() {
        return this.f32201e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r7.f32198b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p000.nu7
            r2 = 0
            if (r1 == 0) goto L_0x0046
            nu7 r8 = (p000.nu7) r8
            int r1 = r7.f32197a
            int r3 = r8.mo46225a()
            if (r1 != r3) goto L_0x0046
            java.lang.String r1 = r7.f32198b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r8.mo46226b()
            if (r1 != 0) goto L_0x0046
            goto L_0x0029
        L_0x001e:
            java.lang.String r3 = r8.mo46226b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0046
        L_0x0029:
            long r3 = r7.f32199c
            long r5 = r8.mo46227c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            long r3 = r7.f32200d
            long r5 = r8.mo46228d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            int r1 = r7.f32201e
            int r8 = r8.mo46229e()
            if (r1 != r8) goto L_0x0046
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nu7.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = (this.f32197a ^ 1000003) * 1000003;
        String str = this.f32198b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f32199c;
        long j2 = this.f32200d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f32201e;
    }

    public String toString() {
        int i = this.f32197a;
        String str = this.f32198b;
        long j = this.f32199c;
        long j2 = this.f32200d;
        int i2 = this.f32201e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
