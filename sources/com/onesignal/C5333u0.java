package com.onesignal;

import com.onesignal.C5327t;
import com.onesignal.OSTrigger;
import com.onesignal.OneSignal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.onesignal.u0 */
/* compiled from: OSTriggerController */
public class C5333u0 {

    /* renamed from: a */
    public C5327t f26550a;

    /* renamed from: b */
    public final ConcurrentHashMap<String, Object> f26551b = new ConcurrentHashMap<>();

    /* renamed from: com.onesignal.u0$a */
    /* compiled from: OSTriggerController */
    public static /* synthetic */ class C5334a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26552a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onesignal.OSTrigger$OSTriggerOperator[] r0 = com.onesignal.OSTrigger.OSTriggerOperator.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26552a = r0
                com.onesignal.OSTrigger$OSTriggerOperator r1 = com.onesignal.OSTrigger.OSTriggerOperator.EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26552a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.OSTrigger$OSTriggerOperator r1 = com.onesignal.OSTrigger.OSTriggerOperator.NOT_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26552a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onesignal.OSTrigger$OSTriggerOperator r1 = com.onesignal.OSTrigger.OSTriggerOperator.EXISTS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26552a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onesignal.OSTrigger$OSTriggerOperator r1 = com.onesignal.OSTrigger.OSTriggerOperator.CONTAINS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26552a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onesignal.OSTrigger$OSTriggerOperator r1 = com.onesignal.OSTrigger.OSTriggerOperator.NOT_EXISTS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26552a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onesignal.OSTrigger$OSTriggerOperator r1 = com.onesignal.OSTrigger.OSTriggerOperator.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f26552a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onesignal.OSTrigger$OSTriggerOperator r1 = com.onesignal.OSTrigger.OSTriggerOperator.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f26552a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.onesignal.OSTrigger$OSTriggerOperator r1 = com.onesignal.OSTrigger.OSTriggerOperator.LESS_THAN_OR_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f26552a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.onesignal.OSTrigger$OSTriggerOperator r1 = com.onesignal.OSTrigger.OSTriggerOperator.GREATER_THAN_OR_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5333u0.C5334a.<clinit>():void");
        }
    }

    public C5333u0(C5327t.C5330c cVar) {
        this.f26550a = new C5327t(cVar);
    }

    /* renamed from: a */
    public final boolean mo39120a(ArrayList<OSTrigger> arrayList) {
        Iterator<OSTrigger> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!mo39122c(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo39121b(bd4 bd4) {
        if (bd4.f21247c.size() == 0) {
            return true;
        }
        Iterator<ArrayList<OSTrigger>> it = bd4.f21247c.iterator();
        while (it.hasNext()) {
            if (mo39120a(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo39122c(OSTrigger oSTrigger) {
        OSTrigger.OSTriggerKind oSTriggerKind = oSTrigger.f25986b;
        if (oSTriggerKind == OSTrigger.OSTriggerKind.UNKNOWN) {
            return false;
        }
        if (oSTriggerKind != OSTrigger.OSTriggerKind.CUSTOM) {
            return this.f26550a.mo39116c(oSTrigger);
        }
        OSTrigger.OSTriggerOperator oSTriggerOperator = oSTrigger.f25988d;
        Object obj = this.f26551b.get(oSTrigger.f25987c);
        if (obj == null) {
            if (oSTriggerOperator == OSTrigger.OSTriggerOperator.NOT_EXISTS) {
                return true;
            }
            if (oSTriggerOperator != OSTrigger.OSTriggerOperator.NOT_EQUAL_TO || oSTrigger.f25989e == null) {
                return false;
            }
            return true;
        } else if (oSTriggerOperator == OSTrigger.OSTriggerOperator.EXISTS) {
            return true;
        } else {
            if (oSTriggerOperator == OSTrigger.OSTriggerOperator.NOT_EXISTS) {
                return false;
            }
            if (oSTriggerOperator != OSTrigger.OSTriggerOperator.CONTAINS) {
                if (obj instanceof String) {
                    Object obj2 = oSTrigger.f25989e;
                    if ((obj2 instanceof String) && mo39128i((String) obj2, (String) obj, oSTriggerOperator)) {
                        return true;
                    }
                }
                Object obj3 = oSTrigger.f25989e;
                if ((!(obj3 instanceof Number) || !(obj instanceof Number) || !mo39126g((Number) obj3, (Number) obj, oSTriggerOperator)) && !mo39125f(oSTrigger.f25989e, obj, oSTriggerOperator)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof Collection) || !((Collection) obj).contains(oSTrigger.f25989e)) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x001c A[LOOP:1: B:7:0x001c->B:21:0x001c, LOOP_END, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39123d(p000.bd4 r7, java.util.Collection<java.lang.String> r8) {
        /*
            r6 = this;
            java.util.ArrayList<java.util.ArrayList<com.onesignal.OSTrigger>> r0 = r7.f21247c
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.Iterator r8 = r8.iterator()
        L_0x000a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.ArrayList<java.util.ArrayList<com.onesignal.OSTrigger>> r2 = r7.f21247c
            java.util.Iterator r2 = r2.iterator()
        L_0x001c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x000a
            java.lang.Object r3 = r2.next()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x002c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x001c
            java.lang.Object r4 = r3.next()
            com.onesignal.OSTrigger r4 = (com.onesignal.OSTrigger) r4
            java.lang.String r5 = r4.f25987c
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0048
            java.lang.String r4 = r4.f25985a
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x002c
        L_0x0048:
            r7 = 1
            return r7
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5333u0.mo39123d(bd4, java.util.Collection):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0012 A[LOOP:0: B:5:0x0012->B:20:0x0012, LOOP_END, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39124e(p000.bd4 r5) {
        /*
            r4 = this;
            java.util.ArrayList<java.util.ArrayList<com.onesignal.OSTrigger>> r0 = r5.f21247c
            r1 = 0
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000c
            goto L_0x003b
        L_0x000c:
            java.util.ArrayList<java.util.ArrayList<com.onesignal.OSTrigger>> r5 = r5.f21247c
            java.util.Iterator r5 = r5.iterator()
        L_0x0012:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r5.next()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0012
            java.lang.Object r2 = r0.next()
            com.onesignal.OSTrigger r2 = (com.onesignal.OSTrigger) r2
            com.onesignal.OSTrigger$OSTriggerKind r2 = r2.f25986b
            com.onesignal.OSTrigger$OSTriggerKind r3 = com.onesignal.OSTrigger.OSTriggerKind.CUSTOM
            if (r2 == r3) goto L_0x0038
            com.onesignal.OSTrigger$OSTriggerKind r3 = com.onesignal.OSTrigger.OSTriggerKind.UNKNOWN
            if (r2 != r3) goto L_0x0022
        L_0x0038:
            return r1
        L_0x0039:
            r5 = 1
            return r5
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5333u0.mo39124e(bd4):boolean");
    }

    /* renamed from: f */
    public final boolean mo39125f(Object obj, Object obj2, OSTrigger.OSTriggerOperator oSTriggerOperator) {
        if (obj == null) {
            return false;
        }
        if (oSTriggerOperator.checksEquality()) {
            String obj3 = obj.toString();
            String obj4 = obj2.toString();
            if (obj2 instanceof Number) {
                obj4 = new DecimalFormat("0.#").format(obj2);
            }
            return mo39128i(obj3, obj4, oSTriggerOperator);
        } else if (!(obj2 instanceof String) || !(obj instanceof Number)) {
            return false;
        } else {
            return mo39127h((Number) obj, (String) obj2, oSTriggerOperator);
        }
    }

    /* renamed from: g */
    public final boolean mo39126g(Number number, Number number2, OSTrigger.OSTriggerOperator oSTriggerOperator) {
        double doubleValue = number.doubleValue();
        double doubleValue2 = number2.doubleValue();
        switch (C5334a.f26552a[oSTriggerOperator.ordinal()]) {
            case 1:
                if (doubleValue2 == doubleValue) {
                    return true;
                }
                return false;
            case 2:
                if (doubleValue2 != doubleValue) {
                    return true;
                }
                return false;
            case 3:
            case 4:
            case 5:
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                OneSignal.m40387d1(log_level, "Attempted to use an invalid operator with a numeric value: " + oSTriggerOperator.toString());
                return false;
            case 6:
                if (doubleValue2 < doubleValue) {
                    return true;
                }
                return false;
            case 7:
                if (doubleValue2 > doubleValue) {
                    return true;
                }
                return false;
            case 8:
                if (doubleValue2 < doubleValue || doubleValue2 == doubleValue) {
                    return true;
                }
                return false;
            case 9:
                int i = (doubleValue2 > doubleValue ? 1 : (doubleValue2 == doubleValue ? 0 : -1));
                if (i > 0 || i == 0) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: h */
    public final boolean mo39127h(Number number, String str, OSTrigger.OSTriggerOperator oSTriggerOperator) {
        try {
            return mo39126g(Double.valueOf(number.doubleValue()), Double.valueOf(Double.parseDouble(str)), oSTriggerOperator);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public final boolean mo39128i(String str, String str2, OSTrigger.OSTriggerOperator oSTriggerOperator) {
        int i = C5334a.f26552a[oSTriggerOperator.ordinal()];
        if (i == 1) {
            return str.equals(str2);
        }
        if (i == 2) {
            return !str.equals(str2);
        }
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
        OneSignal.m40387d1(log_level, "Attempted to use an invalid operator for a string trigger comparison: " + oSTriggerOperator.toString());
        return false;
    }
}
