package com.onesignal;

import com.onesignal.FocusTimeController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.onesignal.v */
/* compiled from: OSFocusTimeProcessorFactory */
public class C5335v {

    /* renamed from: a */
    public final HashMap<String, FocusTimeController.C5099b> f26553a;

    public C5335v() {
        HashMap<String, FocusTimeController.C5099b> hashMap = new HashMap<>();
        this.f26553a = hashMap;
        hashMap.put(FocusTimeController.C5101c.class.getName(), new FocusTimeController.C5101c());
        hashMap.put(FocusTimeController.C5098a.class.getName(), new FocusTimeController.C5098a());
    }

    /* renamed from: a */
    public final FocusTimeController.C5099b mo39129a() {
        return this.f26553a.get(FocusTimeController.C5098a.class.getName());
    }

    /* renamed from: b */
    public FocusTimeController.C5099b mo39130b() {
        FocusTimeController.C5099b a = mo39129a();
        for (id4 d : a.mo38398j()) {
            if (d.mo43566d().isAttributed()) {
                return a;
            }
        }
        return mo39132d();
    }

    /* renamed from: c */
    public FocusTimeController.C5099b mo39131c(List<id4> list) {
        boolean z;
        Iterator<id4> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo43566d().isAttributed()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return mo39129a();
        }
        return mo39132d();
    }

    /* renamed from: d */
    public final FocusTimeController.C5099b mo39132d() {
        return this.f26553a.get(FocusTimeController.C5101c.class.getName());
    }
}
