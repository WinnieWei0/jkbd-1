package com.example.administrator.myapplication.bean;

/**
 * Created by Administrator on 2017/6/29.
 */

public class Information {

    /**
     * id : 145
     * question : 这个标志是何含义？
     * answer : 1
     * item1 : 最低限速50公里/小时
     * item2 : 高度限速50公里/小时
     * item3 : 水平高度50米
     * item4 : 海拔高度50米
     * explains : 表示机动车驶入前方道路之最低时速限制。此标志设在高速公路或其他道路限速路段的起点。高度限速标志是白底红字。
     * url : http://images.juheapi.com/jztk/c1c2subject1/145.jpg
     */

    private int id;
    private String question;
    private String answer;
    private String item1;
    private String item2;
    private String item3;
    private String item4;
    private String explains;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public String getItem3() {
        return item3;
    }

    public void setItem3(String item3) {
        this.item3 = item3;
    }

    public String getItem4() {
        return item4;
    }

    public void setItem4(String item4) {
        this.item4 = item4;
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}