package p000;

import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

/* renamed from: m67 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m67 implements EventListener.Factory {

    /* renamed from: a */
    public final /* synthetic */ EventListener f40796a;

    public /* synthetic */ m67(EventListener eventListener) {
        this.f40796a = eventListener;
    }

    public final EventListener create(Call call) {
        return Util.m75780asFactory$lambda8(this.f40796a, call);
    }
}
