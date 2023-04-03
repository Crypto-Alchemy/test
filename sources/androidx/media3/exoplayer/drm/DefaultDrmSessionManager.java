package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.C0792h;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.drm.C0909b;
import androidx.media3.exoplayer.drm.C0912c;
import androidx.media3.exoplayer.drm.C0921g;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.upstream.C1018a;
import androidx.media3.exoplayer.upstream.C1019b;
import com.google.common.collect.C4632i;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class DefaultDrmSessionManager implements C0912c {

    /* renamed from: c */
    public final UUID f4960c;

    /* renamed from: d */
    public final C0921g.C0924c f4961d;

    /* renamed from: e */
    public final C0929j f4962e;

    /* renamed from: f */
    public final HashMap<String, String> f4963f;

    /* renamed from: g */
    public final boolean f4964g;

    /* renamed from: h */
    public final int[] f4965h;

    /* renamed from: i */
    public final boolean f4966i;

    /* renamed from: j */
    public final C0906f f4967j;

    /* renamed from: k */
    public final C1019b f4968k;

    /* renamed from: l */
    public final C0907g f4969l;

    /* renamed from: m */
    public final long f4970m;

    /* renamed from: n */
    public final List<DefaultDrmSession> f4971n;

    /* renamed from: o */
    public final Set<C0905e> f4972o;

    /* renamed from: p */
    public final Set<DefaultDrmSession> f4973p;

    /* renamed from: q */
    public int f4974q;

    /* renamed from: r */
    public C0921g f4975r;

    /* renamed from: s */
    public DefaultDrmSession f4976s;

    /* renamed from: t */
    public DefaultDrmSession f4977t;

    /* renamed from: u */
    public Looper f4978u;

    /* renamed from: v */
    public Handler f4979v;

    /* renamed from: w */
    public int f4980w;

    /* renamed from: x */
    public byte[] f4981x;

    /* renamed from: y */
    public br4 f4982y;

    /* renamed from: z */
    public volatile C0904d f4983z;

    public static final class MissingSchemeDataException extends Exception {
        public MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$b */
    public static final class C0902b {

        /* renamed from: a */
        public final HashMap<String, String> f4984a = new HashMap<>();

        /* renamed from: b */
        public UUID f4985b = l70.f14426d;

        /* renamed from: c */
        public C0921g.C0924c f4986c = C0926h.f5020d;

        /* renamed from: d */
        public boolean f4987d;

        /* renamed from: e */
        public int[] f4988e = new int[0];

        /* renamed from: f */
        public boolean f4989f;

        /* renamed from: g */
        public C1019b f4990g = new C1018a();

        /* renamed from: h */
        public long f4991h = 300000;

        /* renamed from: a */
        public DefaultDrmSessionManager mo7368a(C0929j jVar) {
            return new DefaultDrmSessionManager(this.f4985b, this.f4986c, jVar, this.f4984a, this.f4987d, this.f4988e, this.f4989f, this.f4990g, this.f4991h);
        }

        /* renamed from: b */
        public C0902b mo7369b(boolean z) {
            this.f4987d = z;
            return this;
        }

        /* renamed from: c */
        public C0902b mo7370c(boolean z) {
            this.f4989f = z;
            return this;
        }

        /* renamed from: d */
        public C0902b mo7371d(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (!(i == 2 || i == 1)) {
                    z = false;
                }
                C2725kr.m20981a(z);
            }
            this.f4988e = (int[]) iArr.clone();
            return this;
        }

        /* renamed from: e */
        public C0902b mo7372e(UUID uuid, C0921g.C0924c cVar) {
            this.f4985b = (UUID) C2725kr.m20985e(uuid);
            this.f4986c = (C0921g.C0924c) C2725kr.m20985e(cVar);
            return this;
        }
    }

    /* renamed from: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$c */
    public class C0903c implements C0921g.C0923b {
        public C0903c() {
        }

        /* renamed from: a */
        public void mo7373a(C0921g gVar, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((C0904d) C2725kr.m20985e(DefaultDrmSessionManager.this.f4983z)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$d */
    public class C0904d extends Handler {
        public C0904d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f4971n) {
                    if (defaultDrmSession.mo7331p(bArr)) {
                        defaultDrmSession.mo7337x(message.what);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$e */
    public class C0905e implements C0912c.C0914b {

        /* renamed from: b */
        public final C0909b.C0910a f4994b;

        /* renamed from: c */
        public DrmSession f4995c;

        /* renamed from: d */
        public boolean f4996d;

        public C0905e(C0909b.C0910a aVar) {
            this.f4994b = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m6553e(C0792h hVar) {
            if (DefaultDrmSessionManager.this.f4974q != 0 && !this.f4996d) {
                DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
                this.f4995c = defaultDrmSessionManager.mo7364u((Looper) C2725kr.m20985e(defaultDrmSessionManager.f4978u), this.f4994b, hVar, false);
                DefaultDrmSessionManager.this.f4972o.add(this);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m6554f() {
            if (!this.f4996d) {
                DrmSession drmSession = this.f4995c;
                if (drmSession != null) {
                    drmSession.mo7324f(this.f4994b);
                }
                DefaultDrmSessionManager.this.f4972o.remove(this);
                this.f4996d = true;
            }
        }

        /* renamed from: a */
        public void mo7375a() {
            w67.m29307G0((Handler) C2725kr.m20985e(DefaultDrmSessionManager.this.f4979v), new s71(this));
        }

        /* renamed from: d */
        public void mo7376d(C0792h hVar) {
            ((Handler) C2725kr.m20985e(DefaultDrmSessionManager.this.f4979v)).post(new t71(this, hVar));
        }
    }

    /* renamed from: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$f */
    public class C0906f implements DefaultDrmSession.C0896a {

        /* renamed from: a */
        public final Set<DefaultDrmSession> f4998a = new HashSet();

        /* renamed from: b */
        public DefaultDrmSession f4999b;

        public C0906f(DefaultDrmSessionManager defaultDrmSessionManager) {
        }

        /* renamed from: a */
        public void mo7340a(Exception exc, boolean z) {
            this.f4999b = null;
            ImmutableList<DefaultDrmSession> copyOf = ImmutableList.copyOf(this.f4998a);
            this.f4998a.clear();
            c47<DefaultDrmSession> it = copyOf.iterator();
            while (it.hasNext()) {
                it.next().mo7339z(exc, z);
            }
        }

        /* renamed from: b */
        public void mo7341b() {
            this.f4999b = null;
            ImmutableList<DefaultDrmSession> copyOf = ImmutableList.copyOf(this.f4998a);
            this.f4998a.clear();
            c47<DefaultDrmSession> it = copyOf.iterator();
            while (it.hasNext()) {
                it.next().mo7338y();
            }
        }

        /* renamed from: c */
        public void mo7342c(DefaultDrmSession defaultDrmSession) {
            this.f4998a.add(defaultDrmSession);
            if (this.f4999b == null) {
                this.f4999b = defaultDrmSession;
                defaultDrmSession.mo7317D();
            }
        }

        /* renamed from: d */
        public void mo7377d(DefaultDrmSession defaultDrmSession) {
            this.f4998a.remove(defaultDrmSession);
            if (this.f4999b == defaultDrmSession) {
                this.f4999b = null;
                if (!this.f4998a.isEmpty()) {
                    DefaultDrmSession next = this.f4998a.iterator().next();
                    this.f4999b = next;
                    next.mo7317D();
                }
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$g */
    public class C0907g implements DefaultDrmSession.C0897b {
        public C0907g() {
        }

        /* renamed from: a */
        public void mo7343a(DefaultDrmSession defaultDrmSession, int i) {
            if (DefaultDrmSessionManager.this.f4970m != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                DefaultDrmSessionManager.this.f4973p.remove(defaultDrmSession);
                ((Handler) C2725kr.m20985e(DefaultDrmSessionManager.this.f4979v)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        /* renamed from: b */
        public void mo7344b(DefaultDrmSession defaultDrmSession, int i) {
            if (i == 1 && DefaultDrmSessionManager.this.f4974q > 0 && DefaultDrmSessionManager.this.f4970m != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                DefaultDrmSessionManager.this.f4973p.add(defaultDrmSession);
                ((Handler) C2725kr.m20985e(DefaultDrmSessionManager.this.f4979v)).postAtTime(new u71(defaultDrmSession), defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f4970m);
            } else if (i == 0) {
                DefaultDrmSessionManager.this.f4971n.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f4976s == defaultDrmSession) {
                    DefaultDrmSession unused = DefaultDrmSessionManager.this.f4976s = null;
                }
                if (DefaultDrmSessionManager.this.f4977t == defaultDrmSession) {
                    DefaultDrmSession unused2 = DefaultDrmSessionManager.this.f4977t = null;
                }
                DefaultDrmSessionManager.this.f4967j.mo7377d(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f4970m != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    ((Handler) C2725kr.m20985e(DefaultDrmSessionManager.this.f4979v)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f4973p.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.mo7353D();
        }
    }

    /* renamed from: v */
    public static boolean m6525v(DrmSession drmSession) {
        if (drmSession.getState() != 1 || (w67.f19021a >= 19 && !(((DrmSession.DrmSessionException) C2725kr.m20985e(drmSession.getError())).getCause() instanceof ResourceBusyException))) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public static List<DrmInitData.SchemeData> m6526z(DrmInitData drmInitData, UUID uuid, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList(drmInitData.f4114g);
        for (int i = 0; i < drmInitData.f4114g; i++) {
            DrmInitData.SchemeData e = drmInitData.mo6522e(i);
            if (e.mo6529d(uuid) || (l70.f14425c.equals(uuid) && e.mo6529d(l70.f14424b))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (e.f4119k != null || z)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    /* renamed from: A */
    public final synchronized void mo7350A(Looper looper) {
        boolean z;
        Looper looper2 = this.f4978u;
        if (looper2 == null) {
            this.f4978u = looper;
            this.f4979v = new Handler(looper);
        } else {
            if (looper2 == looper) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20987g(z);
            C2725kr.m20985e(this.f4979v);
        }
    }

    /* renamed from: B */
    public final DrmSession mo7351B(int i, boolean z) {
        boolean z2;
        C0921g gVar = (C0921g) C2725kr.m20985e(this.f4975r);
        if (gVar.mo7402g() != 2 || !xb2.f19804d) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 || w67.m29385v0(this.f4965h, i) == -1 || gVar.mo7402g() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f4976s;
        if (defaultDrmSession == null) {
            DefaultDrmSession y = mo7367y(ImmutableList.m36627of(), true, (C0909b.C0910a) null, z);
            this.f4971n.add(y);
            this.f4976s = y;
        } else {
            defaultDrmSession.mo7322d((C0909b.C0910a) null);
        }
        return this.f4976s;
    }

    /* renamed from: C */
    public final void mo7352C(Looper looper) {
        if (this.f4983z == null) {
            this.f4983z = new C0904d(looper);
        }
    }

    /* renamed from: D */
    public final void mo7353D() {
        if (this.f4975r != null && this.f4974q == 0 && this.f4971n.isEmpty() && this.f4972o.isEmpty()) {
            ((C0921g) C2725kr.m20985e(this.f4975r)).mo7396a();
            this.f4975r = null;
        }
    }

    /* renamed from: E */
    public final void mo7354E() {
        c47<DefaultDrmSession> it = ImmutableSet.copyOf(this.f4973p).iterator();
        while (it.hasNext()) {
            it.next().mo7324f((C0909b.C0910a) null);
        }
    }

    /* renamed from: F */
    public final void mo7355F() {
        c47<C0905e> it = ImmutableSet.copyOf(this.f4972o).iterator();
        while (it.hasNext()) {
            it.next().mo7375a();
        }
    }

    /* renamed from: G */
    public void mo7356G(int i, byte[] bArr) {
        C2725kr.m20987g(this.f4971n.isEmpty());
        if (i == 1 || i == 3) {
            C2725kr.m20985e(bArr);
        }
        this.f4980w = i;
        this.f4981x = bArr;
    }

    /* renamed from: H */
    public final void mo7357H(DrmSession drmSession, C0909b.C0910a aVar) {
        drmSession.mo7324f(aVar);
        if (this.f4970m != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            drmSession.mo7324f((C0909b.C0910a) null);
        }
    }

    /* renamed from: a */
    public final void mo7358a() {
        int i = this.f4974q - 1;
        this.f4974q = i;
        if (i == 0) {
            if (this.f4970m != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                ArrayList arrayList = new ArrayList(this.f4971n);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((DefaultDrmSession) arrayList.get(i2)).mo7324f((C0909b.C0910a) null);
                }
            }
            mo7355F();
            mo7353D();
        }
    }

    /* renamed from: b */
    public void mo7359b(Looper looper, br4 br4) {
        mo7350A(looper);
        this.f4982y = br4;
    }

    /* renamed from: c */
    public DrmSession mo7360c(C0909b.C0910a aVar, C0792h hVar) {
        boolean z;
        if (this.f4974q > 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        C2725kr.m20989i(this.f4978u);
        return mo7364u(this.f4978u, aVar, hVar, true);
    }

    /* renamed from: d */
    public int mo7361d(C0792h hVar) {
        int g = ((C0921g) C2725kr.m20985e(this.f4975r)).mo7402g();
        DrmInitData drmInitData = hVar.f4178L;
        if (drmInitData == null) {
            if (w67.m29385v0(this.f4965h, vv3.m29135i(hVar.f4175C)) != -1) {
                return g;
            }
            return 0;
        } else if (mo7365w(drmInitData)) {
            return g;
        } else {
            return 1;
        }
    }

    /* renamed from: e */
    public final void mo7362e() {
        int i = this.f4974q;
        this.f4974q = i + 1;
        if (i == 0) {
            if (this.f4975r == null) {
                C0921g a = this.f4961d.mo7412a(this.f4960c);
                this.f4975r = a;
                a.mo7408m(new C0903c());
            } else if (this.f4970m != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                for (int i2 = 0; i2 < this.f4971n.size(); i2++) {
                    this.f4971n.get(i2).mo7322d((C0909b.C0910a) null);
                }
            }
        }
    }

    /* renamed from: f */
    public C0912c.C0914b mo7363f(C0909b.C0910a aVar, C0792h hVar) {
        boolean z;
        if (this.f4974q > 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        C2725kr.m20989i(this.f4978u);
        C0905e eVar = new C0905e(aVar);
        eVar.mo7376d(hVar);
        return eVar;
    }

    /* renamed from: u */
    public final DrmSession mo7364u(Looper looper, C0909b.C0910a aVar, C0792h hVar, boolean z) {
        List<DrmInitData.SchemeData> list;
        mo7352C(looper);
        DrmInitData drmInitData = hVar.f4178L;
        if (drmInitData == null) {
            return mo7351B(vv3.m29135i(hVar.f4175C), z);
        }
        DefaultDrmSession defaultDrmSession = null;
        if (this.f4981x == null) {
            list = m6526z((DrmInitData) C2725kr.m20985e(drmInitData), this.f4960c, false);
            if (list.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f4960c);
                gk3.m18127d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.mo7392l(missingSchemeDataException);
                }
                return new C0920f(new DrmSession.DrmSessionException(missingSchemeDataException, PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR));
            }
        } else {
            list = null;
        }
        if (this.f4964g) {
            Iterator<DefaultDrmSession> it = this.f4971n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession next = it.next();
                if (w67.m29346c(next.f4928a, list)) {
                    defaultDrmSession = next;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.f4977t;
        }
        if (defaultDrmSession == null) {
            defaultDrmSession = mo7367y(list, false, aVar, z);
            if (!this.f4964g) {
                this.f4977t = defaultDrmSession;
            }
            this.f4971n.add(defaultDrmSession);
        } else {
            defaultDrmSession.mo7322d(aVar);
        }
        return defaultDrmSession;
    }

    /* renamed from: w */
    public final boolean mo7365w(DrmInitData drmInitData) {
        if (this.f4981x != null) {
            return true;
        }
        if (m6526z(drmInitData, this.f4960c, true).isEmpty()) {
            if (drmInitData.f4114g != 1 || !drmInitData.mo6522e(0).mo6529d(l70.f14424b)) {
                return false;
            }
            gk3.m18132i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f4960c);
        }
        String str = drmInitData.f4113e;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            if (w67.f19021a >= 25) {
                return true;
            }
            return false;
        } else if ("cbc1".equals(str) || "cens".equals(str)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: x */
    public final DefaultDrmSession mo7366x(List<DrmInitData.SchemeData> list, boolean z, C0909b.C0910a aVar) {
        C2725kr.m20985e(this.f4975r);
        List<DrmInitData.SchemeData> list2 = list;
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f4960c, this.f4975r, this.f4967j, this.f4969l, list2, this.f4980w, this.f4966i | z, z, this.f4981x, this.f4963f, this.f4962e, (Looper) C2725kr.m20985e(this.f4978u), this.f4968k, (br4) C2725kr.m20985e(this.f4982y));
        defaultDrmSession.mo7322d(aVar);
        if (this.f4970m != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            defaultDrmSession.mo7322d((C0909b.C0910a) null);
        }
        return defaultDrmSession;
    }

    /* renamed from: y */
    public final DefaultDrmSession mo7367y(List<DrmInitData.SchemeData> list, boolean z, C0909b.C0910a aVar, boolean z2) {
        DefaultDrmSession x = mo7366x(list, z, aVar);
        if (m6525v(x) && !this.f4973p.isEmpty()) {
            mo7354E();
            mo7357H(x, aVar);
            x = mo7366x(list, z, aVar);
        }
        if (!m6525v(x) || !z2 || this.f4972o.isEmpty()) {
            return x;
        }
        mo7355F();
        if (!this.f4973p.isEmpty()) {
            mo7354E();
        }
        mo7357H(x, aVar);
        return mo7366x(list, z, aVar);
    }

    public DefaultDrmSessionManager(UUID uuid, C0921g.C0924c cVar, C0929j jVar, HashMap<String, String> hashMap, boolean z, int[] iArr, boolean z2, C1019b bVar, long j) {
        C2725kr.m20985e(uuid);
        C2725kr.m20982b(!l70.f14424b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f4960c = uuid;
        this.f4961d = cVar;
        this.f4962e = jVar;
        this.f4963f = hashMap;
        this.f4964g = z;
        this.f4965h = iArr;
        this.f4966i = z2;
        this.f4968k = bVar;
        this.f4967j = new C0906f(this);
        this.f4969l = new C0907g();
        this.f4980w = 0;
        this.f4971n = new ArrayList();
        this.f4972o = C4632i.m37037h();
        this.f4973p = C4632i.m37037h();
        this.f4970m = j;
    }
}
