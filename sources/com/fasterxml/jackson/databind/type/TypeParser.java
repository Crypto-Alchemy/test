package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TypeParser implements Serializable {
    private static final long serialVersionUID = 1;
    public final TypeFactory _factory;

    /* renamed from: com.fasterxml.jackson.databind.type.TypeParser$a */
    public static final class C2055a extends StringTokenizer {

        /* renamed from: a */
        public final String f10160a;

        /* renamed from: b */
        public int f10161b;

        /* renamed from: c */
        public String f10162c;

        public C2055a(String str) {
            super(str, "<,>", true);
            this.f10160a = str;
        }

        /* renamed from: a */
        public String mo16941a() {
            return this.f10160a;
        }

        /* renamed from: b */
        public String mo16942b() {
            return this.f10160a.substring(this.f10161b);
        }

        /* renamed from: c */
        public void mo16943c(String str) {
            this.f10162c = str;
        }

        public boolean hasMoreTokens() {
            if (this.f10162c != null || super.hasMoreTokens()) {
                return true;
            }
            return false;
        }

        public String nextToken() {
            String str = this.f10162c;
            if (str != null) {
                this.f10162c = null;
                return str;
            }
            String nextToken = super.nextToken();
            this.f10161b += nextToken.length();
            return nextToken.trim();
        }
    }

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    public IllegalArgumentException _problem(C2055a aVar, String str) {
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", new Object[]{aVar.mo16941a(), aVar.mo16942b(), str}));
    }

    public Class<?> findClass(String str, C2055a aVar) {
        try {
            return this._factory.findClass(str);
        } catch (Exception e) {
            wf0.m29519j0(e);
            throw _problem(aVar, "Cannot locate class '" + str + "', problem: " + e.getMessage());
        }
    }

    public JavaType parse(String str) throws IllegalArgumentException {
        C2055a aVar = new C2055a(str.trim());
        JavaType parseType = parseType(aVar);
        if (!aVar.hasMoreTokens()) {
            return parseType;
        }
        throw _problem(aVar, "Unexpected tokens after complete type");
    }

    public JavaType parseType(C2055a aVar) throws IllegalArgumentException {
        if (aVar.hasMoreTokens()) {
            Class<?> findClass = findClass(aVar.nextToken(), aVar);
            if (aVar.hasMoreTokens()) {
                String nextToken = aVar.nextToken();
                if ("<".equals(nextToken)) {
                    return this._factory._fromClass((tf0) null, findClass, TypeBindings.create(findClass, parseTypes(aVar)));
                }
                aVar.mo16943c(nextToken);
            }
            return this._factory._fromClass((tf0) null, findClass, TypeBindings.emptyBindings());
        }
        throw _problem(aVar, "Unexpected end-of-string");
    }

    public List<JavaType> parseTypes(C2055a aVar) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (aVar.hasMoreTokens()) {
            arrayList.add(parseType(aVar));
            if (!aVar.hasMoreTokens()) {
                break;
            }
            String nextToken = aVar.nextToken();
            if (">".equals(nextToken)) {
                return arrayList;
            }
            if (!",".equals(nextToken)) {
                throw _problem(aVar, "Unexpected token '" + nextToken + "', expected ',' or '>')");
            }
        }
        throw _problem(aVar, "Unexpected end-of-string");
    }

    public TypeParser withFactory(TypeFactory typeFactory) {
        if (typeFactory == this._factory) {
            return this;
        }
        return new TypeParser(typeFactory);
    }
}
