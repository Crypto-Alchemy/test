package p000;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

@Immutable
@CheckReturnValue
/* renamed from: ur5 */
/* compiled from: SecretKeyAccess */
public final class ur5 {

    /* renamed from: a */
    public static final ur5 f34682a = new ur5();

    /* renamed from: a */
    public static ur5 m52982a() {
        return f34682a;
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public static ur5 m52983b(ur5 ur5) throws GeneralSecurityException {
        if (ur5 != null) {
            return ur5;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
