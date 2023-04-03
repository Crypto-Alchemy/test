package p000;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcc;

/* renamed from: r69 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class r69 implements x09 {

    /* renamed from: d */
    public static final zzcc f33326d = zzcc.zzi("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a */
    public final Context f33327a;

    /* renamed from: b */
    public final C6011ix f33328b;

    /* renamed from: c */
    public final ce9 f33329c;

    public r69(Context context, C6011ix ixVar, ce9 ce9) {
        this.f33327a = context;
        this.f33328b = ixVar;
        this.f33329c = ce9;
    }

    /* renamed from: a */
    public static boolean m50962a(Context context) {
        if (DynamiteModule.m33816a(context, "com.google.mlkit.dynamite.barcode") > 0) {
            return true;
        }
        return false;
    }
}
