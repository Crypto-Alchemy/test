package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class InetSocketAddressSerializer extends StdScalarSerializer<InetSocketAddress> {
    public InetSocketAddressSerializer() {
        super(InetSocketAddress.class);
    }

    public void serialize(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        String str;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int indexOf = hostName.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0) {
                if (address instanceof Inet6Address) {
                    str = "[" + hostName.substring(1) + "]";
                } else {
                    str = hostName.substring(1);
                }
                hostName = str;
            } else {
                hostName = hostName.substring(0, indexOf);
            }
        }
        jsonGenerator.mo13860Z0(hostName + ":" + inetSocketAddress.getPort());
    }

    public void serializeWithType(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23020f(inetSocketAddress, InetSocketAddress.class, JsonToken.VALUE_STRING));
        serialize(inetSocketAddress, jsonGenerator, zw5);
        m17.mo16713h(jsonGenerator, g);
    }
}
