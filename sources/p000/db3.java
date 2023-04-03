package p000;

import com.google.crypto.tink.C4650d;
import com.google.crypto.tink.KeyTemplate;
import java.security.GeneralSecurityException;

/* renamed from: db3 */
/* compiled from: KeyTemplates */
public final class db3 {
    /* renamed from: a */
    public static KeyTemplate m43437a(String str) throws GeneralSecurityException {
        KeyTemplate keyTemplate = C4650d.m37112h().get(str);
        if (keyTemplate != null) {
            return keyTemplate;
        }
        throw new GeneralSecurityException("cannot find key template: " + str);
    }
}
