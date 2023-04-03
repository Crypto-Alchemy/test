package androidx.compose.p004ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.Lifecycle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.i06;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0012\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\"\u0010\r\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007\"&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\",\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00018F@FX\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\"\u0018\u0010\u001a\u001a\u00020\u0000*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001e\u0010\u001f\u001a\u00020\f*\u00020\u00008@X\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo44877d2 = {"Landroid/view/View;", "Lwn0;", "d", "Landroid/content/Context;", "applicationContext", "Lt86;", "", "e", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/compose/runtime/Recomposer;", "b", "", "a", "Ljava/util/Map;", "animationScale", "value", "f", "(Landroid/view/View;)Lwn0;", "i", "(Landroid/view/View;Lwn0;)V", "compositionContext", "g", "(Landroid/view/View;)Landroid/view/View;", "contentChild", "h", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt */
/* compiled from: WindowRecomposer.android.kt */
public final class WindowRecomposer_androidKt {

    /* renamed from: a */
    public static final Map<Context, t86<Float>> f2090a = new LinkedHashMap();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo44877d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lr37;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$a */
    /* compiled from: WindowRecomposer.android.kt */
    public static final class C0439a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f2091a;

        /* renamed from: d */
        public final /* synthetic */ Recomposer f2092d;

        public C0439a(View view, Recomposer recomposer) {
            this.f2091a = view;
            this.f2092d = recomposer;
        }

        public void onViewAttachedToWindow(View view) {
            vx2.m53591g(view, "v");
        }

        public void onViewDetachedFromWindow(View view) {
            vx2.m53591g(view, "v");
            this.f2091a.removeOnAttachStateChangeListener(this);
            this.f2092d.mo3090T();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, mo44877d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$b", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "Lr37;", "onChange", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$b */
    /* compiled from: WindowRecomposer.android.kt */
    public static final class C0440b extends ContentObserver {

        /* renamed from: a */
        public final /* synthetic */ fd0<r37> f2093a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0440b(fd0<r37> fd0, Handler handler) {
            super(handler);
            this.f2093a = fd0;
        }

        public void onChange(boolean z, Uri uri) {
            this.f2093a.mo52181o(r37.f33317a);
        }
    }

    /* renamed from: b */
    public static final Recomposer m3134b(View view, CoroutineContext coroutineContext, Lifecycle lifecycle) {
        PausableMonotonicFrameClock pausableMonotonicFrameClock;
        CoroutineContext coroutineContext2;
        vx2.m53591g(view, "<this>");
        vx2.m53591g(coroutineContext, "coroutineContext");
        if (coroutineContext.get(ps0.f32794h) == null || coroutineContext.get(yx3.f20400n) == null) {
            coroutineContext = AndroidUiDispatcher.f1997H.mo3897a().plus(coroutineContext);
        }
        yx3 yx3 = (yx3) coroutineContext.get(yx3.f20400n);
        if (yx3 != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(yx3);
            pausableMonotonicFrameClock2.mo3042f();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T t = (ly3) coroutineContext.get(ly3.f14745o);
        if (t == null) {
            t = new my3();
            ref$ObjectRef.element = t;
        }
        if (pausableMonotonicFrameClock != null) {
            coroutineContext2 = pausableMonotonicFrameClock;
        } else {
            coroutineContext2 = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext plus = coroutineContext.plus(coroutineContext2).plus(t);
        Recomposer recomposer = new Recomposer(plus);
        hu0 a = iu0.m59111a(plus);
        if (lifecycle == null) {
            ug3 a2 = me7.m22274a(view);
            if (a2 != null) {
                lifecycle = a2.getLifecycle();
            } else {
                lifecycle = null;
            }
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new C0439a(view, recomposer));
            lifecycle.mo6295a(new C0441xff837ba9(a, pausableMonotonicFrameClock, recomposer, ref$ObjectRef, view));
            return recomposer;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    /* renamed from: c */
    public static /* synthetic */ Recomposer m3135c(View view, CoroutineContext coroutineContext, Lifecycle lifecycle, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            lifecycle = null;
        }
        return m3134b(view, coroutineContext, lifecycle);
    }

    /* renamed from: d */
    public static final wn0 m3136d(View view) {
        vx2.m53591g(view, "<this>");
        wn0 f = m3138f(view);
        if (f != null) {
            return f;
        }
        ViewParent parent = view.getParent();
        while (f == null && (parent instanceof View)) {
            f = m3138f((View) parent);
            parent = parent.getParent();
        }
        return f;
    }

    /* renamed from: e */
    public static final t86<Float> m3137e(Context context) {
        t86<Float> t86;
        Map<Context, t86<Float>> map = f2090a;
        synchronized (map) {
            t86<Float> t862 = map.get(context);
            if (t862 == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                fd0 b = od0.m70236b(-1, (BufferOverflow) null, (rc2) null, 6, (Object) null);
                t862 = e52.m57206G(e52.m57228t(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new C0440b(b, rk2.m26266a(Looper.getMainLooper())), b, context, (ns0<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1>) null)), iu0.m59112b(), i06.C7198a.m58757b(i06.f38305a, 0, 0, 3, (Object) null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, t862);
            }
            t86 = t862;
        }
        return t86;
    }

    /* renamed from: f */
    public static final wn0 m3138f(View view) {
        vx2.m53591g(view, "<this>");
        Object tag = view.getTag(o35.androidx_compose_ui_view_composition_context);
        if (tag instanceof wn0) {
            return (wn0) tag;
        }
        return null;
    }

    /* renamed from: g */
    public static final View m3139g(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            View view3 = view2;
            parent = view2.getParent();
            view = view3;
        }
        return view;
    }

    /* renamed from: h */
    public static final Recomposer m3140h(View view) {
        vx2.m53591g(view, "<this>");
        if (view.isAttachedToWindow()) {
            View g = m3139g(view);
            wn0 f = m3138f(g);
            if (f == null) {
                return WindowRecomposerPolicy.f2086a.mo3968a(g);
            }
            if (f instanceof Recomposer) {
                return (Recomposer) f;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
        }
        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
    }

    /* renamed from: i */
    public static final void m3141i(View view, wn0 wn0) {
        vx2.m53591g(view, "<this>");
        view.setTag(o35.androidx_compose_ui_view_composition_context, wn0);
    }
}
