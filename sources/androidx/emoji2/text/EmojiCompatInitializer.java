package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.C0593c;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer implements fu2<Boolean> {

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    public static class C0583a extends C0593c.C0597c {
        public C0583a(Context context) {
            super(new C0584b(context));
            mo5639b(1);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    public static class C0584b implements C0593c.C0601g {

        /* renamed from: a */
        public final Context f3523a;

        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        public class C0585a extends C0593c.C0602h {

            /* renamed from: a */
            public final /* synthetic */ C0593c.C0602h f3524a;

            /* renamed from: b */
            public final /* synthetic */ ThreadPoolExecutor f3525b;

            public C0585a(C0593c.C0602h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f3524a = hVar;
                this.f3525b = threadPoolExecutor;
            }

            /* renamed from: a */
            public void mo5605a(Throwable th) {
                try {
                    this.f3524a.mo5605a(th);
                } finally {
                    this.f3525b.shutdown();
                }
            }

            /* renamed from: b */
            public void mo5606b(C0610f fVar) {
                try {
                    this.f3524a.mo5606b(fVar);
                } finally {
                    this.f3525b.shutdown();
                }
            }
        }

        public C0584b(Context context) {
            this.f3523a = context.getApplicationContext();
        }

        /* renamed from: a */
        public void mo5603a(C0593c.C0602h hVar) {
            ThreadPoolExecutor b = jo0.m20286b("EmojiCompatInitializer");
            b.execute(new bo1(this, hVar, b));
        }

        /* renamed from: c */
        public void m4494d(C0593c.C0602h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C0607e a = C0587a.m4499a(this.f3523a);
                if (a != null) {
                    a.mo5651c(threadPoolExecutor);
                    a.mo5638a().mo5603a(new C0585a(hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                hVar.mo5605a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    public static class C0586c implements Runnable {
        public void run() {
            try {
                os6.m24033a("EmojiCompat.EmojiCompatInitializer.run");
                if (C0593c.m4521h()) {
                    C0593c.m4517b().mo5623k();
                }
            } finally {
                os6.m24034b();
            }
        }
    }

    /* renamed from: a */
    public List<Class<? extends fu2<?>>> mo5598a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean mo5599b(Context context) {
        C0593c.m4520g(new C0583a(context));
        mo5601d(context);
        return Boolean.TRUE;
    }

    /* renamed from: d */
    public void mo5601d(Context context) {
        final Lifecycle lifecycle = ((ug3) C1641bo.m11483e(context).mo11734f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo6295a(new w81() {
            /* renamed from: h */
            public /* synthetic */ void mo3766h(ug3 ug3) {
                v81.m28696e(this, ug3);
            }

            /* renamed from: k */
            public /* synthetic */ void mo3771k(ug3 ug3) {
                v81.m28693b(this, ug3);
            }

            /* renamed from: l */
            public void mo3772l(ug3 ug3) {
                EmojiCompatInitializer.this.mo5602e();
                lifecycle.mo6297c(this);
            }

            /* renamed from: p */
            public /* synthetic */ void mo3791p(ug3 ug3) {
                v81.m28697f(this, ug3);
            }

            /* renamed from: s */
            public /* synthetic */ void mo3795s(ug3 ug3) {
                v81.m28694c(this, ug3);
            }

            /* renamed from: x */
            public /* synthetic */ void mo3803x(ug3 ug3) {
                v81.m28692a(this, ug3);
            }
        });
    }

    /* renamed from: e */
    public void mo5602e() {
        jo0.m20288d().postDelayed(new C0586c(), 500);
    }
}
