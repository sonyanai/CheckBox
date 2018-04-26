package jp.techacademy.son.checkbox;



import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class WeatherForecast {

    String count ="";
    public final List<Forecast> forecastList = new ArrayList<>();

    public WeatherForecast(JSONObject jsonObject) throws JSONException {

        JSONArray forecastArray = jsonObject.getJSONArray("data");

        //このlenが取得した都道府県の市区町村数
        //リストを作ってから渡すのを47回している

        int len = forecastArray.length();
        for (int i = 0; i < len; i++) {
            JSONObject forecastJson = forecastArray.getJSONObject(i);
            Forecast forecast = new Forecast(forecastJson);
            forecastList.add(forecast);
        }
        count += String.valueOf(len);
    }
    public static class Forecast{
        public final String id;
        public final String name;

        public Forecast(JSONObject jsonObject) throws  JSONException{
            id = jsonObject.getString("id");
            name = jsonObject.getString("name");
        }
    }
}
