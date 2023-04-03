package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class TokenFilter {

    /* renamed from: a */
    public static final TokenFilter f9844a = new TokenFilter();

    public enum Inclusion {
        ONLY_INCLUDE_ALL,
        INCLUDE_ALL_AND_PATH,
        INCLUDE_NON_NULL
    }

    /* renamed from: a */
    public boolean mo14032a() {
        return true;
    }

    /* renamed from: b */
    public void mo14033b() {
    }

    /* renamed from: c */
    public TokenFilter mo14034c() {
        return this;
    }

    /* renamed from: d */
    public TokenFilter mo14035d() {
        return this;
    }

    /* renamed from: e */
    public TokenFilter mo14036e(int i) {
        return this;
    }

    /* renamed from: f */
    public TokenFilter mo14037f(String str) {
        return this;
    }

    /* renamed from: g */
    public TokenFilter mo14038g(int i) {
        return this;
    }

    /* renamed from: h */
    public boolean mo14039h(JsonParser jsonParser) throws IOException {
        return mo14032a();
    }

    public String toString() {
        if (this == f9844a) {
            return "TokenFilter.INCLUDE_ALL";
        }
        return super.toString();
    }
}
