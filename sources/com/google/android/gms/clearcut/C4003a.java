package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.C4078r;
import com.google.android.gms.internal.clearcut.zzge$zzv$zzb;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.clearcut.a */
public final class C4003a {

    /* renamed from: n */
    public static final C4013a.C4022g<a19> f22087n;

    /* renamed from: o */
    public static final C4013a.C4014a<a19, Object> f22088o;
    @Deprecated

    /* renamed from: p */
    public static final C4013a<Object> f22089p;

    /* renamed from: q */
    public static final ExperimentTokens[] f22090q = new ExperimentTokens[0];

    /* renamed from: r */
    public static final String[] f22091r = new String[0];

    /* renamed from: s */
    public static final byte[][] f22092s = new byte[0][];

    /* renamed from: a */
    public final Context f22093a;

    /* renamed from: b */
    public final String f22094b;

    /* renamed from: c */
    public final int f22095c;

    /* renamed from: d */
    public String f22096d;

    /* renamed from: e */
    public int f22097e;

    /* renamed from: f */
    public String f22098f;

    /* renamed from: g */
    public String f22099g;

    /* renamed from: h */
    public final boolean f22100h;

    /* renamed from: i */
    public zzge$zzv$zzb f22101i;

    /* renamed from: j */
    public final ha8 f22102j;

    /* renamed from: k */
    public final bh0 f22103k;

    /* renamed from: l */
    public C4007d f22104l;

    /* renamed from: m */
    public final C4005b f22105m;

    /* renamed from: com.google.android.gms.clearcut.a$a */
    public class C4004a {

        /* renamed from: a */
        public int f22106a;

        /* renamed from: b */
        public String f22107b;

        /* renamed from: c */
        public String f22108c;

        /* renamed from: d */
        public String f22109d;

        /* renamed from: e */
        public zzge$zzv$zzb f22110e;

        /* renamed from: f */
        public final C4006c f22111f;

        /* renamed from: g */
        public ArrayList<Integer> f22112g;

        /* renamed from: h */
        public ArrayList<String> f22113h;

        /* renamed from: i */
        public ArrayList<Integer> f22114i;

        /* renamed from: j */
        public ArrayList<ExperimentTokens> f22115j;

        /* renamed from: k */
        public ArrayList<byte[]> f22116k;

        /* renamed from: l */
        public boolean f22117l;

        /* renamed from: m */
        public final mv8 f22118m;

        /* renamed from: n */
        public boolean f22119n;

        public C4004a(C4003a aVar, byte[] bArr) {
            this(bArr, (C4006c) null);
        }

        public C4004a(byte[] bArr, C4006c cVar) {
            this.f22106a = C4003a.this.f22097e;
            this.f22107b = C4003a.this.f22096d;
            this.f22108c = C4003a.this.f22098f;
            this.f22109d = null;
            this.f22110e = C4003a.this.f22101i;
            this.f22112g = null;
            this.f22113h = null;
            this.f22114i = null;
            this.f22115j = null;
            this.f22116k = null;
            this.f22117l = true;
            mv8 mv8 = new mv8();
            this.f22118m = mv8;
            this.f22119n = false;
            this.f22108c = C4003a.this.f22098f;
            this.f22109d = null;
            mv8.f31854e1 = k58.m46866a(C4003a.this.f22093a);
            mv8.f31852e = C4003a.this.f22103k.mo29580a();
            mv8.f31855g = C4003a.this.f22103k.mo29581b();
            C4007d unused = C4003a.this.f22104l;
            mv8.f31847U = (long) (TimeZone.getDefault().getOffset(mv8.f31852e) / 1000);
            if (bArr != null) {
                mv8.f31842I = bArr;
            }
            this.f22111f = null;
        }

        public /* synthetic */ C4004a(C4003a aVar, byte[] bArr, l48 l48) {
            this(aVar, bArr);
        }

        /* renamed from: a */
        public void mo30420a() {
            if (!this.f22119n) {
                this.f22119n = true;
                zze zze = new zze(new zzr(C4003a.this.f22094b, C4003a.this.f22095c, this.f22106a, this.f22107b, this.f22108c, this.f22109d, C4003a.this.f22100h, this.f22110e), this.f22118m, (C4006c) null, (C4006c) null, C4003a.m33530d((ArrayList<Integer>) null), (String[]) null, C4003a.m33530d((ArrayList<Integer>) null), (byte[][]) null, (ExperimentTokens[]) null, this.f22117l);
                if (C4003a.this.f22105m.mo30422a(zze)) {
                    C4003a.this.f22102j.mo43117b(zze);
                } else {
                    gn4.m44790a(Status.f22191s, (GoogleApiClient) null);
                }
            } else {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
        }

        /* renamed from: b */
        public C4004a mo30421b(int i) {
            this.f22118m.f31859s = i;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.clearcut.a$b */
    public interface C4005b {
        /* renamed from: a */
        boolean mo30422a(zze zze);
    }

    /* renamed from: com.google.android.gms.clearcut.a$c */
    public interface C4006c {
        byte[] zza();
    }

    /* renamed from: com.google.android.gms.clearcut.a$d */
    public static class C4007d {
    }

    static {
        C4013a.C4022g<a19> gVar = new C4013a.C4022g<>();
        f22087n = gVar;
        l48 l48 = new l48();
        f22088o = l48;
        f22089p = new C4013a<>("ClearcutLogger.API", l48, gVar);
    }

    public C4003a(Context context, int i, String str, String str2, String str3, boolean z, ha8 ha8, bh0 bh0, C4007d dVar, C4005b bVar) {
        this.f22097e = -1;
        zzge$zzv$zzb zzge_zzv_zzb = zzge$zzv$zzb.DEFAULT;
        this.f22101i = zzge_zzv_zzb;
        this.f22093a = context;
        this.f22094b = context.getPackageName();
        this.f22095c = m33528b(context);
        this.f22097e = -1;
        this.f22096d = str;
        this.f22098f = str2;
        this.f22099g = null;
        this.f22100h = z;
        this.f22102j = ha8;
        this.f22103k = bh0;
        this.f22104l = new C4007d();
        this.f22101i = zzge_zzv_zzb;
        this.f22105m = bVar;
        if (z) {
            cu4.m43212b(str2 == null, "can't be anonymous with an upload account");
        }
    }

    public C4003a(Context context, String str, String str2) {
        this(context, -1, str, str2, (String) null, false, ll8.m47839p(context), e71.m43806c(), (C4007d) null, new C4078r(context));
    }

    /* renamed from: b */
    public static int m33528b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
            return 0;
        }
    }

    /* renamed from: d */
    public static int[] m33530d(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Integer num = arrayList.get(i);
            i++;
            iArr[i2] = num.intValue();
            i2++;
        }
        return iArr;
    }

    /* renamed from: a */
    public final C4004a mo30419a(byte[] bArr) {
        return new C4004a(this, bArr, (l48) null);
    }
}
