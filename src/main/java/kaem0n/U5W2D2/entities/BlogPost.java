package kaem0n.U5W2D2.entities;

import lombok.*;

import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BlogPost {
    private long id;
    private String category;
    private String title;
    private String coverUrl;
    private String content;
    private int readingTime;

    public BlogPost(String category, String title, String content, int readingTime) {
        this.category = category;
        this.title = title;
        this.content = content;
        this.readingTime = readingTime;
    }
}
