package p000;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: a28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class a28 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static a28 m31651b(Activity activity, Intent intent, int i) {
        return new c18(intent, activity, i);
    }

    /* renamed from: c */
    public static a28 m31652c(qg3 qg3, Intent intent, int i) {
        return new u18(intent, qg3, 2);
    }

    /* renamed from: a */
    public abstract void mo28796a();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        android.os.Build.FINGERPRINT.contains("generic");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r2.dismiss();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r2, int r3) {
        /*
            r1 = this;
            r1.mo28796a()     // Catch:{ ActivityNotFoundException -> 0x0009 }
            r2.dismiss()
            return
        L_0x0007:
            r3 = move-exception
            goto L_0x0014
        L_0x0009:
            java.lang.String r3 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x0007 }
            java.lang.String r0 = "generic"
            r3.contains(r0)     // Catch:{ all -> 0x0007 }
            r2.dismiss()
            return
        L_0x0014:
            r2.dismiss()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a28.onClick(android.content.DialogInterface, int):void");
    }
}
