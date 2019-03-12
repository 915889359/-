package com.henu.blog.domain;

import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @program: helloworld
 * @description:
 * @author: zhuyang
 * @create: 2019-03-11 13:08
 */

@Document(indexName = "blog", type = "blog")    // 文档
public class EsBlog implements Serializable {

    @Id     // 主键
    private String id;
    private String title;
    private String summary;
    private String content;

    protected EsBlog() {       // JPA规范要求，防止直接使用
    }

    public EsBlog(String title, String summary, String content) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "EsBlog{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
