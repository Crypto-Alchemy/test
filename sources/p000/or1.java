package p000;

import android.content.Context;

/* renamed from: or1 */
/* compiled from: ErrorUtils */
public class or1 {
    /* renamed from: a */
    public static String m23963a(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(r45.fingerprint_error_hw_not_available);
        }
        if (i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                    return context.getString(r45.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(r45.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(r45.fingerprint_error_hw_not_present);
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown error code: ");
                    sb.append(i);
                    return context.getString(r45.default_error_msg);
            }
        }
        return context.getString(r45.fingerprint_error_lockout);
    }

    /* renamed from: b */
    public static boolean m23964b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: c */
    public static boolean m23965c(int i) {
        return i == 7 || i == 9;
    }
}
