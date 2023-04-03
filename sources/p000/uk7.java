package p000;

import android.util.Pair;
import androidx.media3.exoplayer.drm.DrmSession;
import java.util.Map;

/* renamed from: uk7 */
/* compiled from: WidevineUtil */
public final class uk7 {
    /* renamed from: a */
    public static long m28345a(Map<String, String> map, String str) {
        if (map == null) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        } catch (NumberFormatException unused) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
    }

    /* renamed from: b */
    public static Pair<Long, Long> m28346b(DrmSession drmSession) {
        Map<String, String> e = drmSession.mo7323e();
        if (e == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m28345a(e, "LicenseDurationRemaining")), Long.valueOf(m28345a(e, "PlaybackDurationRemaining")));
    }
}
