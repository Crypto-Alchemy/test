package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import org.web3j.abi.datatypes.Utf8String;

/* renamed from: f08 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class f08 {

    /* renamed from: a */
    public static final y16 f28709a = new y16();

    /* renamed from: b */
    public static Locale f28710b;

    /* renamed from: a */
    public static String m44122a(Context context) {
        String packageName = context.getPackageName();
        try {
            return tn7.m52384a(context).mo45810d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    /* renamed from: b */
    public static String m44123b(Context context) {
        return context.getResources().getString(w45.common_google_play_services_notification_channel_name);
    }

    /* renamed from: c */
    public static String m44124c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(w45.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(w45.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(w45.common_google_play_services_enable_button);
    }

    /* renamed from: d */
    public static String m44125d(Context context, int i) {
        Resources resources = context.getResources();
        String a = m44122a(context);
        if (i == 1) {
            return resources.getString(w45.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(w45.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m44129h(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m44129h(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(w45.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m44129h(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m44129h(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m44129h(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(w45.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(x45.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (le1.m47792d(context)) {
            return resources.getString(w45.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(w45.common_google_play_services_update_text, new Object[]{a});
        }
    }

    /* renamed from: e */
    public static String m44126e(Context context, int i) {
        if (i == 6 || i == 19) {
            return m44129h(context, "common_google_play_services_resolution_required_text", m44122a(context));
        }
        return m44125d(context, i);
    }

    /* renamed from: f */
    public static String m44127f(Context context, int i) {
        String str;
        if (i == 6) {
            str = m44130i(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m44128g(context, i);
        }
        if (str == null) {
            return context.getResources().getString(w45.common_google_play_services_notification_ticker);
        }
        return str;
    }

    /* renamed from: g */
    public static String m44128g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(w45.common_google_play_services_install_title);
            case 2:
                return resources.getString(w45.common_google_play_services_update_title);
            case 3:
                return resources.getString(w45.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return m44130i(context, "common_google_play_services_invalid_account_title");
            case 7:
                return m44130i(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 17:
                return m44130i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return m44130i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected error code ");
                sb.append(i);
                return null;
        }
    }

    /* renamed from: h */
    public static String m44129h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m44130i(context, str);
        if (i == null) {
            i = resources.getString(x45.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i, new Object[]{str2});
    }

    /* renamed from: i */
    public static String m44130i(Context context, String str) {
        y16 y16 = f28709a;
        synchronized (y16) {
            Locale c = qo0.m25803a(context.getResources().getConfiguration()).mo26464c(0);
            if (!c.equals(f28710b)) {
                y16.clear();
                f28710b = c;
            }
            String str2 = (String) y16.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources e = li2.m47823e(context);
            if (e == null) {
                return null;
            }
            int identifier = e.getIdentifier(str, Utf8String.TYPE_NAME, "com.google.android.gms");
            if (identifier == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing resource: ");
                sb.append(str);
                return null;
            }
            String string = e.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Got empty resource: ");
                sb2.append(str);
                return null;
            }
            y16.put(str, string);
            return string;
        }
    }
}
