package androidx.compose.p004ui.platform;

import android.view.View;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, mo44877d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "Lr37;", "a", "DisposeOnDetachedFromWindowOrReleasedFromPool", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy */
/* compiled from: ViewCompositionStrategy.android.kt */
public interface ViewCompositionStrategy {

    /* renamed from: a */
    public static final C0432a f2061a = C0432a.f2065a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo44877d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "Lr37;", "a", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool */
    /* compiled from: ViewCompositionStrategy.android.kt */
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {

        /* renamed from: b */
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool f2062b = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo44877d2 = {"androidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lr37;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$a */
        /* compiled from: ViewCompositionStrategy.android.kt */
        public static final class C0430a implements View.OnAttachStateChangeListener {

            /* renamed from: a */
            public final /* synthetic */ AbstractComposeView f2063a;

            public C0430a(AbstractComposeView abstractComposeView) {
                this.f2063a = abstractComposeView;
            }

            public void onViewAttachedToWindow(View view) {
                vx2.m53591g(view, "v");
            }

            public void onViewDetachedFromWindow(View view) {
                vx2.m53591g(view, "v");
                if (!vs4.m29093d(this.f2063a)) {
                    this.f2063a.mo3679e();
                }
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo44877d2 = {"Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
        /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$b */
        /* compiled from: ViewCompositionStrategy.android.kt */
        public static final class C0431b implements ws4 {

            /* renamed from: a */
            public final /* synthetic */ AbstractComposeView f2064a;

            public C0431b(AbstractComposeView abstractComposeView) {
                this.f2064a = abstractComposeView;
            }
        }

        /* renamed from: a */
        public pc2<r37> mo3945a(AbstractComposeView abstractComposeView) {
            vx2.m53591g(abstractComposeView, "view");
            C0430a aVar = new C0430a(abstractComposeView);
            abstractComposeView.addOnAttachStateChangeListener(aVar);
            C0431b bVar = new C0431b(abstractComposeView);
            vs4.m29090a(abstractComposeView, bVar);
            return new C0433x11b1833b(abstractComposeView, aVar, bVar);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$a;", "", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "a", "()Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Default", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$a */
    /* compiled from: ViewCompositionStrategy.android.kt */
    public static final class C0432a {

        /* renamed from: a */
        public static final /* synthetic */ C0432a f2065a = new C0432a();

        /* renamed from: a */
        public final ViewCompositionStrategy mo3948a() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.f2062b;
        }
    }

    /* renamed from: a */
    pc2<r37> mo3945a(AbstractComposeView abstractComposeView);
}
