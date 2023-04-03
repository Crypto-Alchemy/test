package net.safemoon.androidwallet.model.arguments;

import java.util.ArrayList;
import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/arguments/TokenTypes;", "Ljava/util/ArrayList;", "Lnet/safemoon/androidwallet/common/TokenType;", "Lkotlin/collections/ArrayList;", "Ljava/io/Serializable;", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Arguments.kt */
public final class TokenTypes extends ArrayList<TokenType> {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof TokenType)) {
            return false;
        }
        return contains((TokenType) obj);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof TokenType)) {
            return -1;
        }
        return indexOf((TokenType) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof TokenType)) {
            return -1;
        }
        return lastIndexOf((TokenType) obj);
    }

    public final /* bridge */ TokenType remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ TokenType removeAt(int i) {
        return (TokenType) super.remove(i);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(TokenType tokenType) {
        return super.contains(tokenType);
    }

    public /* bridge */ int indexOf(TokenType tokenType) {
        return super.indexOf(tokenType);
    }

    public /* bridge */ int lastIndexOf(TokenType tokenType) {
        return super.lastIndexOf(tokenType);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof TokenType)) {
            return false;
        }
        return remove((TokenType) obj);
    }

    public /* bridge */ boolean remove(TokenType tokenType) {
        return super.remove(tokenType);
    }
}
