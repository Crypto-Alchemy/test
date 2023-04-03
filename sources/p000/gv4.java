package p000;

import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lgv4;", "", "", "value", "Lr37;", "a", "", "b", "c", "d", "", "Ljava/util/List;", "list", "<init>", "(Ljava/util/List;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: gv4 */
/* compiled from: SlotTable.kt */
public final class gv4 {

    /* renamed from: a */
    public final List<Integer> f12615a;

    public gv4(List<Integer> list) {
        vx2.m53591g(list, "list");
        this.f12615a = list;
    }

    /* renamed from: a */
    public final void mo20853a(int i) {
        if (!this.f12615a.isEmpty()) {
            if (this.f12615a.get(0).intValue() != i) {
                List<Integer> list = this.f12615a;
                if (list.get(list.size() - 1).intValue() == i) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = this.f12615a.size();
        this.f12615a.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = this.f12615a.get(i2).intValue();
            if (i <= intValue) {
                break;
            }
            this.f12615a.set(size, Integer.valueOf(intValue));
            size = i2;
        }
        this.f12615a.set(size, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final boolean mo20854b() {
        return !this.f12615a.isEmpty();
    }

    /* renamed from: c */
    public final int mo20855c() {
        return ((Number) CollectionsKt___CollectionsKt.m47329Z(this.f12615a)).intValue();
    }

    /* renamed from: d */
    public final int mo20856d() {
        boolean z;
        int intValue;
        if (this.f12615a.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int intValue2 = this.f12615a.get(0).intValue();
            while ((!this.f12615a.isEmpty()) && this.f12615a.get(0).intValue() == intValue2) {
                List<Integer> list = this.f12615a;
                list.set(0, CollectionsKt___CollectionsKt.m47340k0(list));
                List<Integer> list2 = this.f12615a;
                list2.remove(list2.size() - 1);
                int size = this.f12615a.size();
                int size2 = this.f12615a.size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int intValue3 = this.f12615a.get(i).intValue();
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int intValue4 = this.f12615a.get(i3).intValue();
                    if (i2 < size && (intValue = this.f12615a.get(i2).intValue()) > intValue4) {
                        if (intValue <= intValue3) {
                            break;
                        }
                        this.f12615a.set(i, Integer.valueOf(intValue));
                        this.f12615a.set(i2, Integer.valueOf(intValue3));
                        i = i2;
                    } else if (intValue4 <= intValue3) {
                        break;
                    } else {
                        this.f12615a.set(i, Integer.valueOf(intValue4));
                        this.f12615a.set(i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                }
            }
            return intValue2;
        }
        ComposerKt.m2032x("Set is empty".toString());
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv4(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
