package com.flinkhackathon.datagenerator.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Json工具类
 *
 * @author Defu Li
 * @since 2022/1/2 19:33
 */
public class JsonUtils {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     * 序列化
     *
     * @param obj 对象
     * @return 序列化字符串
     * @throws JsonProcessingException 异常
     */
    public static String writeValue(Object obj) throws JsonProcessingException {
        return OBJECT_MAPPER.writeValueAsString(obj);
    }

    /**
     * 反序列化
     *
     * @param message 字符串
     * @param clazz   类型
     * @param <T>     泛型
     * @return 结果类型
     * @throws IOException 异常
     */
    public static <T> T readValue(String message, Class<T> clazz) throws IOException {
        return OBJECT_MAPPER.readValue(message, clazz);
    }
}
