package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C0532a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: jq0 */
/* compiled from: ConstraintLayoutStates */
public class jq0 {

    /* renamed from: a */
    public final ConstraintLayout f13783a;

    /* renamed from: b */
    public C0532a f13784b;

    /* renamed from: c */
    public int f13785c = -1;

    /* renamed from: d */
    public int f13786d = -1;

    /* renamed from: e */
    public SparseArray<C2628a> f13787e = new SparseArray<>();

    /* renamed from: f */
    public SparseArray<C0532a> f13788f = new SparseArray<>();

    /* renamed from: jq0$a */
    /* compiled from: ConstraintLayoutStates */
    public static class C2628a {

        /* renamed from: a */
        public int f13789a;

        /* renamed from: b */
        public ArrayList<C2629b> f13790b = new ArrayList<>();

        /* renamed from: c */
        public int f13791c = -1;

        /* renamed from: d */
        public C0532a f13792d;

        public C2628a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), c65.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.State_android_id) {
                    this.f13789a = obtainStyledAttributes.getResourceId(index, this.f13789a);
                } else if (index == c65.State_constraints) {
                    this.f13791c = obtainStyledAttributes.getResourceId(index, this.f13791c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f13791c);
                    context.getResources().getResourceName(this.f13791c);
                    if ("layout".equals(resourceTypeName)) {
                        C0532a aVar = new C0532a();
                        this.f13792d = aVar;
                        aVar.mo5160o(context, this.f13791c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo22039a(C2629b bVar) {
            this.f13790b.add(bVar);
        }

        /* renamed from: b */
        public int mo22040b(float f, float f2) {
            for (int i = 0; i < this.f13790b.size(); i++) {
                if (this.f13790b.get(i).mo22041a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: jq0$b */
    /* compiled from: ConstraintLayoutStates */
    public static class C2629b {

        /* renamed from: a */
        public float f13793a = Float.NaN;

        /* renamed from: b */
        public float f13794b = Float.NaN;

        /* renamed from: c */
        public float f13795c = Float.NaN;

        /* renamed from: d */
        public float f13796d = Float.NaN;

        /* renamed from: e */
        public int f13797e = -1;

        /* renamed from: f */
        public C0532a f13798f;

        public C2629b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), c65.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.Variant_constraints) {
                    this.f13797e = obtainStyledAttributes.getResourceId(index, this.f13797e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f13797e);
                    context.getResources().getResourceName(this.f13797e);
                    if ("layout".equals(resourceTypeName)) {
                        C0532a aVar = new C0532a();
                        this.f13798f = aVar;
                        aVar.mo5160o(context, this.f13797e);
                    }
                } else if (index == c65.Variant_region_heightLessThan) {
                    this.f13796d = obtainStyledAttributes.getDimension(index, this.f13796d);
                } else if (index == c65.Variant_region_heightMoreThan) {
                    this.f13794b = obtainStyledAttributes.getDimension(index, this.f13794b);
                } else if (index == c65.Variant_region_widthLessThan) {
                    this.f13795c = obtainStyledAttributes.getDimension(index, this.f13795c);
                } else if (index == c65.Variant_region_widthMoreThan) {
                    this.f13793a = obtainStyledAttributes.getDimension(index, this.f13793a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean mo22041a(float f, float f2) {
            if (!Float.isNaN(this.f13793a) && f < this.f13793a) {
                return false;
            }
            if (!Float.isNaN(this.f13794b) && f2 < this.f13794b) {
                return false;
            }
            if (!Float.isNaN(this.f13795c) && f > this.f13795c) {
                return false;
            }
            if (Float.isNaN(this.f13796d) || f2 <= this.f13796d) {
                return true;
            }
            return false;
        }
    }

    public jq0(Context context, ConstraintLayout constraintLayout, int i) {
        this.f13783a = constraintLayout;
        mo22035a(context, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22035a(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)
            r0 = 0
            int r1 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x000d:
            r2 = 1
            if (r1 == r2) goto L_0x008c
            if (r1 == 0) goto L_0x007b
            r3 = 2
            if (r1 == r3) goto L_0x0017
            goto L_0x007e
        L_0x0017:
            java.lang.String r1 = r10.getName()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r4 = -1
            int r5 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r6 = 4
            r7 = 3
            switch(r5) {
                case -1349929691: goto L_0x004d;
                case 80204913: goto L_0x0043;
                case 1382829617: goto L_0x003a;
                case 1657696882: goto L_0x0030;
                case 1901439077: goto L_0x0026;
                default: goto L_0x0025;
            }     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x0025:
            goto L_0x0057
        L_0x0026:
            java.lang.String r2 = "Variant"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = r7
            goto L_0x0058
        L_0x0030:
            java.lang.String r2 = "layoutDescription"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 0
            goto L_0x0058
        L_0x003a:
            java.lang.String r5 = "StateSet"
            boolean r1 = r1.equals(r5)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0043:
            java.lang.String r2 = "State"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = r3
            goto L_0x0058
        L_0x004d:
            java.lang.String r2 = "ConstraintSet"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = r6
            goto L_0x0058
        L_0x0057:
            r2 = r4
        L_0x0058:
            if (r2 == r3) goto L_0x006e
            if (r2 == r7) goto L_0x0063
            if (r2 == r6) goto L_0x005f
            goto L_0x007e
        L_0x005f:
            r8.mo22036b(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x0063:
            jq0$b r1 = new jq0$b     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r1.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r0 == 0) goto L_0x007e
            r0.mo22039a(r1)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x006e:
            jq0$a r0 = new jq0$a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r0.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            android.util.SparseArray<jq0$a> r1 = r8.f13787e     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            int r2 = r0.f13789a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r1.put(r2, r0)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x007b:
            r10.getName()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x007e:
            int r1 = r10.next()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x000d
        L_0x0083:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x008c
        L_0x0088:
            r9 = move-exception
            r9.printStackTrace()
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jq0.mo22035a(android.content.Context, int):void");
    }

    /* renamed from: b */
    public final void mo22036b(Context context, XmlPullParser xmlPullParser) {
        int i;
        C0532a aVar = new C0532a();
        int attributeCount = xmlPullParser.getAttributeCount();
        int i2 = 0;
        while (i2 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i2++;
            } else {
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1 && attributeValue.length() > 1) {
                    i = Integer.parseInt(attributeValue.substring(1));
                }
                aVar.mo5147E(context, xmlPullParser);
                this.f13788f.put(i, aVar);
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo22037c(oq0 oq0) {
    }

    /* renamed from: d */
    public void mo22038d(int i, float f, float f2) {
        C0532a aVar;
        C2628a aVar2;
        int b;
        C0532a aVar3;
        int i2 = this.f13785c;
        if (i2 == i) {
            if (i == -1) {
                aVar2 = this.f13787e.valueAt(0);
            } else {
                aVar2 = this.f13787e.get(i2);
            }
            int i3 = this.f13786d;
            if ((i3 == -1 || !aVar2.f13790b.get(i3).mo22041a(f, f2)) && this.f13786d != (b = aVar2.mo22040b(f, f2))) {
                if (b == -1) {
                    aVar3 = this.f13784b;
                } else {
                    aVar3 = aVar2.f13790b.get(b).f13798f;
                }
                if (b != -1) {
                    int i4 = aVar2.f13790b.get(b).f13797e;
                }
                if (aVar3 != null) {
                    this.f13786d = b;
                    aVar3.mo5155i(this.f13783a);
                    return;
                }
                return;
            }
            return;
        }
        this.f13785c = i;
        C2628a aVar4 = this.f13787e.get(i);
        int b2 = aVar4.mo22040b(f, f2);
        if (b2 == -1) {
            aVar = aVar4.f13792d;
        } else {
            aVar = aVar4.f13790b.get(b2).f13798f;
        }
        if (b2 != -1) {
            int i5 = aVar4.f13790b.get(b2).f13797e;
        }
        if (aVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("NO Constraint set found ! id=");
            sb.append(i);
            sb.append(", dim =");
            sb.append(f);
            sb.append(", ");
            sb.append(f2);
            return;
        }
        this.f13786d = b2;
        aVar.mo5155i(this.f13783a);
    }
}
