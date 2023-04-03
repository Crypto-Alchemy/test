package p000;

import androidx.emoji2.text.C0593c;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: bo1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class bo1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ EmojiCompatInitializer.C0584b f8221a;

    /* renamed from: d */
    public final /* synthetic */ C0593c.C0602h f8222d;

    /* renamed from: e */
    public final /* synthetic */ ThreadPoolExecutor f8223e;

    public /* synthetic */ bo1(EmojiCompatInitializer.C0584b bVar, C0593c.C0602h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f8221a = bVar;
        this.f8222d = hVar;
        this.f8223e = threadPoolExecutor;
    }

    public final void run() {
        this.f8221a.m4494d(this.f8222d, this.f8223e);
    }
}
