package p000;

import android.content.Context;
import android.content.res.Resources;
import org.web3j.abi.datatypes.Utf8String;

/* renamed from: sq8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class sq8 {
    /* renamed from: a */
    public static String m51887a(Context context) {
        try {
            return context.getResources().getResourcePackageName(x45.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public static final String m51888b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, Utf8String.TYPE_NAME, str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
