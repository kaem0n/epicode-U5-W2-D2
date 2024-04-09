package kaem0n.U5W2D2.services;

import kaem0n.U5W2D2.entities.BlogPost;
import kaem0n.U5W2D2.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogPostService {
    private final List<BlogPost> postList = new ArrayList<>();

    public BlogPost save(BlogPost body) {
        this.postList.add(body);
        return body;
    }

    public BlogPost findById(long id) {
        BlogPost found = null;
        for (BlogPost post : this.postList) {
            if (post.getId() == id) found = post;
        }
        if (found == null) throw new NotFoundException(id);
        else return found;
    }

    public BlogPost update(long id, BlogPost updatedBody) {
        BlogPost found = this.findById(id);
        found.setCategory(updatedBody.getCategory());
        found.setTitle(updatedBody.getTitle());
        found.setContent(updatedBody.getContent());
        found.setCoverUrl(updatedBody.getCoverUrl());
        found.setReadingTime(updatedBody.getReadingTime());
        return found;
    }

    public void delete(long id) {
        BlogPost found = this.findById(id);
        this.postList.remove(found);
    }
}
