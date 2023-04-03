package androidx.media3.exoplayer.source;

import androidx.media3.common.C0798k;
import androidx.media3.common.C0831s;
import androidx.media3.exoplayer.source.C0973i;
import com.google.common.collect.MultimapBuilder;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class MergingMediaSource extends C0958c<Integer> {

    /* renamed from: v */
    public static final C0798k f5174v = new C0798k.C0801c().mo6756d("MergingMediaSource").mo6753a();

    /* renamed from: k */
    public final boolean f5175k;

    /* renamed from: l */
    public final boolean f5176l;

    /* renamed from: m */
    public final C0973i[] f5177m;

    /* renamed from: n */
    public final C0831s[] f5178n;

    /* renamed from: o */
    public final ArrayList<C0973i> f5179o;

    /* renamed from: p */
    public final tn0 f5180p;

    /* renamed from: q */
    public final Map<Object, Long> f5181q;

    /* renamed from: r */
    public final c04<Object, C0956b> f5182r;

    /* renamed from: s */
    public int f5183s;

    /* renamed from: t */
    public long[][] f5184t;

    /* renamed from: u */
    public IllegalMergeException f5185u;

    public static final class IllegalMergeException extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        public IllegalMergeException(int i) {
            this.reason = i;
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.MergingMediaSource$a */
    public static final class C0954a extends r82 {

        /* renamed from: g */
        public final long[] f5186g;

        /* renamed from: k */
        public final long[] f5187k;

        public C0954a(C0831s sVar, Map<Object, Long> map) {
            super(sVar);
            int t = sVar.mo6882t();
            this.f5187k = new long[sVar.mo6882t()];
            C0831s.C0835d dVar = new C0831s.C0835d();
            for (int i = 0; i < t; i++) {
                this.f5187k[i] = sVar.mo6880r(i, dVar).f4455I;
            }
            int m = sVar.mo6875m();
            this.f5186g = new long[m];
            C0831s.C0833b bVar = new C0831s.C0833b();
            for (int i2 = 0; i2 < m; i2++) {
                sVar.mo6873k(i2, bVar, true);
                long longValue = ((Long) C2725kr.m20985e(map.get(bVar.f4437d))).longValue();
                long[] jArr = this.f5186g;
                longValue = longValue == Long.MIN_VALUE ? bVar.f4439g : longValue;
                jArr[i2] = longValue;
                long j = bVar.f4439g;
                if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    long[] jArr2 = this.f5187k;
                    int i3 = bVar.f4438e;
                    jArr2[i3] = jArr2[i3] - (j - longValue);
                }
            }
        }

        /* renamed from: k */
        public C0831s.C0833b mo6873k(int i, C0831s.C0833b bVar, boolean z) {
            super.mo6873k(i, bVar, z);
            bVar.f4439g = this.f5186g[i];
            return bVar;
        }

        /* renamed from: s */
        public C0831s.C0835d mo6881s(int i, C0831s.C0835d dVar, long j) {
            long j2;
            super.mo6881s(i, dVar, j);
            long j3 = this.f5187k[i];
            dVar.f4455I = j3;
            if (j3 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                long j4 = dVar.f4454H;
                if (j4 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    j2 = Math.min(j4, j3);
                    dVar.f4454H = j2;
                    return dVar;
                }
            }
            j2 = dVar.f4454H;
            dVar.f4454H = j2;
            return dVar;
        }
    }

    public MergingMediaSource(C0973i... iVarArr) {
        this(false, iVarArr);
    }

    /* renamed from: A */
    public void mo7181A() {
        super.mo7181A();
        Arrays.fill(this.f5178n, (Object) null);
        this.f5183s = -1;
        this.f5185u = null;
        this.f5179o.clear();
        Collections.addAll(this.f5179o, this.f5177m);
    }

    /* renamed from: I */
    public final void mo7562I() {
        C0831s.C0833b bVar = new C0831s.C0833b();
        for (int i = 0; i < this.f5183s; i++) {
            long j = -this.f5178n[0].mo6872j(i, bVar).mo6901q();
            int i2 = 1;
            while (true) {
                C0831s[] sVarArr = this.f5178n;
                if (i2 >= sVarArr.length) {
                    break;
                }
                this.f5184t[i][i2] = j - (-sVarArr[i2].mo6872j(i, bVar).mo6901q());
                i2++;
            }
        }
    }

    /* renamed from: J */
    public C0973i.C0975b mo7561C(Integer num, C0973i.C0975b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    /* renamed from: K */
    public void mo7558G(Integer num, C0973i iVar, C0831s sVar) {
        if (this.f5185u == null) {
            if (this.f5183s == -1) {
                this.f5183s = sVar.mo6875m();
            } else if (sVar.mo6875m() != this.f5183s) {
                this.f5185u = new IllegalMergeException(0);
                return;
            }
            if (this.f5184t.length == 0) {
                int i = this.f5183s;
                int[] iArr = new int[2];
                iArr[1] = this.f5178n.length;
                iArr[0] = i;
                this.f5184t = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            this.f5179o.remove(iVar);
            this.f5178n[num.intValue()] = sVar;
            if (this.f5179o.isEmpty()) {
                if (this.f5175k) {
                    mo7562I();
                }
                C0954a aVar = this.f5178n[0];
                if (this.f5176l) {
                    mo7565L();
                    aVar = new C0954a(aVar, this.f5181q);
                }
                mo7585z(aVar);
            }
        }
    }

    /* renamed from: L */
    public final void mo7565L() {
        C0831s[] sVarArr;
        C0831s.C0833b bVar = new C0831s.C0833b();
        for (int i = 0; i < this.f5183s; i++) {
            int i2 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                sVarArr = this.f5178n;
                if (i2 >= sVarArr.length) {
                    break;
                }
                long m = sVarArr[i2].mo6872j(i, bVar).mo6897m();
                if (m != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    long j2 = m + this.f5184t[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object q = sVarArr[0].mo6879q(i);
            this.f5181q.put(q, Long.valueOf(j));
            for (C0956b u : this.f5182r.get(q)) {
                u.mo7591u(0, j);
            }
        }
    }

    /* renamed from: c */
    public C0971h mo7197c(C0973i.C0975b bVar, C2891nf nfVar, long j) {
        int length = this.f5177m.length;
        C0971h[] hVarArr = new C0971h[length];
        int f = this.f5178n[0].mo6867f(bVar.f15659a);
        for (int i = 0; i < length; i++) {
            hVarArr[i] = this.f5177m[i].mo7197c(bVar.mo7638c(this.f5178n[i].mo6879q(f)), nfVar, j - this.f5184t[f][i]);
        }
        C0980k kVar = new C0980k(this.f5180p, this.f5184t[f], hVarArr);
        if (!this.f5176l) {
            return kVar;
        }
        C0956b bVar2 = new C0956b(kVar, true, 0, ((Long) C2725kr.m20985e(this.f5181q.get(bVar.f15659a))).longValue());
        this.f5182r.put(bVar.f15659a, bVar2);
        return bVar2;
    }

    /* renamed from: d */
    public C0798k mo7199d() {
        C0973i[] iVarArr = this.f5177m;
        if (iVarArr.length > 0) {
            return iVarArr[0].mo7199d();
        }
        return f5174v;
    }

    /* renamed from: g */
    public void mo7203g(C0971h hVar) {
        if (this.f5176l) {
            C0956b bVar = (C0956b) hVar;
            Iterator<Map.Entry<Object, C0956b>> it = this.f5182r.entries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((C0956b) next.getValue()).equals(bVar)) {
                    this.f5182r.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            hVar = bVar.f5195a;
        }
        C0980k kVar = (C0980k) hVar;
        int i = 0;
        while (true) {
            C0973i[] iVarArr = this.f5177m;
            if (i < iVarArr.length) {
                iVarArr[i].mo7203g(kVar.mo7660b(i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    public void mo7204m() throws IOException {
        IllegalMergeException illegalMergeException = this.f5185u;
        if (illegalMergeException == null) {
            super.mo7204m();
            return;
        }
        throw illegalMergeException;
    }

    /* renamed from: y */
    public void mo7205y(ov6 ov6) {
        super.mo7205y(ov6);
        for (int i = 0; i < this.f5177m.length; i++) {
            mo7599H(Integer.valueOf(i), this.f5177m[i]);
        }
    }

    public MergingMediaSource(boolean z, C0973i... iVarArr) {
        this(z, false, iVarArr);
    }

    public MergingMediaSource(boolean z, boolean z2, C0973i... iVarArr) {
        this(z, z2, new g71(), iVarArr);
    }

    public MergingMediaSource(boolean z, boolean z2, tn0 tn0, C0973i... iVarArr) {
        this.f5175k = z;
        this.f5176l = z2;
        this.f5177m = iVarArr;
        this.f5180p = tn0;
        this.f5179o = new ArrayList<>(Arrays.asList(iVarArr));
        this.f5183s = -1;
        this.f5178n = new C0831s[iVarArr.length];
        this.f5184t = new long[0][];
        this.f5181q = new HashMap();
        this.f5182r = MultimapBuilder.m36946a().mo35057a().mo35056e();
    }
}
