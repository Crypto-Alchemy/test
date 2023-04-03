package com.google.protobuf;

import com.google.protobuf.C4956c0;

/* renamed from: com.google.protobuf.b */
/* compiled from: AbstractParser */
public abstract class C4953b<MessageType extends C4956c0> implements im4<MessageType> {

    /* renamed from: a */
    public static final C4987l f25592a = C4987l.m39771b();

    /* renamed from: d */
    public final MessageType mo37071d(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw mo37072e(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    /* renamed from: e */
    public final UninitializedMessageException mo37072e(MessageType messagetype) {
        if (messagetype instanceof C4949a) {
            return ((C4949a) messagetype).newUninitializedMessageException();
        }
        return new UninitializedMessageException((C4956c0) messagetype);
    }

    /* renamed from: f */
    public MessageType mo37070b(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
        return mo37071d(mo37077j(byteString, lVar));
    }

    /* renamed from: g */
    public MessageType mo37069a(byte[] bArr) throws InvalidProtocolBufferException {
        return mo37076i(bArr, f25592a);
    }

    /* renamed from: h */
    public MessageType mo37075h(byte[] bArr, int i, int i2, C4987l lVar) throws InvalidProtocolBufferException {
        return mo37071d(mo36912k(bArr, i, i2, lVar));
    }

    /* renamed from: i */
    public MessageType mo37076i(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
        return mo37075h(bArr, 0, bArr.length, lVar);
    }

    /* renamed from: j */
    public MessageType mo37077j(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
        MessageType messagetype;
        try {
            C4969g newCodedInput = byteString.newCodedInput();
            messagetype = (C4956c0) mo36911c(newCodedInput, lVar);
            newCodedInput.mo37246a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    /* renamed from: k */
    public abstract MessageType mo36912k(byte[] bArr, int i, int i2, C4987l lVar) throws InvalidProtocolBufferException;
}
