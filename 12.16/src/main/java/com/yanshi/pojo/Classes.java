package com.yanshi.pojo;
//上面这个要改
public class Classes {
    private Integer id1;
    //数据库中要有id表示行号？行号自动标所以声明一个int的id1，但是后面不会给它赋值
    private String  id;
    private String name;
    private Integer num;
    private String teacher;
    private String pos;

    @Override
    public String toString() {
        return "Classes{" +
                "id1=" + id1 +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", teacher='" + teacher + '\'' +
                ", pos='" + pos + '\'' +
                '}';
    }

    public Integer getId1() {
        return id1;
    }

    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
}


