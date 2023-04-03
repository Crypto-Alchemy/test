package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class ConstraintAttribute {

    /* renamed from: a */
    public boolean f3060a;

    /* renamed from: b */
    public String f3061b;

    /* renamed from: c */
    public AttributeType f3062c;

    /* renamed from: d */
    public int f3063d;

    /* renamed from: e */
    public float f3064e;

    /* renamed from: f */
    public String f3065f;

    /* renamed from: g */
    public boolean f3066g;

    /* renamed from: h */
    public int f3067h;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintAttribute$a */
    public static /* synthetic */ class C0528a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3069a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3069a = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.REFERENCE_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3069a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3069a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3069a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3069a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f3069a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f3069a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f3069a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintAttribute.C0528a.<clinit>():void");
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
        this.f3061b = str;
        this.f3062c = attributeType;
        this.f3060a = z;
        mo5044l(obj);
    }

    /* renamed from: b */
    public static int m4118b(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* renamed from: c */
    public static HashMap<String, ConstraintAttribute> m4119c(HashMap<String, ConstraintAttribute> hashMap, View view) {
        HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(next);
            try {
                if (next.equals("BackgroundColor")) {
                    hashMap2.put(next, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(next, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + next, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: i */
    public static void m4120i(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> hashMap) {
        AttributeType attributeType;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), c65.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        AttributeType attributeType2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == c65.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == c65.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == c65.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == c65.CustomAttribute_customColorValue) {
                    attributeType = AttributeType.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == c65.CustomAttribute_customColorDrawableValue) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == c65.CustomAttribute_customPixelDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, Utils.FLOAT_EPSILON), context.getResources().getDisplayMetrics()));
                } else if (index == c65.CustomAttribute_customDimension) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, Utils.FLOAT_EPSILON));
                } else if (index == c65.CustomAttribute_customFloatValue) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == c65.CustomAttribute_customIntegerValue) {
                    attributeType = AttributeType.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == c65.CustomAttribute_customStringValue) {
                    attributeType = AttributeType.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == c65.CustomAttribute_customReference) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                attributeType2 = attributeType;
                obj = obj2;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: j */
    public static void m4121j(View view, HashMap<String, ConstraintAttribute> hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(next);
            if (!constraintAttribute.f3060a) {
                str = "set" + next;
            } else {
                str = next;
            }
            try {
                switch (C0528a.f3069a[constraintAttribute.f3062c.ordinal()]) {
                    case 1:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.f3063d)});
                        break;
                    case 2:
                        cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(constraintAttribute.f3066g)});
                        break;
                    case 3:
                        cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{constraintAttribute.f3065f});
                        break;
                    case 4:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.f3067h)});
                        break;
                    case 5:
                        Method method = cls.getMethod(str, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f3067h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 6:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.f3063d)});
                        break;
                    case 7:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(constraintAttribute.f3064e)});
                        break;
                    case 8:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(constraintAttribute.f3064e)});
                        break;
                }
            } catch (NoSuchMethodException e) {
                e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(next);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str);
            } catch (IllegalAccessException e2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" Custom Attribute \"");
                sb3.append(next);
                sb3.append("\" not found on ");
                sb3.append(cls.getName());
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(" Custom Attribute \"");
                sb4.append(next);
                sb4.append("\" not found on ");
                sb4.append(cls.getName());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo5037a(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f3061b;
        if (!this.f3060a) {
            str = "set" + str2;
        } else {
            str = str2;
        }
        try {
            switch (C0528a.f3069a[this.f3062c.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(this.f3063d)});
                    return;
                case 2:
                    cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(this.f3066g)});
                    return;
                case 3:
                    cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{this.f3065f});
                    return;
                case 4:
                    cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(this.f3067h)});
                    return;
                case 5:
                    Method method = cls.getMethod(str, new Class[]{Drawable.class});
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f3067h);
                    method.invoke(view, new Object[]{colorDrawable});
                    return;
                case 7:
                    cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(this.f3064e)});
                    return;
                case 8:
                    cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(this.f3064e)});
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e) {
            e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append(" Custom Attribute \"");
            sb.append(str2);
            sb.append("\" not found on ");
            sb.append(cls.getName());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" must have a method ");
            sb2.append(str);
        } catch (IllegalAccessException e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" Custom Attribute \"");
            sb3.append(str2);
            sb3.append("\" not found on ");
            sb3.append(cls.getName());
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(" Custom Attribute \"");
            sb4.append(str2);
            sb4.append("\" not found on ");
            sb4.append(cls.getName());
            e3.printStackTrace();
        }
    }

    /* renamed from: d */
    public AttributeType mo5038d() {
        return this.f3062c;
    }

    /* renamed from: e */
    public float mo5039e() {
        switch (C0528a.f3069a[this.f3062c.ordinal()]) {
            case 2:
                if (this.f3066g) {
                    return 1.0f;
                }
                return Utils.FLOAT_EPSILON;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return (float) this.f3063d;
            case 7:
                return this.f3064e;
            case 8:
                return this.f3064e;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: f */
    public void mo5040f(float[] fArr) {
        float f;
        switch (C0528a.f3069a[this.f3062c.ordinal()]) {
            case 2:
                if (this.f3066g) {
                    f = 1.0f;
                } else {
                    f = Utils.FLOAT_EPSILON;
                }
                fArr[0] = f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i = this.f3067h;
                float pow = (float) Math.pow((double) (((float) ((i >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i >> 8) & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) (i & 255)) / 255.0f), 2.2d);
                fArr[3] = ((float) ((i >> 24) & 255)) / 255.0f;
                return;
            case 6:
                fArr[0] = (float) this.f3063d;
                return;
            case 7:
                fArr[0] = this.f3064e;
                return;
            case 8:
                fArr[0] = this.f3064e;
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    public boolean mo5041g() {
        int i = C0528a.f3069a[this.f3062c.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public int mo5042h() {
        int i = C0528a.f3069a[this.f3062c.ordinal()];
        if (i == 4 || i == 5) {
            return 4;
        }
        return 1;
    }

    /* renamed from: k */
    public void mo5043k(View view, float[] fArr) {
        boolean z;
        View view2 = view;
        Class<?> cls = view.getClass();
        String str = "set" + this.f3061b;
        try {
            switch (C0528a.f3069a[this.f3062c.ordinal()]) {
                case 2:
                    Method method = cls.getMethod(str, new Class[]{Boolean.TYPE});
                    Object[] objArr = new Object[1];
                    if (fArr[0] > 0.5f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method.invoke(view2, objArr);
                    return;
                case 3:
                    throw new RuntimeException("unable to interpolate strings " + this.f3061b);
                case 4:
                    cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((m4118b((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m4118b((int) (fArr[3] * 255.0f)) << 24) | (m4118b((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m4118b((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)))});
                    return;
                case 5:
                    Method method2 = cls.getMethod(str, new Class[]{Drawable.class});
                    int b = m4118b((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                    int b2 = m4118b((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((b << 16) | (m4118b((int) (fArr[3] * 255.0f)) << 24) | (b2 << 8) | m4118b((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method2.invoke(view2, new Object[]{colorDrawable});
                    return;
                case 6:
                    cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((int) fArr[0])});
                    return;
                case 7:
                    cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                    return;
                case 8:
                    cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("no method ");
            sb.append(str);
            sb.append(" on View \"");
            sb.append(t21.m27246d(view));
            sb.append("\"");
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("cannot access method ");
            sb2.append(str);
            sb2.append(" on View \"");
            sb2.append(t21.m27246d(view));
            sb2.append("\"");
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: l */
    public void mo5044l(Object obj) {
        switch (C0528a.f3069a[this.f3062c.ordinal()]) {
            case 1:
            case 6:
                this.f3063d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f3066g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f3065f = (String) obj;
                return;
            case 4:
            case 5:
                this.f3067h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f3064e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f3064e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f3060a = false;
        this.f3061b = constraintAttribute.f3061b;
        this.f3062c = constraintAttribute.f3062c;
        mo5044l(obj);
    }
}
