package net.safemoon.androidwallet.views;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u0012"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/FixedForAppBarLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "h2", "k2", "i2", "fromIndex", "toIndex", "", "isCompletely", "Landroid/view/View;", "V2", "child", "U2", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: FixedForAppBarLayoutManager.kt */
public final class FixedForAppBarLayoutManager extends LinearLayoutManager {
    public FixedForAppBarLayoutManager(Context context) {
        super(context);
    }

    /* renamed from: U2 */
    public final boolean mo62128U2(View view, boolean z) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        ViewParent parent = view.getParent();
        vx2.m53589e(parent, "null cannot be cast to non-null type android.view.View");
        Rect rect = new Rect();
        ((View) parent).getGlobalVisibleRect(rect);
        if (mo8930v2() == 0) {
            int i = iArr[0];
            int width = view.getWidth() + i;
            if (z) {
                if (i < rect.left || width > rect.right) {
                    return false;
                }
            } else if (i > rect.right || width < rect.left) {
                return false;
            }
        } else {
            int i2 = iArr[1];
            int height = view.getHeight() + i2;
            if (z) {
                if (i2 < rect.top || height > rect.bottom) {
                    return false;
                }
            } else if (i2 > rect.bottom || height < rect.top) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: V2 */
    public final View mo62129V2(int i, int i2, boolean z) {
        int i3;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View T = mo9231T(i);
            if (T != null) {
                if (mo62128U2(T, z)) {
                    return T;
                }
                i += i3;
            }
        }
        return null;
    }

    /* renamed from: h2 */
    public int mo8913h2() {
        View V2 = mo62129V2(0, mo9234U(), false);
        if (V2 == null) {
            return -1;
        }
        return mo9271o0(V2);
    }

    /* renamed from: i2 */
    public int mo8914i2() {
        View V2 = mo62129V2(mo9234U() - 1, -1, true);
        if (V2 == null) {
            return -1;
        }
        return mo9271o0(V2);
    }

    /* renamed from: k2 */
    public int mo8917k2() {
        View V2 = mo62129V2(mo9234U() - 1, -1, false);
        if (V2 == null) {
            return -1;
        }
        return mo9271o0(V2);
    }
}
