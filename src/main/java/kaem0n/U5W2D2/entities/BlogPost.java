package kaem0n.U5W2D2.entities;

import lombok.*;

import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BlogPost {
    @Setter(AccessLevel.NONE)
    private long id;
    private String category;
    private String title;
    private String coverUrl;
    private String content;
    private int readingTime;

    public BlogPost(String category, String title, String content, int readingTime) {
        this.id = new Random().nextLong();
        this.category = category;
        this.title = title;
        this.coverUrl = "https://picsum.photos/500";
        this.content = content;
        this.readingTime = readingTime;
    }
}
