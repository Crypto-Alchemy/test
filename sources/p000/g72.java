package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p000.r72;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, mo44877d2 = {"Lg72;", "", "", "Ly62;", "fontList", "Lr72;", "fontWeight", "Ln72;", "fontStyle", "a", "(Ljava/util/List;Lr72;I)Ljava/util/List;", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: g72 */
/* compiled from: FontMatcher.kt */
public final class g72 {
    /* renamed from: a */
    public final List<y62> mo20412a(List<? extends y62> list, r72 r72, int i) {
        vx2.m53591g(list, "fontList");
        vx2.m53591g(r72, "fontWeight");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= size) {
                break;
            }
            Object obj = list.get(i3);
            y62 y62 = (y62) obj;
            if (!vx2.m53586b(y62.mo22749b(), r72) || !n72.m22833e(y62.mo22750c(), i)) {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
            i3++;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        r37 r37 = r37.f33317a;
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj2 = list.get(i4);
            if (n72.m22833e(((y62) obj2).mo22750c(), i)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        r72.C3185a aVar = r72.f17161d;
        r72 r722 = null;
        if (r72.compareTo(aVar.mo25349b()) < 0) {
            int size3 = list.size();
            r72 r723 = null;
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    break;
                }
                r72 b = ((y62) list.get(i5)).mo22749b();
                if (b.compareTo(r72) >= 0) {
                    if (b.compareTo(r72) <= 0) {
                        r723 = b;
                        r722 = r723;
                        break;
                    } else if (r723 == null || b.compareTo(r723) < 0) {
                        r723 = b;
                    }
                } else if (r722 == null || b.compareTo(r722) > 0) {
                    r722 = b;
                }
                i5++;
            }
            if (r722 != null) {
                r723 = r722;
            }
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i2 < size4) {
                Object obj3 = list.get(i2);
                if (vx2.m53586b(((y62) obj3).mo22749b(), r723)) {
                    arrayList3.add(obj3);
                }
                i2++;
            }
            return arrayList3;
        } else if (r72.compareTo(aVar.mo25350c()) > 0) {
            int size5 = list.size();
            r72 r724 = null;
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    break;
                }
                r72 b2 = ((y62) list.get(i6)).mo22749b();
                if (b2.compareTo(r72) >= 0) {
                    if (b2.compareTo(r72) <= 0) {
                        r724 = b2;
                        r722 = r724;
                        break;
                    } else if (r724 == null || b2.compareTo(r724) < 0) {
                        r724 = b2;
                    }
                } else if (r722 == null || b2.compareTo(r722) > 0) {
                    r722 = b2;
                }
                i6++;
            }
            if (r724 == null) {
                r724 = r722;
            }
            ArrayList arrayList4 = new ArrayList(list.size());
            int size6 = list.size();
            while (i2 < size6) {
                Object obj4 = list.get(i2);
                if (vx2.m53586b(((y62) obj4).mo22749b(), r724)) {
                    arrayList4.add(obj4);
                }
                i2++;
            }
            return arrayList4;
        } else {
            r72 c = aVar.mo25350c();
            int size7 = list.size();
            r72 r725 = null;
            r72 r726 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size7) {
                    break;
                }
                r72 b3 = ((y62) list.get(i7)).mo22749b();
                if (c == null || b3.compareTo(c) <= 0) {
                    if (b3.compareTo(r72) >= 0) {
                        if (b3.compareTo(r72) <= 0) {
                            r725 = b3;
                            r726 = r725;
                            break;
                        } else if (r726 == null || b3.compareTo(r726) < 0) {
                            r726 = b3;
                        }
                    } else if (r725 == null || b3.compareTo(r725) > 0) {
                        r725 = b3;
                    }
                }
                i7++;
            }
            if (r726 != null) {
                r725 = r726;
            }
            ArrayList arrayList5 = new ArrayList(list.size());
            int size8 = list.size();
            for (int i8 = 0; i8 < size8; i8++) {
                Object obj5 = list.get(i8);
                if (vx2.m53586b(((y62) obj5).mo22749b(), r725)) {
                    arrayList5.add(obj5);
                }
            }
            if (!arrayList5.isEmpty()) {
                return arrayList5;
            }
            r72 c2 = r72.f17161d.mo25350c();
            int size9 = list.size();
            r72 r727 = null;
            int i9 = 0;
            while (true) {
                if (i9 >= size9) {
                    break;
                }
                r72 b4 = ((y62) list.get(i9)).mo22749b();
                if (c2 == null || b4.compareTo(c2) >= 0) {
                    if (b4.compareTo(r72) >= 0) {
                        if (b4.compareTo(r72) <= 0) {
                            r722 = b4;
                            r727 = r722;
                            break;
                        } else if (r727 == null || b4.compareTo(r727) < 0) {
                            r727 = b4;
                        }
                    } else if (r722 == null || b4.compareTo(r722) > 0) {
                        r722 = b4;
                    }
                }
                i9++;
            }
            if (r727 != null) {
                r722 = r727;
            }
            ArrayList arrayList6 = new ArrayList(list.size());
            int size10 = list.size();
            while (i2 < size10) {
                Object obj6 = list.get(i2);
                if (vx2.m53586b(((y62) obj6).mo22749b(), r722)) {
                    arrayList6.add(obj6);
                }
                i2++;
            }
            return arrayList6;
        }
    }
}
