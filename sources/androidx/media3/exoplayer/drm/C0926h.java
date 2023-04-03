package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrm$PlaybackComponent;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.drm.C0921g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: androidx.media3.exoplayer.drm.h */
/* compiled from: FrameworkMediaDrm */
public final class C0926h implements C0921g {

    /* renamed from: d */
    public static final C0921g.C0924c f5020d = new yb2();

    /* renamed from: a */
    public final UUID f5021a;

    /* renamed from: b */
    public final MediaDrm f5022b;

    /* renamed from: c */
    public int f5023c = 1;

    /* renamed from: androidx.media3.exoplayer.drm.h$a */
    /* compiled from: FrameworkMediaDrm */
    public static class C0927a {
        /* renamed from: a */
        public static boolean m6691a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        /* renamed from: b */
        public static void m6692b(MediaDrm mediaDrm, byte[] bArr, br4 br4) {
            LogSessionId a = br4.mo11789a();
            if (!a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                ((MediaDrm$PlaybackComponent) C2725kr.m20985e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(a);
            }
        }
    }

    public C0926h(UUID uuid) throws UnsupportedSchemeException {
        C2725kr.m20985e(uuid);
        C2725kr.m20982b(!l70.f14424b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f5021a = uuid;
        MediaDrm mediaDrm = new MediaDrm(m6671u(uuid));
        this.f5022b = mediaDrm;
        if (l70.f14426d.equals(uuid) && m6663B()) {
            m6672w(mediaDrm);
        }
    }

    /* renamed from: A */
    public static /* synthetic */ C0921g m6662A(UUID uuid) {
        try {
            return m6664C(uuid);
        } catch (UnsupportedDrmException unused) {
            gk3.m18126c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C0919e();
        }
    }

    /* renamed from: B */
    public static boolean m6663B() {
        return "ASUS_Z00AD".equals(w67.f19024d);
    }

    /* renamed from: C */
    public static C0926h m6664C(UUID uuid) throws UnsupportedDrmException {
        try {
            return new C0926h(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        }
    }

    /* renamed from: q */
    public static byte[] m6667q(byte[] bArr) {
        gm4 gm4 = new gm4(bArr);
        int q = gm4.mo20692q();
        short s = gm4.mo20694s();
        short s2 = gm4.mo20694s();
        if (s == 1 && s2 == 1) {
            short s3 = gm4.mo20694s();
            Charset charset = be0.f21265e;
            String B = gm4.mo20660B(s3, charset);
            if (B.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = B.indexOf("</DATA>");
            if (indexOf == -1) {
                gk3.m18132i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = B.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + B.substring(indexOf);
            int i = q + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i);
            allocate.putShort((short) s);
            allocate.putShort((short) s2);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        gk3.m18129f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    /* renamed from: r */
    public static byte[] m6668r(UUID uuid, byte[] bArr) {
        if (l70.f14425c.equals(uuid)) {
            return ig0.m19595a(bArr);
        }
        return bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L_0x005f;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m6669s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = p000.l70.f14427e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x0018
            byte[] r1 = p000.sy4.m27190e(r4, r3)
            if (r1 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r4 = r1
        L_0x0010:
            byte[] r4 = m6667q(r4)
            byte[] r4 = p000.sy4.m27186a(r0, r4)
        L_0x0018:
            int r1 = p000.w67.f19021a
            r2 = 23
            if (r1 >= r2) goto L_0x0026
            java.util.UUID r1 = p000.l70.f14426d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0058
        L_0x0026:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = p000.w67.f19023c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = p000.w67.f19024d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
        L_0x0058:
            byte[] r3 = p000.sy4.m27190e(r4, r3)
            if (r3 == 0) goto L_0x005f
            return r3
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.C0926h.m6669s(java.util.UUID, byte[]):byte[]");
    }

    /* renamed from: t */
    public static String m6670t(UUID uuid, String str) {
        if (w67.f19021a >= 26 || !l70.f14425c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) {
            return str;
        }
        return "cenc";
    }

    /* renamed from: u */
    public static UUID m6671u(UUID uuid) {
        if (w67.f19021a >= 27 || !l70.f14425c.equals(uuid)) {
            return uuid;
        }
        return l70.f14424b;
    }

    /* renamed from: w */
    public static void m6672w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* renamed from: y */
    public static DrmInitData.SchemeData m6673y(UUID uuid, List<DrmInitData.SchemeData> list) {
        boolean z;
        if (!l70.f14426d.equals(uuid)) {
            return list.get(0);
        }
        if (w67.f19021a >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= list.size()) {
                    z = true;
                    break;
                }
                DrmInitData.SchemeData schemeData2 = list.get(i);
                byte[] bArr = (byte[]) C2725kr.m20985e(schemeData2.f4119k);
                if (!w67.m29346c(schemeData2.f4118g, schemeData.f4118g) || !w67.m29346c(schemeData2.f4117e, schemeData.f4117e) || !sy4.m27188c(bArr)) {
                    z = false;
                } else {
                    i2 += bArr.length;
                    i++;
                }
            }
            z = false;
            if (z) {
                byte[] bArr2 = new byte[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    byte[] bArr3 = (byte[]) C2725kr.m20985e(list.get(i4).f4119k);
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i3, length);
                    i3 += length;
                }
                return schemeData.mo6527b(bArr2);
            }
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            DrmInitData.SchemeData schemeData3 = list.get(i5);
            int g = sy4.m27192g((byte[]) C2725kr.m20985e(schemeData3.f4119k));
            int i6 = w67.f19021a;
            if (i6 < 23 && g == 0) {
                return schemeData3;
            }
            if (i6 >= 23 && g == 1) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m6674z(C0921g.C0923b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        bVar.mo7373a(this, bArr, i, i2, bArr2);
    }

    /* renamed from: a */
    public synchronized void mo7396a() {
        int i = this.f5023c - 1;
        this.f5023c = i;
        if (i == 0) {
            this.f5022b.release();
        }
    }

    /* renamed from: b */
    public Map<String, String> mo7397b(byte[] bArr) {
        return this.f5022b.queryKeyStatus(bArr);
    }

    /* renamed from: c */
    public C0921g.C0925d mo7398c() {
        MediaDrm.ProvisionRequest provisionRequest = this.f5022b.getProvisionRequest();
        return new C0921g.C0925d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    /* renamed from: d */
    public byte[] mo7399d() throws MediaDrmException {
        return this.f5022b.openSession();
    }

    /* renamed from: e */
    public void mo7400e(byte[] bArr, byte[] bArr2) {
        this.f5022b.restoreKeys(bArr, bArr2);
    }

    /* renamed from: f */
    public void mo7401f(byte[] bArr) throws DeniedByServerException {
        this.f5022b.provideProvisionResponse(bArr);
    }

    /* renamed from: g */
    public int mo7402g() {
        return 2;
    }

    /* renamed from: h */
    public void mo7403h(byte[] bArr, br4 br4) {
        if (w67.f19021a >= 31) {
            try {
                C0927a.m6692b(this.f5022b, bArr, br4);
            } catch (UnsupportedOperationException unused) {
                gk3.m18132i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    /* renamed from: j */
    public boolean mo7405j(byte[] bArr, String str) {
        if (w67.f19021a >= 31) {
            return C0927a.m6691a(this.f5022b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f5021a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    /* renamed from: k */
    public void mo7406k(byte[] bArr) {
        this.f5022b.closeSession(bArr);
    }

    /* renamed from: l */
    public byte[] mo7407l(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (l70.f14425c.equals(this.f5021a)) {
            bArr2 = ig0.m19596b(bArr2);
        }
        return this.f5022b.provideKeyResponse(bArr, bArr2);
    }

    /* renamed from: m */
    public void mo7408m(C0921g.C0923b bVar) {
        zb2 zb2;
        MediaDrm mediaDrm = this.f5022b;
        if (bVar == null) {
            zb2 = null;
        } else {
            zb2 = new zb2(this, bVar);
        }
        mediaDrm.setOnEventListener(zb2);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: n */
    public C0921g.C0922a mo7409n(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException {
        String str;
        byte[] bArr2;
        int i2;
        DrmInitData.SchemeData schemeData = null;
        if (list != null) {
            schemeData = m6673y(this.f5021a, list);
            bArr2 = m6669s(this.f5021a, (byte[]) C2725kr.m20985e(schemeData.f4119k));
            str = m6670t(this.f5021a, schemeData.f4118g);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f5022b.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] r = m6668r(this.f5021a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeData != null && !TextUtils.isEmpty(schemeData.f4117e)) {
            defaultUrl = schemeData.f4117e;
        }
        if (w67.f19021a >= 23) {
            i2 = keyRequest.getRequestType();
        } else {
            i2 = Integer.MIN_VALUE;
        }
        return new C0921g.C0922a(r, defaultUrl, i2);
    }

    /* renamed from: v */
    public xb2 mo7404i(byte[] bArr) throws MediaCryptoException {
        boolean z;
        if (w67.f19021a >= 21 || !l70.f14426d.equals(this.f5021a) || !"L3".equals(mo7416x("securityLevel"))) {
            z = false;
        } else {
            z = true;
        }
        return new xb2(m6671u(this.f5021a), bArr, z);
    }

    /* renamed from: x */
    public String mo7416x(String str) {
        return this.f5022b.getPropertyString(str);
    }
}
