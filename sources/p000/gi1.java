package p000;

import androidx.paging.DiffingChangePayload;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J8\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¨\u0006\u0013"}, mo44877d2 = {"Lgi1;", "", "T", "Ldi3;", "callback", "Lvb4;", "oldList", "newList", "Lr37;", "b", "", "startBoundary", "endBoundary", "start", "end", "payload", "a", "<init>", "()V", "paging-runtime_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: gi1 */
/* compiled from: NullPaddedListDiffHelper.kt */
public final class gi1 {

    /* renamed from: a */
    public static final gi1 f12323a = new gi1();

    /* renamed from: a */
    public final void mo20585a(di3 di3, int i, int i2, int i3, int i4, Object obj) {
        int i5 = i - i3;
        if (i5 > 0) {
            di3.onChanged(i3, i5, obj);
        }
        int i6 = i4 - i2;
        if (i6 > 0) {
            di3.onChanged(i2, i6, obj);
        }
    }

    /* renamed from: b */
    public final <T> void mo20586b(di3 di3, vb4<T> vb4, vb4<T> vb42) {
        vx2.m53591g(di3, "callback");
        vx2.m53591g(vb4, "oldList");
        vx2.m53591g(vb42, "newList");
        int max = Math.max(vb4.mo8712b(), vb42.mo8712b());
        int min = Math.min(vb4.mo8712b() + vb4.mo8711a(), vb42.mo8712b() + vb42.mo8711a());
        int i = min - max;
        if (i > 0) {
            di3.onRemoved(max, i);
            di3.onInserted(max, i);
        }
        int min2 = Math.min(max, min);
        di3 di32 = di3;
        int i2 = min2;
        int max2 = Math.max(max, min);
        mo20585a(di32, i2, max2, d75.m43385g(vb4.mo8712b(), vb42.getSize()), d75.m43385g(vb4.mo8712b() + vb4.mo8711a(), vb42.getSize()), DiffingChangePayload.ITEM_TO_PLACEHOLDER);
        mo20585a(di32, i2, max2, d75.m43385g(vb42.mo8712b(), vb4.getSize()), d75.m43385g(vb42.mo8712b() + vb42.mo8711a(), vb4.getSize()), DiffingChangePayload.PLACEHOLDER_TO_ITEM);
        int size = vb42.getSize() - vb4.getSize();
        if (size > 0) {
            di3.onInserted(vb4.getSize(), size);
        } else if (size < 0) {
            di3.onRemoved(vb4.getSize() + size, -size);
        }
    }
}
