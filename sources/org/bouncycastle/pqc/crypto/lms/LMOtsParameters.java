package org.bouncycastle.pqc.crypto.lms;

import java.util.HashMap;
import java.util.Map;

public class LMOtsParameters {

    /* renamed from: h */
    public static final LMOtsParameters f43778h;

    /* renamed from: i */
    public static final LMOtsParameters f43779i;

    /* renamed from: j */
    public static final LMOtsParameters f43780j;

    /* renamed from: k */
    public static final LMOtsParameters f43781k;

    /* renamed from: l */
    public static final Map<Object, LMOtsParameters> f43782l = new HashMap<Object, LMOtsParameters>() {
        {
            LMOtsParameters lMOtsParameters = LMOtsParameters.f43778h;
            put(Integer.valueOf(lMOtsParameters.f43783a), lMOtsParameters);
            LMOtsParameters lMOtsParameters2 = LMOtsParameters.f43779i;
            put(Integer.valueOf(lMOtsParameters2.f43783a), lMOtsParameters2);
            LMOtsParameters lMOtsParameters3 = LMOtsParameters.f43780j;
            put(Integer.valueOf(lMOtsParameters3.f43783a), lMOtsParameters3);
            LMOtsParameters lMOtsParameters4 = LMOtsParameters.f43781k;
            put(Integer.valueOf(lMOtsParameters4.f43783a), lMOtsParameters4);
        }
    };

    /* renamed from: a */
    public final int f43783a;

    /* renamed from: b */
    public final int f43784b;

    /* renamed from: c */
    public final int f43785c;

    /* renamed from: d */
    public final int f43786d;

    /* renamed from: e */
    public final int f43787e;

    /* renamed from: f */
    public final int f43788f;

    /* renamed from: g */
    public final C9156p4 f43789g;

    static {
        C9156p4 p4Var = n24.f41061c;
        f43778h = new LMOtsParameters(1, 32, 1, 265, 7, 8516, p4Var);
        f43779i = new LMOtsParameters(2, 32, 2, 133, 6, 4292, p4Var);
        f43780j = new LMOtsParameters(3, 32, 4, 67, 4, 2180, p4Var);
        f43781k = new LMOtsParameters(4, 32, 8, 34, 0, 1124, p4Var);
    }

    public LMOtsParameters(int i, int i2, int i3, int i4, int i5, int i6, C9156p4 p4Var) {
        this.f43783a = i;
        this.f43784b = i2;
        this.f43785c = i3;
        this.f43786d = i4;
        this.f43787e = i5;
        this.f43788f = i6;
        this.f43789g = p4Var;
    }

    /* renamed from: f */
    public static LMOtsParameters m70489f(int i) {
        return f43782l.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public C9156p4 mo64582b() {
        return this.f43789g;
    }

    /* renamed from: c */
    public int mo64583c() {
        return this.f43787e;
    }

    /* renamed from: d */
    public int mo64584d() {
        return this.f43784b;
    }

    /* renamed from: e */
    public int mo64585e() {
        return this.f43786d;
    }

    /* renamed from: g */
    public int mo64586g() {
        return this.f43783a;
    }

    /* renamed from: h */
    public int mo64587h() {
        return this.f43785c;
    }
}
