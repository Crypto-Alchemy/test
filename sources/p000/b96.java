package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C0532a;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: b96 */
/* compiled from: StateSet */
public class b96 {

    /* renamed from: a */
    public int f8003a = -1;

    /* renamed from: b */
    public int f8004b = -1;

    /* renamed from: c */
    public int f8005c = -1;

    /* renamed from: d */
    public SparseArray<C1616a> f8006d = new SparseArray<>();

    /* renamed from: e */
    public SparseArray<C0532a> f8007e = new SparseArray<>();

    /* renamed from: b96$a */
    /* compiled from: StateSet */
    public static class C1616a {

        /* renamed from: a */
        public int f8008a;

        /* renamed from: b */
        public ArrayList<C1617b> f8009b = new ArrayList<>();

        /* renamed from: c */
        public int f8010c = -1;

        /* renamed from: d */
        public boolean f8011d;

        public C1616a(Context context, XmlPullParser xmlPullParser) {
            this.f8011d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), c65.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.State_android_id) {
                    this.f8008a = obtainStyledAttributes.getResourceId(index, this.f8008a);
                } else if (index == c65.State_constraints) {
                    this.f8010c = obtainStyledAttributes.getResourceId(index, this.f8010c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8010c);
                    context.getResources().getResourceName(this.f8010c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f8011d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo11457a(C1617b bVar) {
            this.f8009b.add(bVar);
        }

        /* renamed from: b */
        public int mo11458b(float f, float f2) {
            for (int i = 0; i < this.f8009b.size(); i++) {
                if (this.f8009b.get(i).mo11459a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: b96$b */
    /* compiled from: StateSet */
    public static class C1617b {

        /* renamed from: a */
        public float f8012a = Float.NaN;

        /* renamed from: b */
        public float f8013b = Float.NaN;

        /* renamed from: c */
        public float f8014c = Float.NaN;

        /* renamed from: d */
        public float f8015d = Float.NaN;

        /* renamed from: e */
        public int f8016e = -1;

        /* renamed from: f */
        public boolean f8017f;

        public C1617b(Context context, XmlPullParser xmlPullParser) {
            this.f8017f = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), c65.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.Variant_constraints) {
                    this.f8016e = obtainStyledAttributes.getResourceId(index, this.f8016e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8016e);
                    context.getResources().getResourceName(this.f8016e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f8017f = true;
                    }
                } else if (index == c65.Variant_region_heightLessThan) {
                    this.f8015d = obtainStyledAttributes.getDimension(index, this.f8015d);
                } else if (index == c65.Variant_region_heightMoreThan) {
                    this.f8013b = obtainStyledAttributes.getDimension(index, this.f8013b);
                } else if (index == c65.Variant_region_widthLessThan) {
                    this.f8014c = obtainStyledAttributes.getDimension(index, this.f8014c);
                } else if (index == c65.Variant_region_widthMoreThan) {
                    this.f8012a = obtainStyledAttributes.getDimension(index, this.f8012a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean mo11459a(float f, float f2) {
            if (!Float.isNaN(this.f8012a) && f < this.f8012a) {
                return false;
            }
            if (!Float.isNaN(this.f8013b) && f2 < this.f8013b) {
                return false;
            }
            if (!Float.isNaN(this.f8014c) && f > this.f8014c) {
                return false;
            }
            if (Float.isNaN(this.f8015d) || f2 <= this.f8015d) {
                return true;
            }
            return false;
        }
    }

    public b96(Context context, XmlPullParser xmlPullParser) {
        mo11454b(context, xmlPullParser);
    }

    /* renamed from: a */
    public int mo11453a(int i, int i2, float f, float f2) {
        C1616a aVar = this.f8006d.get(i2);
        if (aVar == null) {
            return i2;
        }
        if (f != -1.0f && f2 != -1.0f) {
            C1617b bVar = null;
            Iterator<C1617b> it = aVar.f8009b.iterator();
            while (it.hasNext()) {
                C1617b next = it.next();
                if (next.mo11459a(f, f2)) {
                    if (i == next.f8016e) {
                        return i;
                    }
                    bVar = next;
                }
            }
            if (bVar != null) {
                return bVar.f8016e;
            }
            return aVar.f8010c;
        } else if (aVar.f8010c == i) {
            return i;
        } else {
            Iterator<C1617b> it2 = aVar.f8009b.iterator();
            while (it2.hasNext()) {
                if (i == it2.next().f8016e) {
                    return i;
                }
            }
            return aVar.f8010c;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11454b(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)
            int[] r1 = p000.c65.StateSet
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = r2
        L_0x0010:
            if (r3 >= r1) goto L_0x0025
            int r4 = r0.getIndex(r3)
            int r5 = p000.c65.StateSet_defaultState
            if (r4 != r5) goto L_0x0022
            int r5 = r9.f8003a
            int r4 = r0.getResourceId(r4, r5)
            r9.f8003a = r4
        L_0x0022:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0025:
            r0.recycle()
            r0 = 0
            int r1 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
        L_0x002d:
            r3 = 1
            if (r1 == r3) goto L_0x00a8
            if (r1 == 0) goto L_0x0097
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r1 == r6) goto L_0x0047
            if (r1 == r5) goto L_0x003c
            goto L_0x009a
        L_0x003c:
            java.lang.String r1 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            boolean r1 = r4.equals(r1)     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            if (r1 == 0) goto L_0x009a
            return
        L_0x0047:
            java.lang.String r1 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            r7 = -1
            int r8 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            switch(r8) {
                case 80204913: goto L_0x006f;
                case 1301459538: goto L_0x0065;
                case 1382829617: goto L_0x005e;
                case 1901439077: goto L_0x0054;
                default: goto L_0x0053;
            }     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
        L_0x0053:
            goto L_0x0079
        L_0x0054:
            java.lang.String r3 = "Variant"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            if (r1 == 0) goto L_0x0079
            r3 = r5
            goto L_0x007a
        L_0x005e:
            boolean r1 = r1.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            if (r1 == 0) goto L_0x0079
            goto L_0x007a
        L_0x0065:
            java.lang.String r3 = "LayoutDescription"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            if (r1 == 0) goto L_0x0079
            r3 = r2
            goto L_0x007a
        L_0x006f:
            java.lang.String r3 = "State"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            if (r1 == 0) goto L_0x0079
            r3 = r6
            goto L_0x007a
        L_0x0079:
            r3 = r7
        L_0x007a:
            if (r3 == r6) goto L_0x008a
            if (r3 == r5) goto L_0x007f
            goto L_0x009a
        L_0x007f:
            b96$b r1 = new b96$b     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            r1.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            if (r0 == 0) goto L_0x009a
            r0.mo11457a(r1)     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            goto L_0x009a
        L_0x008a:
            b96$a r0 = new b96$a     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            r0.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            android.util.SparseArray<b96$a> r1 = r9.f8006d     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            int r3 = r0.f8008a     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            r1.put(r3, r0)     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            goto L_0x009a
        L_0x0097:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
        L_0x009a:
            int r1 = r11.next()     // Catch:{ XmlPullParserException -> 0x00a4, IOException -> 0x009f }
            goto L_0x002d
        L_0x009f:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00a8
        L_0x00a4:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.b96.mo11454b(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: c */
    public int mo11455c(int i, int i2, int i3) {
        return mo11456d(-1, i, (float) i2, (float) i3);
    }

    /* renamed from: d */
    public int mo11456d(int i, int i2, float f, float f2) {
        C1616a aVar;
        int b;
        if (i == i2) {
            if (i2 == -1) {
                aVar = this.f8006d.valueAt(0);
            } else {
                aVar = this.f8006d.get(this.f8004b);
            }
            if (aVar == null) {
                return -1;
            }
            if ((this.f8005c != -1 && aVar.f8009b.get(i).mo11459a(f, f2)) || i == (b = aVar.mo11458b(f, f2))) {
                return i;
            }
            if (b == -1) {
                return aVar.f8010c;
            }
            return aVar.f8009b.get(b).f8016e;
        }
        C1616a aVar2 = this.f8006d.get(i2);
        if (aVar2 == null) {
            return -1;
        }
        int b2 = aVar2.mo11458b(f, f2);
        if (b2 == -1) {
            return aVar2.f8010c;
        }
        return aVar2.f8009b.get(b2).f8016e;
    }
}
