package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.media3.common.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: androidx.media3.exoplayer.drm.g */
/* compiled from: ExoMediaDrm */
public interface C0921g {

    /* renamed from: androidx.media3.exoplayer.drm.g$a */
    /* compiled from: ExoMediaDrm */
    public static final class C0922a {

        /* renamed from: a */
        public final byte[] f5015a;

        /* renamed from: b */
        public final String f5016b;

        /* renamed from: c */
        public final int f5017c;

        public C0922a(byte[] bArr, String str, int i) {
            this.f5015a = bArr;
            this.f5016b = str;
            this.f5017c = i;
        }

        /* renamed from: a */
        public byte[] mo7410a() {
            return this.f5015a;
        }

        /* renamed from: b */
        public String mo7411b() {
            return this.f5016b;
        }
    }

    /* renamed from: androidx.media3.exoplayer.drm.g$b */
    /* compiled from: ExoMediaDrm */
    public interface C0923b {
        /* renamed from: a */
        void mo7373a(C0921g gVar, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    /* renamed from: androidx.media3.exoplayer.drm.g$c */
    /* compiled from: ExoMediaDrm */
    public interface C0924c {
        /* renamed from: a */
        C0921g mo7412a(UUID uuid);
    }

    /* renamed from: androidx.media3.exoplayer.drm.g$d */
    /* compiled from: ExoMediaDrm */
    public static final class C0925d {

        /* renamed from: a */
        public final byte[] f5018a;

        /* renamed from: b */
        public final String f5019b;

        public C0925d(byte[] bArr, String str) {
            this.f5018a = bArr;
            this.f5019b = str;
        }

        /* renamed from: a */
        public byte[] mo7413a() {
            return this.f5018a;
        }

        /* renamed from: b */
        public String mo7414b() {
            return this.f5019b;
        }
    }

    /* renamed from: a */
    void mo7396a();

    /* renamed from: b */
    Map<String, String> mo7397b(byte[] bArr);

    /* renamed from: c */
    C0925d mo7398c();

    /* renamed from: d */
    byte[] mo7399d() throws MediaDrmException;

    /* renamed from: e */
    void mo7400e(byte[] bArr, byte[] bArr2);

    /* renamed from: f */
    void mo7401f(byte[] bArr) throws DeniedByServerException;

    /* renamed from: g */
    int mo7402g();

    /* renamed from: h */
    void mo7403h(byte[] bArr, br4 br4);

    /* renamed from: i */
    hw0 mo7404i(byte[] bArr) throws MediaCryptoException;

    /* renamed from: j */
    boolean mo7405j(byte[] bArr, String str);

    /* renamed from: k */
    void mo7406k(byte[] bArr);

    /* renamed from: l */
    byte[] mo7407l(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    /* renamed from: m */
    void mo7408m(C0923b bVar);

    /* renamed from: n */
    C0922a mo7409n(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException;
}
