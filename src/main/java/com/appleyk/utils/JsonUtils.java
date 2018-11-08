package com.appleyk.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author 苏州中科蓝迪
 */
public class JsonUtils {

    /**
     * 定义jackson对象
     */
    private static final ObjectMapper MAPPER = new ObjectMapper();

    static {
        // 忽略JSON中没有的字段，防止反序列化对象的时候报找不到属性字段的异常
        MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 如果json字符串中含有新行时，加上这个
        MAPPER.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        //空值转换异常
        MAPPER.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
    }

    /**
     * 将对象转换成json字符串。
     * <p>
     * Title: pojoToJson
     * </p>
     * <p>
     * Description:
     * </p>
     *
     * @param data
     * @return
     */
    public static String objectToJson(Object data) {
        try {
            String string = MAPPER.writeValueAsString(data);
            return string;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将json结果集转化为对象
     *
     * @param jsonData json数据
     * @return
     */
    public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
        try {
            T t = MAPPER.readValue(jsonData, beanType);
            return t;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将json数据转换成pojo对象list
     * <p>
     * Title: jsonToList
     * </p>
     * <p>
     * Description:
     * </p>
     *
     * @param jsonData
     * @param beanType
     * @return
     */
    public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) {
        JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
        try {
            return MAPPER.readValue(jsonData, javaType);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * json字符串转Map
     * 2015年4月3日上午10:41:25
     * auther:shijing
     *
     * @param jsonStr
     * @return
     * @throws IOException
     */
    @SuppressWarnings("unchecked")
    public static Map<String, Object> parseMap(String jsonStr) throws IOException {
        Map<String, Object> map = MAPPER.readValue(jsonStr, Map.class);
        return map;
    }

    public static List<String> parseList(String jsonStr) throws IOException {
        return MAPPER.readValue(jsonStr, new TypeReference<List<String>>() {});
    }
}