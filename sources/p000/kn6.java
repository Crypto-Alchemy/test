package p000;

import android.text.TextUtils;
import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;

/* renamed from: kn6 */
/* compiled from: TextEmphasis */
public final class kn6 {

    /* renamed from: d */
    public static final Pattern f14223d = Pattern.compile("\\s+");

    /* renamed from: e */
    public static final ImmutableSet<String> f14224e = ImmutableSet.m36714of("auto", "none");

    /* renamed from: f */
    public static final ImmutableSet<String> f14225f = ImmutableSet.m36715of("dot", "sesame", "circle");

    /* renamed from: g */
    public static final ImmutableSet<String> f14226g = ImmutableSet.m36714of("filled", "open");

    /* renamed from: h */
    public static final ImmutableSet<String> f14227h = ImmutableSet.m36715of("after", "before", "outside");

    /* renamed from: a */
    public final int f14228a;

    /* renamed from: b */
    public final int f14229b;

    /* renamed from: c */
    public final int f14230c;

    public kn6(int i, int i2, int i3) {
        this.f14228a = i;
        this.f14229b = i2;
        this.f14230c = i3;
    }

    /* renamed from: a */
    public static kn6 m20931a(String str) {
        if (str == null) {
            return null;
        }
        String e = C5876gr.m44841e(str.trim());
        if (e.isEmpty()) {
            return null;
        }
        return m20932b(ImmutableSet.copyOf((E[]) TextUtils.split(e, f14223d)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
        if (r9.equals("auto") != false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0115  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.kn6 m20932b(com.google.common.collect.ImmutableSet<java.lang.String> r9) {
        /*
            com.google.common.collect.ImmutableSet<java.lang.String> r0 = f14227h
            com.google.common.collect.i$e r0 = com.google.common.collect.C4632i.m37034e(r0, r9)
            java.lang.String r1 = "outside"
            java.lang.Object r0 = p000.qz2.m50912c(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.hashCode()
            r3 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            r4 = 2
            r5 = -1
            r6 = 0
            r7 = 1
            if (r2 == r3) goto L_0x0038
            r3 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r2 == r3) goto L_0x0030
            r1 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r2 == r1) goto L_0x0026
            goto L_0x0042
        L_0x0026:
            java.lang.String r1 = "after"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0042
            r0 = r6
            goto L_0x0043
        L_0x0030:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0042
            r0 = r7
            goto L_0x0043
        L_0x0038:
            java.lang.String r1 = "before"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0042
            r0 = r4
            goto L_0x0043
        L_0x0042:
            r0 = r5
        L_0x0043:
            if (r0 == 0) goto L_0x004b
            if (r0 == r7) goto L_0x0049
            r0 = r7
            goto L_0x004c
        L_0x0049:
            r0 = -2
            goto L_0x004c
        L_0x004b:
            r0 = r4
        L_0x004c:
            com.google.common.collect.ImmutableSet<java.lang.String> r1 = f14224e
            com.google.common.collect.i$e r1 = com.google.common.collect.C4632i.m37034e(r1, r9)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x008f
            java.util.Iterator r9 = r1.iterator()
            java.lang.Object r9 = r9.next()
            java.lang.String r9 = (java.lang.String) r9
            int r1 = r9.hashCode()
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r2) goto L_0x007b
            r2 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 == r2) goto L_0x0071
            goto L_0x0084
        L_0x0071:
            java.lang.String r1 = "none"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0084
            r7 = r6
            goto L_0x0085
        L_0x007b:
            java.lang.String r1 = "auto"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r7 = r5
        L_0x0085:
            if (r7 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r5 = r6
        L_0x0089:
            kn6 r9 = new kn6
            r9.<init>(r5, r6, r0)
            return r9
        L_0x008f:
            com.google.common.collect.ImmutableSet<java.lang.String> r1 = f14226g
            com.google.common.collect.i$e r1 = com.google.common.collect.C4632i.m37034e(r1, r9)
            com.google.common.collect.ImmutableSet<java.lang.String> r2 = f14225f
            com.google.common.collect.i$e r9 = com.google.common.collect.C4632i.m37034e(r2, r9)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00ad
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x00ad
            kn6 r9 = new kn6
            r9.<init>(r5, r6, r0)
            return r9
        L_0x00ad:
            java.lang.String r2 = "filled"
            java.lang.Object r1 = p000.qz2.m50912c(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.hashCode()
            r8 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r3 == r8) goto L_0x00ce
            r2 = 3417674(0x34264a, float:4.789181E-39)
            if (r3 == r2) goto L_0x00c4
            goto L_0x00d6
        L_0x00c4:
            java.lang.String r2 = "open"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00d6
            r1 = r6
            goto L_0x00d7
        L_0x00ce:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00d6
            r1 = r7
            goto L_0x00d7
        L_0x00d6:
            r1 = r5
        L_0x00d7:
            if (r1 == 0) goto L_0x00db
            r1 = r7
            goto L_0x00dc
        L_0x00db:
            r1 = r4
        L_0x00dc:
            java.lang.String r2 = "circle"
            java.lang.Object r9 = p000.qz2.m50912c(r9, r2)
            java.lang.String r9 = (java.lang.String) r9
            int r3 = r9.hashCode()
            r8 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r3 == r8) goto L_0x010c
            r2 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r3 == r2) goto L_0x0102
            r2 = 99657(0x18549, float:1.39649E-40)
            if (r3 == r2) goto L_0x00f8
            goto L_0x0113
        L_0x00f8:
            java.lang.String r2 = "dot"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0113
            r5 = r6
            goto L_0x0113
        L_0x0102:
            java.lang.String r2 = "sesame"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0113
            r5 = r7
            goto L_0x0113
        L_0x010c:
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0113
            r5 = r4
        L_0x0113:
            if (r5 == 0) goto L_0x011a
            if (r5 == r7) goto L_0x0119
            r4 = r7
            goto L_0x011a
        L_0x0119:
            r4 = 3
        L_0x011a:
            kn6 r9 = new kn6
            r9.<init>(r4, r1, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kn6.m20932b(com.google.common.collect.ImmutableSet):kn6");
    }
}
