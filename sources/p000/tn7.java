package p000;

import android.content.Context;

/* renamed from: tn7 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class tn7 {

    /* renamed from: b */
    public static tn7 f34307b = new tn7();

    /* renamed from: a */
    public mk4 f34308a = null;

    /* renamed from: a */
    public static mk4 m52384a(Context context) {
        return f34307b.mo48148b(context);
    }

    /* renamed from: b */
    public final synchronized mk4 mo48148b(Context context) {
        if (this.f34308a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f34308a = new mk4(context);
        }
        return this.f34308a;
    }
}
