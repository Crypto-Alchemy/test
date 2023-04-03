package p000;

import android.view.View;
import androidx.compose.p004ui.platform.WindowRecomposer_androidKt;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, mo44877d2 = {"Lpl7;", "", "Landroid/view/View;", "windowRootView", "Landroidx/compose/runtime/Recomposer;", "a", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: pl7 */
/* compiled from: WindowRecomposer.android.kt */
public interface pl7 {

    /* renamed from: a */
    public static final C3081a f16536a = C3081a.f16537a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bR\u001d\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo44877d2 = {"Lpl7$a;", "", "Lpl7;", "b", "Lpl7;", "a", "()Lpl7;", "getLifecycleAware$annotations", "()V", "LifecycleAware", "<init>", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: pl7$a */
    /* compiled from: WindowRecomposer.android.kt */
    public static final class C3081a {

        /* renamed from: a */
        public static final /* synthetic */ C3081a f16537a = new C3081a();

        /* renamed from: b */
        public static final pl7 f16538b = C3082a.f16539b;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo44877d2 = {"Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
        /* renamed from: pl7$a$a */
        /* compiled from: WindowRecomposer.android.kt */
        public static final class C3082a implements pl7 {

            /* renamed from: b */
            public static final C3082a f16539b = new C3082a();

            /* renamed from: a */
            public final Recomposer mo24640a(View view) {
                vx2.m53591g(view, "rootView");
                return WindowRecomposer_androidKt.m3135c(view, (CoroutineContext) null, (Lifecycle) null, 3, (Object) null);
            }
        }

        /* renamed from: a */
        public final pl7 mo24641a() {
            return f16538b;
        }
    }

    /* renamed from: a */
    Recomposer mo24640a(View view);
}
