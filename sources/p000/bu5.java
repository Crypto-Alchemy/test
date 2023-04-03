package p000;

import android.graphics.Rect;
import androidx.compose.p004ui.semantics.SemanticsNode;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lbu5;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "a", "Landroidx/compose/ui/semantics/SemanticsNode;", "b", "()Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "adjustedBounds", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroid/graphics/Rect;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bu5 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class bu5 {

    /* renamed from: a */
    public final SemanticsNode f8263a;

    /* renamed from: b */
    public final Rect f8264b;

    public bu5(SemanticsNode semanticsNode, Rect rect) {
        vx2.m53591g(semanticsNode, "semanticsNode");
        vx2.m53591g(rect, "adjustedBounds");
        this.f8263a = semanticsNode;
        this.f8264b = rect;
    }

    /* renamed from: a */
    public final Rect mo11885a() {
        return this.f8264b;
    }

    /* renamed from: b */
    public final SemanticsNode mo11886b() {
        return this.f8263a;
    }
}
