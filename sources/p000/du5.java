package p000;

import androidx.compose.p004ui.semantics.SemanticsProperties;
import androidx.compose.p004ui.semantics.SemanticsPropertyKey;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\"/\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\"/\u0010\u0010\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\n8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\"/\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\b\"2\u0010\u001b\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00158F@FX\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\"/\u0010\"\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c8F@FX\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\"/\u0010)\u001a\u00020#*\u00020\u00002\u0006\u0010\u0002\u001a\u00020#8F@FX\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(\"/\u0010-\u001a\u00020#*\u00020\u00002\u0006\u0010\u0002\u001a\u00020#8F@FX\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(\"2\u00101\u001a\u00020.*\u00020\u00002\u0006\u0010\u0002\u001a\u00020.8F@FX\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0018\"\u0004\b\u0003\u0010\u001a\"/\u00105\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\b\"/\u0010<\u001a\u000206*\u00020\u00002\u0006\u0010\u0002\u001a\u0002068F@FX\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u00109\"\u0004\b:\u0010;\"2\u0010C\u001a\u00020=*\u00020\u00002\u0006\u0010\u0002\u001a\u00020=8F@FX\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B\"2\u0010H\u001a\u00020D*\u00020\u00002\u0006\u0010\u0002\u001a\u00020D8F@FX\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0018\"\u0004\bG\u0010\u001a\"/\u0010L\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c8F@FX\u0002¢\u0006\u0012\n\u0004\bI\u0010\u0004\u001a\u0004\bJ\u0010\u001f\"\u0004\bK\u0010!\"/\u0010S\u001a\u00020M*\u00020\u00002\u0006\u0010\u0002\u001a\u00020M8F@FX\u0002¢\u0006\u0012\n\u0004\bN\u0010\u0004\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R\"/\u0010Z\u001a\u00020T*\u00020\u00002\u0006\u0010\u0002\u001a\u00020T8F@FX\u0002¢\u0006\u0012\n\u0004\bU\u0010\u0004\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y\"/\u0010a\u001a\u00020[*\u00020\u00002\u0006\u0010\u0002\u001a\u00020[8F@FX\u0002¢\u0006\u0012\n\u0004\b\\\u0010\u0004\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`\";\u0010i\u001a\b\u0012\u0004\u0012\u00020c0b*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020c0b8F@FX\u0002¢\u0006\u0012\n\u0004\bd\u0010\u0004\u001a\u0004\be\u0010f\"\u0004\bg\u0010h\"(\u0010m\u001a\u00020\u0001*\u00020\u00002\u0006\u0010j\u001a\u00020\u00018F@FX\u000e¢\u0006\f\u001a\u0004\bk\u0010\u0006\"\u0004\bl\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006n"}, mo44877d2 = {"Leu5;", "", "<set-?>", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getStateDescription", "(Leu5;)Ljava/lang/String;", "setStateDescription", "(Leu5;Ljava/lang/String;)V", "stateDescription", "Lmw4;", "c", "getProgressBarRangeInfo", "(Leu5;)Lmw4;", "setProgressBarRangeInfo", "(Leu5;Lmw4;)V", "progressBarRangeInfo", "d", "getPaneTitle", "setPaneTitle", "paneTitle", "Lri3;", "e", "getLiveRegion", "(Leu5;)I", "setLiveRegion-hR3wRGc", "(Leu5;I)V", "liveRegion", "", "f", "getFocused", "(Leu5;)Z", "setFocused", "(Leu5;Z)V", "focused", "Lrn5;", "g", "getHorizontalScrollAxisRange", "(Leu5;)Lrn5;", "setHorizontalScrollAxisRange", "(Leu5;Lrn5;)V", "horizontalScrollAxisRange", "h", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "verticalScrollAxisRange", "Lhh5;", "i", "getRole", "role", "j", "getTestTag", "setTestTag", "testTag", "Lrl;", "k", "getEditableText", "(Leu5;)Lrl;", "setEditableText", "(Leu5;Lrl;)V", "editableText", "Lao6;", "l", "getTextSelectionRange", "(Leu5;)J", "setTextSelectionRange-FDrldGo", "(Leu5;J)V", "textSelectionRange", "Lis2;", "m", "getImeAction", "setImeAction-4L7nppU", "imeAction", "n", "getSelected", "setSelected", "selected", "Lgj0;", "o", "getCollectionInfo", "(Leu5;)Lgj0;", "setCollectionInfo", "(Leu5;Lgj0;)V", "collectionInfo", "Lhj0;", "p", "getCollectionItemInfo", "(Leu5;)Lhj0;", "setCollectionItemInfo", "(Leu5;Lhj0;)V", "collectionItemInfo", "Landroidx/compose/ui/state/ToggleableState;", "q", "getToggleableState", "(Leu5;)Landroidx/compose/ui/state/ToggleableState;", "setToggleableState", "(Leu5;Landroidx/compose/ui/state/ToggleableState;)V", "toggleableState", "", "Lvx0;", "r", "getCustomActions", "(Leu5;)Ljava/util/List;", "setCustomActions", "(Leu5;Ljava/util/List;)V", "customActions", "value", "getContentDescription", "a", "contentDescription", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: du5 */
/* compiled from: SemanticsProperties.kt */
public final class du5 {

    /* renamed from: a */
    public static final /* synthetic */ i93<Object>[] f10876a;

    /* renamed from: b */
    public static final SemanticsPropertyKey f10877b;

    /* renamed from: c */
    public static final SemanticsPropertyKey f10878c;

    /* renamed from: d */
    public static final SemanticsPropertyKey f10879d;

    /* renamed from: e */
    public static final SemanticsPropertyKey f10880e;

    /* renamed from: f */
    public static final SemanticsPropertyKey f10881f;

    /* renamed from: g */
    public static final SemanticsPropertyKey f10882g;

    /* renamed from: h */
    public static final SemanticsPropertyKey f10883h;

    /* renamed from: i */
    public static final SemanticsPropertyKey f10884i;

    /* renamed from: j */
    public static final SemanticsPropertyKey f10885j;

    /* renamed from: k */
    public static final SemanticsPropertyKey f10886k;

    /* renamed from: l */
    public static final SemanticsPropertyKey f10887l;

    /* renamed from: m */
    public static final SemanticsPropertyKey f10888m;

    /* renamed from: n */
    public static final SemanticsPropertyKey f10889n;

    /* renamed from: o */
    public static final SemanticsPropertyKey f10890o;

    /* renamed from: p */
    public static final SemanticsPropertyKey f10891p;

    /* renamed from: q */
    public static final SemanticsPropertyKey f10892q;

    /* renamed from: r */
    public static final SemanticsPropertyKey f10893r = tt5.f18260a.mo26555c();

    static {
        Class<du5> cls = du5.class;
        f10876a = new i93[]{ua5.m52730e(new MutablePropertyReference1Impl(cls, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), ua5.m52730e(new MutablePropertyReference1Impl(cls, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};
        SemanticsProperties semanticsProperties = SemanticsProperties.f2125a;
        f10877b = semanticsProperties.mo4040s();
        f10878c = semanticsProperties.mo4036o();
        f10879d = semanticsProperties.mo4034m();
        f10880e = semanticsProperties.mo4033l();
        f10881f = semanticsProperties.mo4028g();
        f10882g = semanticsProperties.mo4030i();
        f10883h = semanticsProperties.mo4045x();
        f10884i = semanticsProperties.mo4037p();
        f10885j = semanticsProperties.mo4041t();
        f10886k = semanticsProperties.mo4026e();
        f10887l = semanticsProperties.mo4043v();
        f10888m = semanticsProperties.mo4031j();
        f10889n = semanticsProperties.mo4039r();
        f10890o = semanticsProperties.mo4022a();
        f10891p = semanticsProperties.mo4023b();
        f10892q = semanticsProperties.mo4044w();
    }

    /* renamed from: a */
    public static final void m15404a(eu5 eu5, String str) {
        vx2.m53591g(eu5, "<this>");
        vx2.m53591g(str, "value");
        eu5.mo19491e(SemanticsProperties.f2125a.mo4024c(), bk0.m32598e(str));
    }

    /* renamed from: b */
    public static final void m15405b(eu5 eu5, int i) {
        vx2.m53591g(eu5, "$this$role");
        f10884i.mo4059c(eu5, f10876a[7], hh5.m18893g(i));
    }
}
