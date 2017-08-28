package com.ginkgocap.ywxt.track.web.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * Created by gintong on 2017/8/23.
 */
public class TimestampJsonDeserializer extends JsonDeserializer<Timestamp> {
    public static final SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    public Timestamp deserialize(JsonParser jsonParser,DeserializationContext deserializationContext)
            throws IOException,JsonProcessingException
    {
        try
        {
            return new Timestamp(format.parse(jsonParser.getText()).getTime());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
