package com.phani.restfulwebservices.controllers;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.phani.restfulwebservices.input.Anime;
import com.phani.restfulwebservices.input.Top;
import com.phani.restfulwebservices.output.OutputJsonFormat;
import com.phani.restfulwebservices.output.Result;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimeController {
    private static ObjectMapper objectMapper;
    private static Anime anime = null;
    private static List<Top> topList = null;
    private static OutputJsonFormat outputJsonFormat = null;
    static {
        objectMapper = new ObjectMapper();
    }

    private static String getJsonObject(String type) throws IOException {
        String API_URL = "https://api.jikan.moe/v3/top/anime/1/" + type;
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(API_URL).get().build();
        String JsonSource = client.newCall(request).execute().body().string();
        return JsonSource;
    }

    private static void deserialize(String src) throws JsonProcessingException {
        anime = objectMapper.readValue(src, Anime.class);
        topList = anime.getTop();
    }

    private static void serialize(Integer size){
        outputJsonFormat = new OutputJsonFormat();
        List<Result> outputList = new ArrayList<>();
        for(Integer index=0; index<size; index++){
            Top obj = topList.get(index);
            boolean isAiring = (obj.getEnd_date()!=null) ? false : true;
            outputList.add(new Result(obj.getRank(), obj.getTitle(), obj.getImage_url(), obj.getType(), obj.getEpisodes(), isAiring, obj.getScore()));
        }
        outputJsonFormat.setTop(outputList);
    }

    @GetMapping("/")
    public String apiDetails() throws IOException {
        FileReader fr = new FileReader("src//main//resources//templates//api.json");
        StringBuffer sb = new StringBuffer();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) (ch));
        }
        fr.close();
        return sb.toString();
    }

    @GetMapping(value = { "/tv"})
    public OutputJsonFormat getBestofTvAnime(@RequestParam(name = "size", required = false) Integer size) throws IOException {
        String jsonSource = getJsonObject("tv");
        deserialize(jsonSource);
        if (size == null) {
            size = 15;
        }else if(size>50){
            return new OutputJsonFormat();
        }
        serialize(size);
        return outputJsonFormat;
    }

    @GetMapping(value = { "/movies"})
    public OutputJsonFormat getBestofAnimatedMovies(@RequestParam(name = "size", required = false) Integer size) throws IOException {
        String jsonSource = getJsonObject("movie");
        deserialize(jsonSource);
        if (size == null) {
            size = 15;
        }
        serialize(size);
        return outputJsonFormat;
    }

    @GetMapping(value = { "/airing"})
    public OutputJsonFormat getBestofCurrentAnimes(@RequestParam(name = "size", required = false) Integer size) throws IOException {
        String jsonSource = getJsonObject("airing");
        deserialize(jsonSource);
        if (size == null) {
            size = 15;
        }
        serialize(size);
        return outputJsonFormat;
    }

    @GetMapping(value = { "/upcoming"})
    public OutputJsonFormat getBestofUpcomingAnimes(@RequestParam(name = "size", required = false) Integer size) throws IOException {
        String jsonSource = getJsonObject("upcoming");
        deserialize(jsonSource);
        if (size == null) {
            size = 15;
        }
        serialize(size);
        return outputJsonFormat;
    }

    @GetMapping(value = { "/ova"})
    public OutputJsonFormat getBestofOVAAnimes(@RequestParam(name = "size", required = false) Integer size) throws IOException {
        String jsonSource = getJsonObject("ova");
        deserialize(jsonSource);
        if (size == null) {
            size = 15;
        }
        serialize(size);
        return outputJsonFormat;
    }

    @GetMapping(value = { "/special"})
    public OutputJsonFormat getBestofSpecialAnimes(@RequestParam(name = "size", required = false) Integer size) throws IOException {
        String jsonSource = getJsonObject("special");
        deserialize(jsonSource);
        if (size == null) {
            size = 15;
        }
        serialize(size);
        return outputJsonFormat;
    }
}
