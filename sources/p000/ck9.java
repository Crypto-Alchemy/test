package p000;

/* renamed from: ck9 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class ck9 extends tj9 {

    /* renamed from: g */
    public final rn8 f21805g;

    /* renamed from: h */
    public final /* synthetic */ kk9 f21806h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ck9(kk9 kk9, String str, int i, rn8 rn8) {
        super(str, i);
        this.f21806h = kk9;
        this.f21805g = rn8;
    }

    /* renamed from: a */
    public final int mo30028a() {
        return this.f21805g.mo47453y();
    }

    /* renamed from: b */
    public final boolean mo30029b() {
        return true;
    }

    /* renamed from: c */
    public final boolean mo30030c() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30031k(java.lang.Long r11, java.lang.Long r12, p000.it8 r13, boolean r14) {
        /*
            r10 = this;
            p000.nd9.m48739a()
            kk9 r0 = r10.f21806h
            kr8 r0 = r0.f34342a
            n68 r0 = r0.mo45274y()
            java.lang.String r1 = r10.f34290a
            uk8<java.lang.Boolean> r2 = p000.rl8.f33483Z
            boolean r0 = r0.mo45997v(r1, r2)
            rn8 r1 = r10.f21805g
            boolean r1 = r1.mo47448C()
            rn8 r2 = r10.f21805g
            boolean r2 = r2.mo47449D()
            rn8 r3 = r10.f21805g
            boolean r3 = r3.mo47451F()
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x0030
            if (r2 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r1 = r4
            goto L_0x0031
        L_0x0030:
            r1 = r5
        L_0x0031:
            r2 = 0
            if (r14 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0060
            kk9 r11 = r10.f21806h
            kr8 r11 = r11.f34342a
            bn8 r11 = r11.mo45237A()
            vm8 r11 = r11.mo29678v()
            int r12 = r10.f34291b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            rn8 r13 = r10.f21805g
            boolean r13 = r13.mo47452x()
            if (r13 == 0) goto L_0x005a
            rn8 r13 = r10.f21805g
            int r13 = r13.mo47453y()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
        L_0x005a:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.mo48771c(r13, r12, r2)
            return r5
        L_0x0060:
            rn8 r6 = r10.f21805g
            xm8 r6 = r6.mo47447B()
            boolean r7 = r6.mo49515D()
            boolean r8 = r13.mo43925D()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.mo49520z()
            if (r8 != 0) goto L_0x0099
            kk9 r6 = r10.f21806h
            kr8 r6 = r6.f34342a
            bn8 r6 = r6.mo45237A()
            vm8 r6 = r6.mo29673o()
            kk9 r7 = r10.f21806h
            kr8 r7 = r7.f34342a
            mm8 r7 = r7.mo45244H()
            java.lang.String r8 = r13.mo43931z()
            java.lang.String r7 = r7.mo45823o(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r6.mo48770b(r8, r7)
            goto L_0x019c
        L_0x0099:
            long r8 = r13.mo43926E()
            ln8 r2 = r6.mo49513B()
            java.lang.Boolean r2 = p000.tj9.m52335g(r8, r2)
            java.lang.Boolean r2 = p000.tj9.m52333e(r2, r7)
            goto L_0x019c
        L_0x00ab:
            boolean r8 = r13.mo43927F()
            if (r8 == 0) goto L_0x00ec
            boolean r8 = r6.mo49520z()
            if (r8 != 0) goto L_0x00da
            kk9 r6 = r10.f21806h
            kr8 r6 = r6.f34342a
            bn8 r6 = r6.mo45237A()
            vm8 r6 = r6.mo29673o()
            kk9 r7 = r10.f21806h
            kr8 r7 = r7.f34342a
            mm8 r7 = r7.mo45244H()
            java.lang.String r8 = r13.mo43931z()
            java.lang.String r7 = r7.mo45823o(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r6.mo48770b(r8, r7)
            goto L_0x019c
        L_0x00da:
            double r8 = r13.mo43928G()
            ln8 r2 = r6.mo49513B()
            java.lang.Boolean r2 = p000.tj9.m52336h(r8, r2)
            java.lang.Boolean r2 = p000.tj9.m52333e(r2, r7)
            goto L_0x019c
        L_0x00ec:
            boolean r8 = r13.mo43923B()
            if (r8 == 0) goto L_0x017b
            boolean r8 = r6.mo49518x()
            if (r8 != 0) goto L_0x0162
            boolean r8 = r6.mo49520z()
            if (r8 != 0) goto L_0x0121
            kk9 r6 = r10.f21806h
            kr8 r6 = r6.f34342a
            bn8 r6 = r6.mo45237A()
            vm8 r6 = r6.mo29673o()
            kk9 r7 = r10.f21806h
            kr8 r7 = r7.f34342a
            mm8 r7 = r7.mo45244H()
            java.lang.String r8 = r13.mo43931z()
            java.lang.String r7 = r7.mo45823o(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r6.mo48770b(r8, r7)
            goto L_0x019c
        L_0x0121:
            java.lang.String r8 = r13.mo43924C()
            boolean r8 = p000.w59.m53709C(r8)
            if (r8 == 0) goto L_0x013c
            java.lang.String r2 = r13.mo43924C()
            ln8 r6 = r6.mo49513B()
            java.lang.Boolean r2 = p000.tj9.m52337i(r2, r6)
            java.lang.Boolean r2 = p000.tj9.m52333e(r2, r7)
            goto L_0x019c
        L_0x013c:
            kk9 r6 = r10.f21806h
            kr8 r6 = r6.f34342a
            bn8 r6 = r6.mo45237A()
            vm8 r6 = r6.mo29673o()
            kk9 r7 = r10.f21806h
            kr8 r7 = r7.f34342a
            mm8 r7 = r7.mo45244H()
            java.lang.String r8 = r13.mo43931z()
            java.lang.String r7 = r7.mo45823o(r8)
            java.lang.String r8 = r13.mo43924C()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo48771c(r9, r7, r8)
            goto L_0x019c
        L_0x0162:
            java.lang.String r2 = r13.mo43924C()
            eo8 r6 = r6.mo49519y()
            kk9 r8 = r10.f21806h
            kr8 r8 = r8.f34342a
            bn8 r8 = r8.mo45237A()
            java.lang.Boolean r2 = p000.tj9.m52334f(r2, r6, r8)
            java.lang.Boolean r2 = p000.tj9.m52333e(r2, r7)
            goto L_0x019c
        L_0x017b:
            kk9 r6 = r10.f21806h
            kr8 r6 = r6.f34342a
            bn8 r6 = r6.mo45237A()
            vm8 r6 = r6.mo29673o()
            kk9 r7 = r10.f21806h
            kr8 r7 = r7.f34342a
            mm8 r7 = r7.mo45244H()
            java.lang.String r8 = r13.mo43931z()
            java.lang.String r7 = r7.mo45823o(r8)
            java.lang.String r8 = "User property has no value, property"
            r6.mo48770b(r8, r7)
        L_0x019c:
            kk9 r6 = r10.f21806h
            kr8 r6 = r6.f34342a
            bn8 r6 = r6.mo45237A()
            vm8 r6 = r6.mo29678v()
            if (r2 != 0) goto L_0x01ad
            java.lang.String r7 = "null"
            goto L_0x01ae
        L_0x01ad:
            r7 = r2
        L_0x01ae:
            java.lang.String r8 = "Property filter result"
            r6.mo48770b(r8, r7)
            if (r2 != 0) goto L_0x01b6
            return r4
        L_0x01b6:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r10.f34292c = r4
            if (r3 == 0) goto L_0x01c4
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            return r5
        L_0x01c4:
            if (r14 == 0) goto L_0x01ce
            rn8 r14 = r10.f21805g
            boolean r14 = r14.mo47448C()
            if (r14 == 0) goto L_0x01d0
        L_0x01ce:
            r10.f34293d = r2
        L_0x01d0:
            boolean r14 = r2.booleanValue()
            if (r14 == 0) goto L_0x0215
            if (r1 == 0) goto L_0x0215
            boolean r14 = r13.mo43929x()
            if (r14 == 0) goto L_0x0215
            long r13 = r13.mo43930y()
            if (r11 == 0) goto L_0x01e8
            long r13 = r11.longValue()
        L_0x01e8:
            if (r0 == 0) goto L_0x0200
            rn8 r11 = r10.f21805g
            boolean r11 = r11.mo47448C()
            if (r11 == 0) goto L_0x0200
            rn8 r11 = r10.f21805g
            boolean r11 = r11.mo47449D()
            if (r11 != 0) goto L_0x0200
            if (r12 == 0) goto L_0x0200
            long r13 = r12.longValue()
        L_0x0200:
            rn8 r11 = r10.f21805g
            boolean r11 = r11.mo47449D()
            if (r11 == 0) goto L_0x020f
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f34295f = r11
            goto L_0x0215
        L_0x020f:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f34294e = r11
        L_0x0215:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ck9.mo30031k(java.lang.Long, java.lang.Long, it8, boolean):boolean");
    }
}
