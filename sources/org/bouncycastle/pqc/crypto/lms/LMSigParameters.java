package org.bouncycastle.pqc.crypto.lms;

import java.util.HashMap;
import java.util.Map;

public class LMSigParameters {

    /* renamed from: e */
    public static final LMSigParameters f43790e;

    /* renamed from: f */
    public static final LMSigParameters f43791f;

    /* renamed from: g */
    public static final LMSigParameters f43792g;

    /* renamed from: h */
    public static final LMSigParameters f43793h;

    /* renamed from: i */
    public static final LMSigParameters f43794i;

    /* renamed from: j */
    public static Map<Object, LMSigParameters> f43795j = new HashMap<Object, LMSigParameters>() {
        {
            LMSigParameters lMSigParameters = LMSigParameters.f43790e;
            put(Integer.valueOf(lMSigParameters.f43796a), lMSigParameters);
            LMSigParameters lMSigParameters2 = LMSigParameters.f43791f;
            put(Integer.valueOf(lMSigParameters2.f43796a), lMSigParameters2);
            LMSigParameters lMSigParameters3 = LMSigParameters.f43792g;
            put(Integer.valueOf(lMSigParameters3.f43796a), lMSigParameters3);
            LMSigParameters lMSigParameters4 = LMSigParameters.f43793h;
            put(Integer.valueOf(lMSigParameters4.f43796a), lMSigParameters4);
            LMSigParameters lMSigParameters5 = LMSigParameters.f43794i;
            put(Integer.valueOf(lMSigParameters5.f43796a), lMSigParameters5);
        }
    };

    /* renamed from: a */
    public final int f43796a;

    /* renamed from: b */
    public final int f43797b;

    /* renamed from: c */
    public final int f43798c;

    /* renamed from: d */
    public final C9156p4 f43799d;

    static {
        C9156p4 p4Var = n24.f41061c;
        f43790e = new LMSigParameters(5, 32, 5, p4Var);
        f43791f = new LMSigParameters(6, 32, 10, p4Var);
        f43792g = new LMSigParameters(7, 32, 15, p4Var);
        f43793h = new LMSigParameters(8, 32, 20, p4Var);
        f43794i = new LMSigParameters(9, 32, 25, p4Var);
    }

    public LMSigParameters(int i, int i2, int i3, C9156p4 p4Var) {
        this.f43796a = i;
        this.f43797b = i2;
        this.f43798c = i3;
        this.f43799d = p4Var;
    }

    /* renamed from: e */
    public static LMSigParameters m70497e(int i) {
        return f43795j.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public C9156p4 mo64588b() {
        return this.f43799d;
    }

    /* renamed from: c */
    public int mo64589c() {
        return this.f43798c;
    }

    /* renamed from: d */
    public int mo64590d() {
        return this.f43797b;
    }

    /* renamed from: f */
    public int mo64591f() {
        return this.f43796a;
    }
}
