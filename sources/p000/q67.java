package p000;

import com.google.crypto.tink.proto.C4663a;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import p000.sb3;

/* renamed from: q67 */
/* compiled from: Util */
public final class q67 {

    /* renamed from: a */
    public static final Charset f32953a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static sb3.C6475c m50353a(C4663a.C4666c cVar) {
        return (sb3.C6475c) sb3.C6475c.m51693I().mo47730w(cVar.mo35312H().mo35289I()).mo47729v(cVar.mo35315K()).mo47728u(cVar.mo35314J()).mo47727t(cVar.mo35313I()).build();
    }

    /* renamed from: b */
    public static sb3 m50354b(C4663a aVar) {
        sb3.C6474b u = sb3.m51680I().mo47721u(aVar.mo35305K());
        for (C4663a.C4666c a : aVar.mo35304J()) {
            u.mo47720t(m50353a(a));
        }
        return (sb3) u.build();
    }

    /* renamed from: c */
    public static void m50355c(C4663a.C4666c cVar) throws GeneralSecurityException {
        if (!cVar.mo35316L()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(cVar.mo35313I())}));
        } else if (cVar.mo35314J() == OutputPrefixType.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(cVar.mo35313I())}));
        } else if (cVar.mo35315K() == KeyStatusType.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(cVar.mo35313I())}));
        }
    }

    /* renamed from: d */
    public static void m50356d(C4663a aVar) throws GeneralSecurityException {
        int K = aVar.mo35305K();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        for (C4663a.C4666c next : aVar.mo35304J()) {
            if (next.mo35315K() == KeyStatusType.ENABLED) {
                m50355c(next);
                if (next.mo35313I() == K) {
                    if (!z2) {
                        z2 = true;
                    } else {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                }
                if (next.mo35312H().mo35288H() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    z = false;
                }
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z2 && !z) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
