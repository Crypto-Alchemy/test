package androidx.compose.p004ui.text.font;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import p000.fu0;
import p000.t27;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\fB\u001b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, mo44877d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "", "Ls27;", "typefaceRequest", "Lfp4;", "platformFontLoader", "Lkotlin/Function1;", "Lt27$b;", "Lr37;", "onAsyncCompletion", "createDefaultTypeface", "Lt27;", "a", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lhu0;", "b", "Lhu0;", "asyncLoadScope", "Lkotlin/coroutines/CoroutineContext;", "injectedContext", "<init>", "(Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/coroutines/CoroutineContext;)V", "c", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
public final class FontListFontFamilyTypefaceAdapter {

    /* renamed from: c */
    public static final C0459a f2201c = new C0459a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final g72 f2202d = new g72();

    /* renamed from: e */
    public static final fu0 f2203e = new C0460b(fu0.f37916i);

    /* renamed from: a */
    public final AsyncTypefaceCache f2204a;

    /* renamed from: b */
    public hu0 f2205b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$a;", "", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$a */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    public static final class C0459a {
        public C0459a() {
        }

        public /* synthetic */ C0459a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, mo44877d2 = {"androidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$b", "Lz5;", "Lfu0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "Lr37;", "q", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$b */
    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class C0460b extends C6754z5 implements fu0 {
        public C0460b(fu0.C7105a aVar) {
            super(aVar);
        }

        /* renamed from: q */
        public void mo4113q(CoroutineContext coroutineContext, Throwable th) {
        }
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext coroutineContext) {
        vx2.m53591g(asyncTypefaceCache, "asyncTypefaceCache");
        vx2.m53591g(coroutineContext, "injectedContext");
        this.f2204a = asyncTypefaceCache;
        this.f2205b = iu0.m59111a(f2203e.plus(coroutineContext).plus(qd6.m71249a((y23) coroutineContext.get(y23.f46117l))));
    }

    /* renamed from: a */
    public t27 mo4112a(s27 s27, fp4 fp4, rc2<? super t27.C3322b, r37> rc2, rc2<? super s27, ? extends Object> rc22) {
        s27 s272 = s27;
        fp4 fp42 = fp4;
        rc2<? super s27, ? extends Object> rc23 = rc22;
        vx2.m53591g(s272, "typefaceRequest");
        vx2.m53591g(fp42, "platformFontLoader");
        vx2.m53591g(rc2, "onAsyncCompletion");
        vx2.m53591g(rc23, "createDefaultTypeface");
        if (!(s27.mo25615c() instanceof d72)) {
            return null;
        }
        Pair a = e72.m15967b(f2202d.mo20412a(((d72) s27.mo25615c()).mo18545k(), s27.mo25619f(), s27.mo25616d()), s272, this.f2204a, fp42, rc23);
        List list = (List) a.component1();
        Object component2 = a.component2();
        if (list == null) {
            return new t27.C3322b(component2, false, 2, (DefaultConstructorMarker) null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, component2, s27, this.f2204a, rc2, fp4);
        y23 unused = d50.m56748b(this.f2205b, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, (ns0<? super FontListFontFamilyTypefaceAdapter$resolve$1>) null), 1, (Object) null);
        return new t27.C3321a(asyncFontListLoader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext);
    }
}
