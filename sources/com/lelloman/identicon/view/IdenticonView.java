package com.lelloman.identicon.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H$R*\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, mo44877d2 = {"Lcom/lelloman/identicon/view/IdenticonView;", "Landroid/widget/ImageView;", "", "w", "h", "oldw", "oldh", "Lr37;", "onSizeChanged", "width", "height", "hash", "Lcq2;", "a", "value", "I", "getHash", "()I", "setHash", "(I)V", "d", "Lcq2;", "identiconDrawable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "library-identicon_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@SuppressLint({"AppCompatCustomView"})
/* compiled from: IdenticonView.kt */
public abstract class IdenticonView extends ImageView {

    /* renamed from: a */
    public int f25849a;

    /* renamed from: d */
    public cq2 f25850d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IdenticonView(Context context) {
        this(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
        vx2.m53591g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IdenticonView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    public abstract cq2 mo38364a(int i, int i2, int i3);

    public final int getHash() {
        return this.f25849a;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            cq2 a = mo38364a(getWidth(), getHeight(), this.f25849a);
            this.f25850d = a;
            setImageDrawable(a);
        }
    }

    public final void setHash(int i) {
        this.f25849a = i;
        cq2 cq2 = this.f25850d;
        if (cq2 != null) {
            cq2.mo41611e(i);
            invalidate();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Something went wrong when initializing ");
        r3.append(getClass().getName());
        r3.append(' ');
        r3.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        r2.recycle();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IdenticonView(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p000.vx2.m53591g(r2, r0)
            r1.<init>(r2, r3)
            if (r3 == 0) goto L_0x0047
            int[] r0 = p000.w55.IdenticonView
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            java.lang.String r3 = "context.obtainStyledAttr….styleable.IdenticonView)"
            p000.vx2.m53590f(r2, r3)
            int r3 = p000.w55.IdenticonView_hash     // Catch:{ all -> 0x0024 }
            int r0 = r1.f25849a     // Catch:{ all -> 0x0024 }
            int r3 = r2.getInt(r3, r0)     // Catch:{ all -> 0x0024 }
            r1.setHash(r3)     // Catch:{ all -> 0x0024 }
        L_0x0020:
            r2.recycle()
            goto L_0x0047
        L_0x0024:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r3.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "Something went wrong when initializing "
            r3.append(r0)     // Catch:{ all -> 0x0042 }
            java.lang.Class r0 = r1.getClass()     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0042 }
            r3.append(r0)     // Catch:{ all -> 0x0042 }
            r0 = 32
            r3.append(r0)     // Catch:{ all -> 0x0042 }
            r3.append(r1)     // Catch:{ all -> 0x0042 }
            goto L_0x0020
        L_0x0042:
            r3 = move-exception
            r2.recycle()
            throw r3
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lelloman.identicon.view.IdenticonView.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
