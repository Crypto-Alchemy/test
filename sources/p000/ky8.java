package p000;

import com.google.android.gms.internal.measurement.zzgs;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ky8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class ky8 {
    /* renamed from: a */
    public static r88 m47572a(Object obj) {
        if (obj == null) {
            return r88.f33331h1;
        }
        if (obj instanceof String) {
            return new b98((String) obj);
        }
        if (obj instanceof Double) {
            return new e78((Double) obj);
        }
        if (obj instanceof Long) {
            return new e78(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new e78(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new s68((Boolean) obj);
        }
        throw new IllegalArgumentException("Invalid value type");
    }

    /* renamed from: b */
    public static r88 m47573b(gu8 gu8) {
        if (gu8 == null) {
            return r88.f33330g1;
        }
        zzgs zzgs = zzgs.UNKNOWN;
        int ordinal = gu8.mo42991x().ordinal();
        if (ordinal == 0) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        List<gu8> y = gu8.mo42992y();
                        ArrayList arrayList = new ArrayList();
                        for (gu8 b : y) {
                            arrayList.add(m47573b(b));
                        }
                        return new u88(gu8.mo42993z(), arrayList);
                    }
                    String valueOf = String.valueOf(gu8);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 16);
                    sb.append("Invalid entity: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                } else if (gu8.mo42987D()) {
                    return new s68(Boolean.valueOf(gu8.mo42988E()));
                } else {
                    return new s68((Boolean) null);
                }
            } else if (gu8.mo42989F()) {
                return new e78(Double.valueOf(gu8.mo42990G()));
            } else {
                return new e78((Double) null);
            }
        } else if (gu8.mo42985B()) {
            return new b98(gu8.mo42986C());
        } else {
            return r88.f33337n1;
        }
    }
}
