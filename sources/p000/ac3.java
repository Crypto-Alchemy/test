package p000;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ac3 */
/* compiled from: KmsClients */
public final class ac3 {

    /* renamed from: a */
    public static final CopyOnWriteArrayList<zb3> f20896a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static zb3 m31774a(String str) throws GeneralSecurityException {
        Iterator<zb3> it = f20896a.iterator();
        while (it.hasNext()) {
            zb3 next = it.next();
            if (next.mo47796a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
