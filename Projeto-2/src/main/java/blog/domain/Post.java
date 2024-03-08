package blog.domain;

import java.util.Date;

public class Post {
    private Long id;
    private String title;
    private User author;
    private String content;
    private Date datePosted;

    public Post(String title, String content, Date datePosted) {
        this.title = title;
        this.content = content;
        this.datePosted = new Date();
    }

    public void validate() {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Título do post é obrigatório");
        }
        if (title.length() > 50) {
            throw new IllegalArgumentException("Título do post deve ter no máximo 50 caracteres");
        }
        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("Conteúdo do post é obrigatório");
        }
        if (content.length() > 250) {
            throw new IllegalArgumentException("Conteúdo do post deve ter no máximo 250 caracteres");
        }
        if (author == null || author.getNickname() == null || author.getNickname().isEmpty()) {
            throw new IllegalArgumentException("Autor do post é obrigatório");
        }

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    public void setId(long id) {
        this.id = id;
    }
}
