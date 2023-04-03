package p000;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ke8 */
/* compiled from: com.google.android.gms:play-services-measurement-api@@19.0.0 */
public final class ke8 {

    /* renamed from: a */
    public static final Set<String> f30860a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: b */
    public static final List<String> f30861b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});

    /* renamed from: c */
    public static final List<String> f30862c = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: d */
    public static final List<String> f30863d = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: e */
    public static final List<String> f30864e = Arrays.asList((String[]) C6441rq.m51218a(fu8.f28992a, fu8.f28993b));

    /* renamed from: f */
    public static final List<String> f30865f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    /* renamed from: a */
    public static boolean m47046a(String str) {
        if (!f30862c.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m47047b(String str, Bundle bundle) {
        if (f30861b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String containsKey : f30863d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m47048c(String str) {
        if (!f30860a.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m47049d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
            return false;
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
            return false;
        } else if (f30864e.contains(str2)) {
            return false;
        } else {
            for (String matches : f30865f) {
                if (str2.matches(matches)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m47050e(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r5 = r0.equals(r5)
            r0 = 1
            if (r5 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r5 = m47046a(r4)
            r1 = 0
            if (r5 != 0) goto L_0x0012
            return r1
        L_0x0012:
            if (r6 != 0) goto L_0x0015
            return r1
        L_0x0015:
            java.util.List<java.lang.String> r5 = f30863d
            java.util.Iterator r5 = r5.iterator()
        L_0x001b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L_0x001b
            return r1
        L_0x002e:
            int r5 = r4.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r5 == r2) goto L_0x0057
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r5 == r2) goto L_0x004d
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r5 == r2) goto L_0x0043
            goto L_0x0061
        L_0x0043:
            java.lang.String r5 = "fiam"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = r3
            goto L_0x0062
        L_0x004d:
            java.lang.String r5 = "fdl"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = r0
            goto L_0x0062
        L_0x0057:
            java.lang.String r5 = "fcm"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = r1
            goto L_0x0062
        L_0x0061:
            r4 = -1
        L_0x0062:
            java.lang.String r5 = "_cis"
            if (r4 == 0) goto L_0x0077
            if (r4 == r0) goto L_0x0071
            if (r4 == r3) goto L_0x006b
            return r1
        L_0x006b:
            java.lang.String r4 = "fiam_integration"
            r6.putString(r5, r4)
            return r0
        L_0x0071:
            java.lang.String r4 = "fdl_integration"
            r6.putString(r5, r4)
            return r0
        L_0x0077:
            java.lang.String r4 = "fcm_integration"
            r6.putString(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ke8.m47050e(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }

    /* renamed from: f */
    public static String m47051f(String str) {
        String a = cu8.m43237a(str);
        if (a != null) {
            return a;
        }
        return str;
    }

    /* renamed from: g */
    public static void m47052g(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }
}
