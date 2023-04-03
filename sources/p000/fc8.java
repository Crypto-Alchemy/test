package p000;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;
import org.web3j.abi.datatypes.Utf8String;

/* renamed from: fc8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class fc8 extends l98 {
    public fc8() {
        this.f31222a.add(zzbl.ASSIGN);
        this.f31222a.add(zzbl.CONST);
        this.f31222a.add(zzbl.CREATE_ARRAY);
        this.f31222a.add(zzbl.CREATE_OBJECT);
        this.f31222a.add(zzbl.EXPRESSION_LIST);
        this.f31222a.add(zzbl.GET);
        this.f31222a.add(zzbl.GET_INDEX);
        this.f31222a.add(zzbl.GET_PROPERTY);
        this.f31222a.add(zzbl.NULL);
        this.f31222a.add(zzbl.SET_PROPERTY);
        this.f31222a.add(zzbl.TYPEOF);
        this.f31222a.add(zzbl.UNDEFINED);
        this.f31222a.add(zzbl.VAR);
    }

    /* renamed from: a */
    public final r88 mo28916a(String str, ps8 ps8, List<r88> list) {
        String str2;
        zzbl zzbl = zzbl.ADD;
        int ordinal = gv8.m44950e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            gv8.m44946a(zzbl.ASSIGN.name(), 2, list);
            r88 a = ps8.mo46865a(list.get(0));
            if (!(a instanceof b98)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{a.getClass().getCanonicalName()}));
            } else if (ps8.mo46868d(a.zzc())) {
                r88 a2 = ps8.mo46865a(list.get(1));
                ps8.mo46869e(a.zzc(), a2);
                return a2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{a.zzc()}));
            }
        } else if (ordinal == 14) {
            gv8.m44947b(zzbl.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                int i2 = 0;
                while (i2 < list.size() - 1) {
                    r88 a3 = ps8.mo46865a(list.get(i2));
                    if (a3 instanceof b98) {
                        ps8.mo46871g(a3.zzc(), ps8.mo46865a(list.get(i2 + 1)));
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{a3.getClass().getCanonicalName()}));
                    }
                }
                return r88.f33330g1;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            gv8.m44947b(zzbl.EXPRESSION_LIST.name(), 1, list);
            r88 r88 = r88.f33330g1;
            while (i < list.size()) {
                r88 = ps8.mo46865a(list.get(i));
                if (!(r88 instanceof y68)) {
                    i++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return r88;
        } else if (ordinal == 33) {
            gv8.m44946a(zzbl.GET.name(), 1, list);
            r88 a4 = ps8.mo46865a(list.get(0));
            if (a4 instanceof b98) {
                return ps8.mo46872h(a4.zzc());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{a4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            gv8.m44946a(zzbl.NULL.name(), 0, list);
            return r88.f33331h1;
        } else if (ordinal == 58) {
            gv8.m44946a(zzbl.SET_PROPERTY.name(), 3, list);
            r88 a5 = ps8.mo46865a(list.get(0));
            r88 a6 = ps8.mo46865a(list.get(1));
            r88 a7 = ps8.mo46865a(list.get(2));
            if (a5 == r88.f33330g1 || a5 == r88.f33331h1) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{a6.zzc(), a5.zzc()}));
            }
            if ((a5 instanceof k68) && (a6 instanceof e78)) {
                ((k68) a5).mo44671A(a6.mo29499b().intValue(), a7);
            } else if (a5 instanceof y78) {
                ((y78) a5).mo41863k(a6.zzc(), a7);
            }
            return a7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    gv8.m44946a(zzbl.GET_PROPERTY.name(), 2, list);
                    r88 a8 = ps8.mo46865a(list.get(0));
                    r88 a9 = ps8.mo46865a(list.get(1));
                    if ((a8 instanceof k68) && gv8.m44949d(a9)) {
                        return ((k68) a8).mo44685w(a9.mo29499b().intValue());
                    }
                    if (a8 instanceof y78) {
                        return ((y78) a8).mo41862j(a9.zzc());
                    }
                    if (a8 instanceof b98) {
                        if ("length".equals(a9.zzc())) {
                            return new e78(Double.valueOf((double) a8.zzc().length()));
                        }
                        if (gv8.m44949d(a9) && a9.mo29499b().doubleValue() < ((double) a8.zzc().length())) {
                            return new b98(String.valueOf(a8.zzc().charAt(a9.mo29499b().intValue())));
                        }
                    }
                    return r88.f33330g1;
                }
                switch (ordinal) {
                    case 62:
                        gv8.m44946a(zzbl.TYPEOF.name(), 1, list);
                        r88 a10 = ps8.mo46865a(list.get(0));
                        if (a10 instanceof f98) {
                            str2 = "undefined";
                        } else if (a10 instanceof s68) {
                            str2 = "boolean";
                        } else if (a10 instanceof e78) {
                            str2 = "number";
                        } else if (a10 instanceof b98) {
                            str2 = Utf8String.TYPE_NAME;
                        } else if (a10 instanceof l88) {
                            str2 = "function";
                        } else if ((a10 instanceof u88) || (a10 instanceof y68)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{a10}));
                        } else {
                            str2 = "object";
                        }
                        return new b98(str2);
                    case 63:
                        gv8.m44946a(zzbl.UNDEFINED.name(), 0, list);
                        return r88.f33330g1;
                    case 64:
                        gv8.m44947b(zzbl.VAR.name(), 1, list);
                        for (r88 a11 : list) {
                            r88 a12 = ps8.mo46865a(a11);
                            if (a12 instanceof b98) {
                                ps8.mo46870f(a12.zzc(), r88.f33330g1);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{a12.getClass().getCanonicalName()}));
                            }
                        }
                        return r88.f33330g1;
                    default:
                        return super.mo45390b(str);
                }
            } else if (list.isEmpty()) {
                return new d88();
            } else {
                if (list.size() % 2 == 0) {
                    d88 d88 = new d88();
                    while (i < list.size() - 1) {
                        r88 a13 = ps8.mo46865a(list.get(i));
                        r88 a14 = ps8.mo46865a(list.get(i + 1));
                        if ((a13 instanceof y68) || (a14 instanceof y68)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        d88.mo41863k(a13.zzc(), a14);
                        i += 2;
                    }
                    return d88;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new k68();
        } else {
            k68 k68 = new k68();
            for (r88 a15 : list) {
                r88 a16 = ps8.mo46865a(a15);
                if (!(a16 instanceof y68)) {
                    k68.mo44671A(i, a16);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return k68;
        }
    }
}
