package p000;

import android.content.Context;
import android.content.res.Resources;
import org.web3j.abi.datatypes.Utf8String;

/* renamed from: hb6 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class hb6 {

    /* renamed from: a */
    public final Resources f29510a;

    /* renamed from: b */
    public final String f29511b;

    public hb6(Context context) {
        cu4.m43221k(context);
        Resources resources = context.getResources();
        this.f29510a = resources;
        this.f29511b = resources.getResourcePackageName(x45.common_google_play_services_unknown_issue);
    }

    /* renamed from: a */
    public String mo43126a(String str) {
        int identifier = this.f29510a.getIdentifier(str, Utf8String.TYPE_NAME, this.f29511b);
        if (identifier == 0) {
            return null;
        }
        return this.f29510a.getString(identifier);
    }
}
