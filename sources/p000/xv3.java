package p000;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;

/* renamed from: xv3 */
/* compiled from: MinimalClassNameIdResolver */
public class xv3 extends qf0 {

    /* renamed from: d */
    public final String f19986d;

    /* renamed from: e */
    public final String f19987e;

    public xv3(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory, polymorphicTypeValidator);
        String name = javaType.getRawClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this.f19986d = "";
            this.f19987e = ".";
            return;
        }
        this.f19987e = name.substring(0, lastIndexOf + 1);
        this.f19986d = name.substring(0, lastIndexOf);
    }

    /* renamed from: j */
    public static xv3 m30325j(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new xv3(javaType, mapperConfig.getTypeFactory(), polymorphicTypeValidator);
    }

    /* renamed from: a */
    public String mo25084a(Object obj) {
        String name = obj.getClass().getName();
        if (name.startsWith(this.f19987e)) {
            return name.substring(this.f19987e.length() - 1);
        }
        return name;
    }

    /* renamed from: h */
    public JavaType mo25089h(String str, k21 k21) throws IOException {
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder(str.length() + this.f19986d.length());
            if (this.f19986d.isEmpty()) {
                sb.append(str.substring(1));
            } else {
                sb.append(this.f19986d);
                sb.append(str);
            }
            str = sb.toString();
        }
        return super.mo25089h(str, k21);
    }
}
