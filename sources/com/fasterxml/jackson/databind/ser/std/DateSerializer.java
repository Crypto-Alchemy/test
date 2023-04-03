package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

@zz2
public class DateSerializer extends DateTimeSerializerBase<Date> {
    public static final DateSerializer instance = new DateSerializer();

    public DateSerializer() {
        this((Boolean) null, (DateFormat) null);
    }

    public DateSerializer(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    public long _timestamp(Date date) {
        if (date == null) {
            return 0;
        }
        return date.getTime();
    }

    public void serialize(Date date, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (_asTimestamp(zw5)) {
            jsonGenerator.mo13882i0(_timestamp(date));
        } else {
            _serializeAsString(date, jsonGenerator, zw5);
        }
    }

    public DateSerializer withFormat(Boolean bool, DateFormat dateFormat) {
        return new DateSerializer(bool, dateFormat);
    }
}
