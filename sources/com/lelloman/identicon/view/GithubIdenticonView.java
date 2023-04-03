package com.lelloman.identicon.view;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¨\u0006\u000e"}, mo44877d2 = {"Lcom/lelloman/identicon/view/GithubIdenticonView;", "Lcom/lelloman/identicon/view/IdenticonView;", "", "width", "height", "hash", "Lug2;", "b", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "library-identicon_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: GithubIdenticonView.kt */
public final class GithubIdenticonView extends IdenticonView {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GithubIdenticonView(Context context) {
        this(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
        vx2.m53591g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GithubIdenticonView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: b */
    public ug2 mo38364a(int i, int i2, int i3) {
        return new ug2(i, i2, i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GithubIdenticonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        vx2.m53591g(context, "context");
    }
}
