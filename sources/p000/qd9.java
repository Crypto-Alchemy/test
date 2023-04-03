package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qd9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class qd9 implements ae9 {

    /* renamed from: a */
    public final List f33067a;

    public qd9(Context context, od9 od9) {
        ArrayList arrayList = new ArrayList();
        this.f33067a = arrayList;
        if (od9.mo44432c()) {
            arrayList.add(new qe9(context, od9));
        }
    }
}
